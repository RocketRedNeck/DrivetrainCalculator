
import java.io.Serializable;
import org.jfree.data.xy.XYSeries;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brennon.brimhall
 */
public class Scenario implements Serializable {
    double Kro;
    double Krv; 
    double Kf; 
    double Vspec; 
    double Tspec;
    double Wspec;
    double Ispec; 
    int n;
    double G;
    double r;
    double M;
    double uk;
    double us; 
    double Rcom;
    double Vbat; 
    double Rone;
    double dt;
    double tstop;
    double xstop;
    
    public Scenario(
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
            double xstop){
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
    }
}
