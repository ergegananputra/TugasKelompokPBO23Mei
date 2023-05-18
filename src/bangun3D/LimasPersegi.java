package bangun3D;

import bangun2D.Persegi;

public class LimasPersegi extends Limas {
    private Persegi alas;

    public LimasPersegi(double tinggi, Persegi alas) {
        super(tinggi);
        this.alas = alas;
    }


    @Override
    public double getLuasAlas() {
        return alas.getLuas();
    }

    @Override
    public double getVolume() {
        return 1/3 * alas.getLuas() * getTinggi();
    }

    @Override
    public String toString() {
        return "LimasPersegi{" +
                "alas=" + alas +
                ", tinggi=" + getTinggi() +
                '}';
    }
}
