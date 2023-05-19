package bangun2D;
import Matematika.Matematika;

public class Lingkaran {

    // Atributes
    private double r;

    // Constructor
    public Lingkaran(double r){
        this.r = r;
    }

    // Getter & Setter
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    // Methods
    public double getLuas(){
        return Matematika.phi*r*r;
    }
    public double getKeliling(){
        return 2*Matematika.phi*r;
    }
    @Override
    public String toString(){
        return "Lingkaran{" + "r=" + r + "}";
    }
}
