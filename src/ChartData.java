
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author brennon.brimhall
 */
public class ChartData {
    //Charting data structures:
    XYSeries x;
    XYSeries V;
    XYSeries slipping;
    XYSeries a;
    XYSeries A;
    XYSeries Vm;
    
    
    public ChartData() {
        x = new XYSeries("Distance (ft)");
        V = new XYSeries("Speed (ft/s)");
        slipping = new XYSeries("Binary (0/1)");
        a = new XYSeries("Acceleration (ft/s/s)");
        A = new XYSeries("Current/10 (A)");
        Vm = new XYSeries("Voltage at Motors (V)");
    }
    
    public void xAdd(double t, double data){
        this.x.add(t, data);
    }
    
    public void VAdd(double t, double data){
        this.V.add(t, data);
    }
    
    public void slippingAdd(double t, double data){
        this.slipping.add(t, data);
    }
    
    public void aAdd(double t, double data){
        this.a.add(t, data);
    }
    
    public void AAdd(double t, double data){
        this.A.add(t, data);
    }
    
    public void VmAdd(double t, double data){
        this.Vm.add(t, data);
    }
    
    public XYSeries xGet(){
        return this.x;
    }
    
    public XYSeries VGet(){
        return this.V;
    }
    
    public XYSeries slippingGet(){
        return this.slipping;
    }
    
    public XYSeries aGet(){
        return this.a;
    }
    
    public XYSeries AGet(){
        return this.A;
    }
    
    public XYSeries VmGet(){
        return this.Vm;
    }
}

