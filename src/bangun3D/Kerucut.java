package bangun3D;
import Matematika.Matematika;

public class Kerucut extends Tabung{
    
    public Kerucut(double r, double tinggi) {
        super(r, tinggi);
    }
    
    public double getLuasAlas() {
        return Matematika.phi*getR()*getR();
    }
    
    public double getSisiMiring() {
        double a = getR() * getR() + getTinggi() * getTinggi();
        return Math.sqrt(a);
    }
    
    public double getLuas() {
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }
    
    public double getVolume() {
        return Matematika.phi*getR()*getR()*getTinggi()/3;
    }
    
    @Override
    public String toString() {
        return "Kerucut{" + "r=" + getR() + ", t=" + getTinggi() + "}";
    }
}
