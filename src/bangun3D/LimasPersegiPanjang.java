package bangun3D;

import bangun2D.PersegiPanjang;

public class LimasPersegiPanjang extends Limas {
    private PersegiPanjang alas;

    public LimasPersegiPanjang(double tinggi, PersegiPanjang alas) {
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
        return "LimasPersegiPanjang{" +
                "alas=" + alas +
                ", tinggi=" + getTinggi() +
                '}';
    }
}
