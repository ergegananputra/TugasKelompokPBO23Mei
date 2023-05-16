package Paket;

public class Mahasiswa extends Manusia{
    private String nama;
    public Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama + nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                '}';
    }
}
