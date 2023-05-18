package bangun3D;

import bangun2D.Lingkaran;

public class LimasLingkaran extends Limas {
    private Lingkaran alas;

    public LimasLingkaran(double tinggi, Lingkaran alas) {
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
        return "LimasLingkaran{" +
                "alas=" + alas +
                ", tinggi=" + getTinggi() +
                '}';
    }
}
