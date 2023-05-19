package bangun2D;
import Matematika.Matematika;

import java.lang.Math;

public class SegitigaSamaKaki extends Segitiga{
    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }

    public double getSisiMiring() {
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }
    @Override
    public double getKeliling() {
        return getSisiMiring() * 2 + getAlas();
    }

    public double getLuas() {
        return getAlas() / 2 * getTinggi();
    }

    @Override
    public String toString() {
        return "SegitigaSamaKaki{" + "alas" + getAlas() +", lebar=" + getTinggi() + "}";
    }
}
