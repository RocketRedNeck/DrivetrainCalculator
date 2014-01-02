
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Derived from Ether's source code.
 * @author Brennon Brimhall
 */
public class Calculator {
    //Build:
    public final String version = "0.3.2";
    
    //File to print to:
    JFileChooser fileChooser;
    BufferedWriter writer;
    
    //Chart data
    ChartData data;
    
    // The following constants define the drivetrain being modeled:
    double Kro;     // rolling resistance tuning parameter, lbf
    double Krv;     // rolling resistance tuning parameter, lbf/(ft/sec)
    double Kf;      // drivetrain efficiency fraction

    double Vspec;   // motor spec volts
    double Tspec;   // motor stall torque, in_oz
    double Wspec;   // motor free speed, RPM
    double Ispec;   // motor stall amps
    double n;       // number of motors

    double G;       // gear ratio
    double r;       // wheel radius, inches

    double M;       // vehicle mass, lbm
    double uk;      // coefficient of kinetic friction
    double us;      // coefficient of static friction
    
    double Rcom;    // ohms, battery internal resistance plus
                    // wire and connection resistance
                    // from battery to PDB (including main breaker)
					 
    double Vbat;    // fully-charged open-circuit battery volts

    double Rone;    // ohms, circuit wiring and connector resistance
                    // from PDB to motor (including 40A breaker)
    
    double dt;      // integration step size, seconds
    double tstop;   // integration duration, seconds
    double xstop;   // maximum distance calculated
    
    // derived constants:
    double  Toffset, Tslope,    // offset and slope of adjusted Torque vs Speed motor curve
            Kt,     // motor torque constant, Nm/amp
            Vfree,  // vehicle speed at motor free speed, meters/sec
            W,      // vehicle weight, Newtons
            F2A;    // force to amps

    // working variables:
    boolean slipping = false;  // state variable, init to zero
    double Vm;      // Voltage at the motor
    double V = 0;   // vehicle speed, meters/sec
    double x = 0;   // vehicle distance traveled, meters
    double  t,      // elapsed time, seconds
            a,      // vehicle acceleration, meters/sec/sec
            A;      // motor current, amps
    
    public Calculator(
            double Kro, 
            double Krv, 
            double Kf, 
            double Vspec, 
            double Tspec,
            double Wspec,
            double Ispec, 
            int n,
            double G,
            double r,
            double M,
            double uk,
            double us, 
            double Rcom,
            double Vbat, 
            double Rone,
            double dt,
            double tstop,
            double xstop,
            File file){
       
        try {
            this.writer = new BufferedWriter(new FileWriter(file));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The file could not be found.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }

        //Setting up constants
        this.Kro = Kro;
        this.Krv = Krv;
        this.Kf = Kf;
        this.Vspec = Vspec;
        this.Tspec = Tspec;
        this.Wspec = Wspec;
        this.Ispec = Ispec;
        this.n = n;
        this.G = G;
        this.r = r;
        this.M = M;
        this.uk = uk;
        this.us = us;
        this.Rcom = Rcom;
        this.Vbat = Vbat;
        this.Rone = Rone;
        this.dt = dt;
        this.tstop = tstop;
        this.xstop = xstop;
        
        this.data = new ChartData();
    }
    
    public Calculator(Scenario s, File file){
        this(
                s.Kro, 
                s.Krv, 
                s.Kf, 
                s.Vspec, 
                s.Tspec, 
                s.Wspec, 
                s.Ispec, 
                s.n, 
                s.G, 
                s.r, 
                s.M, 
                s.uk, 
                s.us, 
                s.Rcom, 
                s.Vbat, 
                s.Rone, 
                s.dt, 
                s.tstop,
                s.xstop,
                file);
    }
    
