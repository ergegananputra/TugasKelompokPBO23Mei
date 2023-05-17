package bangun3D;

import bangun2D.Persegi;

public abstract class Limas {
    private double tinggi;

    public Limas(double tinggi) {
        this.tinggi = tinggi;
    }


    public abstract double getLuasAlas();
    public abstract double getVolume();
    public abstract String toString();
    public double getTinggi() {
        return tinggi;
    }
}
