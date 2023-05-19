package bangun2D;

import Matematika.Matematika;

public class SegitigaSiku extends Segitiga {
    //Constructor
    public SegitigaSiku(double alas, double tinggi){
        super(alas, tinggi); 
    }

    //Methods
    @Override
    public double getKeliling() {
        return getAlas() + getTinggi() + getSisiMiring();
    }

    public String toString(){
        return "SegitigaSiku{" + "alas=" + getAlas() +", tinggi=" + getTinggi() +"}";
    }

    //Getter Setter
    public double getSisiMiring() {
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }
}
