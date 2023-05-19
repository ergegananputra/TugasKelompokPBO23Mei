package bangun3D;
import Matematika.Matematika;

public class Kerucut {
    private double r;
    private double t;
    
    public Kerucut(double r, double t) {
        this.r = r;
        this.t = t;
    }
    
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public double getLuasAlas() {
        return Matematika.phi*r*r;
    }
    
    public double getSisiMiring() {
        return Matematika.getMiring(getR(), getT());
    }
    
    public double getLuas() {
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }
    
    public double getVolume() {
        return Matematika.phi*getR()*getR()*getT();
    }
    
    @Override
    public String toString() {
        return "Kerucut{" + "r=" + getR() + ", t=" + getT() + "}";
    }
}
