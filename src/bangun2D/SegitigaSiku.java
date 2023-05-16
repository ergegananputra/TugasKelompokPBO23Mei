package bangun2D;

public class SegitigaSiku extends Segitiga {
    //Atributes
    private double sisiMiring;

    //Constructor
    public SegitigaSiku(double alas, double tinggi, double sisiMiring){
        super(alas, tinggi);
        this.sisiMiring = sisiMiring;   
    }

    //Methods
    @Override
    public double getKeliling() {
        return getAlas() + getTinggi() + getSisiMiring();
    }

    public String toString(){
        return "SegitigaSiku{" + "alas=" + getAlas() +"' tinggi=" + getTinggi() + "' sisiMiring=" + getSisiMiring() +"}";
    }

    //Getter Setter
    public double getSisiMiring() {
        return this.sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
}
