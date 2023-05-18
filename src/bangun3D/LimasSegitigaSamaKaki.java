package bangun3D;
import bangun2D.SegitigaSamaKaki;

public  class LimasSegitigaSamaKaki extends Limas {
    private SegitigaSamaKaki alas;
    public LimasSegitigaSamaKaki(double tinggi, SegitigaSamaKaki alas) {
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
