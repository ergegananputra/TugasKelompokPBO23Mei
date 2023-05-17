package bangun3D;

import bangun2D.SegitigaSamaSisi;

public class LimasSegitigaSamaSisi extends Limas {
    private SegitigaSamaSisi alas;

    public LimasSegitigaSamaSisi(double tinggi, SegitigaSamaSisi alas) {
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
        return "LimasSegitigaSamaSisi{" +
                "a alas = " + alas.getAlas() +
                " t alas = " + alas.getTinggi() +
                " tinggi = " + getTinggi() +
                '}';
    }
}


