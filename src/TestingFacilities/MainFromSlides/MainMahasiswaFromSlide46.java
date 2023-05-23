package TestingFacilities.MainFromSlides;

import Paket.Mahasiswa;

public class MainMahasiswaFromSlide46 {
    public static void run(){
        // Error karena atribut private
//        System.out.println(Mahasiswa.prodi);
        // Error karena atribut non-static
//        System.out.println(Mahasiswa.nama);

        Mahasiswa st1 = new Mahasiswa("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        Mahasiswa st2 = new Mahasiswa("Mr X dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");

        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
}
