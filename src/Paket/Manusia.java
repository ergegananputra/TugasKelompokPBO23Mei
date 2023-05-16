package Paket;

public class Manusia {
    private String nama;
    public Manusia(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return  this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Manusia{" +
                "nama='" + nama + '\'' +
                '}';
    }
}
