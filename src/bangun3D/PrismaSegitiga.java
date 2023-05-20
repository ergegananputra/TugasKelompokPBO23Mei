package bangun3D;

import bangun2D.Segitiga;
import bangun2D.SegitigaSiku;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;

public class PrismaSegitiga {
    // Attributes
    private Segitiga alas;
    private double tinggi;

    // Constructor
    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Setter & Getter
    public Segitiga getAlas() {
        return alas;
    }
    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Method
    public double getVolume(){
        return alas.getLuas() * tinggi;
    }
    public double getLuas(){
        return 2 * alas.getLuas() + alas.getKeliling() * tinggi;
    }
    public String getDetailAlas(){
        if (alas instanceof SegitigaSiku){
            return "Segitiga Siku";
        } else if (alas instanceof SegitigaSamaKaki) {
            return "Segitiga Sama Kaki";
        } else if (alas instanceof SegitigaSamaSisi) {
            return "Segitiga Sama Sisi";
        } else{
            return "Segitiga";
        }
    }
    @Override
    public String toString() {
        return "PrismaSegitiga{" + "alas=" + alas + ", tinggi=" + tinggi + '}';
    }
}
