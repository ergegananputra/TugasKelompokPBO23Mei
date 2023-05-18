package bangun3D;

import bangun2D.SegitigaSiku;

public class LimasSegitigaSiku extends Limas{
    private SegitigaSiku alas;

    public LimasSegitigaSiku(double tinggi, SegitigaSiku alas) {
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
        return "LimasSegitigaSamaKaki{" +
                "alas=" + alas +
                ", tinggi=" + getTinggi() +
                '}';
    }
}