    public void calculate(){
        printFirstLine();
        
        English2SI();
        
        // calculate Derived Constants once:
        Toffset = (Tspec*Vbat*Wspec)/(Vspec*Wspec+Ispec*Rone*Wspec+Ispec*n*Rcom*Wspec);
        Tslope = (Tspec*Vspec)/(Vspec*Wspec+Ispec*Rone*Wspec+Ispec*n*Rcom*Wspec);
        Kt = Tspec/Ispec;
        W = M*9.80665;
        F2A = r/(n*Kf*G*Kt); // vehicle total force to per-motor amps conversion

        a=accel(V); // compute accel at t=0
        print();    // output values at t=0
        
        final ChartData data = Heun();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChartWindow(data).setVisible(true);
            }
        });
    }
    
    private void English2SI() {
        Kro *= 4.448222;            // convert lbf to Newtons
        Krv *= 4.448222*3.28083;    // convert lbf/(ft/s) to Newtons/(meter/sec)
        //Ts *= 0.00706155;           // convert oz_in to Newton_meters
        //Mfree = Mfree/60*2*3.1415926536; // convert RPM to rad/sec
        Tspec *= 0.00706155;  // convert oz_in to Newton_meters
        Wspec = Wspec/60*2*3.1415926536; // convert RPM to rad/sec
        r = r*2.54/100;             // convert inches to meters
        M *= 0.4535924;             // convert lbm to kg
    }
    
    public double accel(double V) {
        double  Wm, // motor speed associated with vehicle speed
                L,  // rolling resistance losses, Newtons
                Tm, // motor torque, Newtons
                Tw, // wheel torque, Newtons
                Ft, // available vehicle force due to wheel torque, Newtons
                F,  // slip-adjusted vehicle force due to wheel torque, Newtons
                Fa; // vehicle accel force, Newtons
        
        Wm = V/r*G;
        
        Tm = Toffset-Tslope*Wm;     // available torque at motor @ V
        Tw = Kf*Tm*G;               // available torque at wheel @ V
        Ft = Tw/r*n;                // available force at wheels @ V
        
        if (Ft>W*us) {
            slipping = true;
        }else if (Ft<W*uk){
            slipping = false;
        }
        
        if (slipping){
            F=W*uk;
        } else {
            F=Ft;
        }
        
        A = F*F2A;
        
        Vm = Vbat-n*A*Rcom-A*Rone;  // computed here for output
        
        L = Kro+Krv*V;              // rolling resistance force
        Fa = F-L;                   // net force available for acceleration
        
        if (Fa<0){
            Fa=0;
        }
        return Fa/M;
    }
    
    public void print(){
        int slipping_int;
        
        if(slipping){
            slipping_int = 1;
        }else{
            slipping_int = 0;
        }
        try {
            writer.write(
                    String.format("%f,%f,%f,%d,%f,%f,%f\n",
                            t,x*3.28083,V*3.28083,slipping_int,a*3.28083,
                            n*A/10, Vm)
            );
            
            data.xAdd(t, x*3.28083);
            data.VAdd(t, V*3.28083);
            data.slippingAdd(t, slipping_int);
            data.aAdd(t, a*3.28083);
            data.AAdd(t, n*A/10);
            data.VmAdd(t, Vm);
            
            writer.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
    }
    
    public void printFirstLine(){
        try {
            writer.write(
                "t,feet,ft/s,slip,ft/s/s,amps/10,Vm, version="+version+" Kro="+Kro+" Krv="+Krv+" Kf="+Kf+" Vspec="+Vspec+" Tspec="+Tspec+" Wspec="+Wspec+" Ispec="+Ispec+" Rcom="+Rcom+" Vbat="+Vbat+" Rone="+Rone+" n="+n+" G="+G+" r="+r+" M="+M+" uk="+uk+" us="+us+"\n"
            );
            writer.flush();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
    }
    
    public ChartData Heun(){
        double Vtmp, atmp;          // local scratch variables
        
        for (t=dt; (t<=tstop && x<=xstop); t+=dt) {
            Vtmp = V+a*dt;          // kickstart with Euler step
            atmp = accel(Vtmp);
            Vtmp = V+(a+atmp)/2*dt; // recalc Vtmp trapezoidally
            a = accel(Vtmp);        // update a
            x+=(V+Vtmp)/2*dt;       // update x trapezoidally
            V=Vtmp;                 // update V
            print();
        } 
        try {
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "An IO Exception occurred.");
        }
        
        JOptionPane.showMessageDialog(null, "Final time is "+String.format("%.2f",t)+" seconds, final distance is "+String.format("%.2f",x*3.28083)+" feet.");
        
        return data;
    }
}