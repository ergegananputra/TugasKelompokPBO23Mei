package PercobaanStatic;
public class Mahasiswa {
    private static String prodi = "TRPL";
    private String nama;
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' + ", prodi=" + prodi +
                '}';
    }


    // Slide 49 - Jelaskan mengapa method dibawah error
    public static void getNamo(String namoBaru){
        this.nama = nama;
    }
    public static String tanyaNama(){
        return nama;
    }
    public static String tanyaProdi(){
        return prodi;
    }
    public static String getDetail(){
        return "Mahasiswa {" + "nama=" + getNama() + ", prodi=" + getProdi() + "}";
    }
}