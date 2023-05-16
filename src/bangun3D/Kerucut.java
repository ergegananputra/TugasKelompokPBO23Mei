package bangun3D;

public class Kerucut {
    private double phi = 22.0/7;
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
        return phi*r*r;
    }
    
    public double getSisiMiring() {
        double s = getR()*getR() + getT()*getT();
        return Math.sqrt(s);
    }
    
    public double getLuas() {
        return getLuasAlas() + phi*getR()*getSisiMiring();
    }
    
    public double getVolume() {
        return phi*getR()*getR()*getT();
    }
    
    @Override
    public String toString() {
        return "Kerucut{" + "r=" + getR() + "t" + getT() + "}";
    }
}
