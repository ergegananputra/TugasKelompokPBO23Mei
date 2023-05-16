package bangun2D;
import java.lang.Math;

public class SegitigaSamaKaki extends Segitiga{
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(getAlas(), 2) + Math.pow(getTinggi(), 2));
        return sisiMiring * 2 + getAlas();
    }

    public double getLuas() {
        return getAlas() / 2 * getTinggi();
    }

    @Override
    public String toString() {
        return "SegitigaSamaKaki{" + "alas" + getAlas() +" lebar=" + getTinggi() + "}";
    }
}
