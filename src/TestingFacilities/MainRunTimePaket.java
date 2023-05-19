package TestingFacilities;

import Paket.Mahasiswa;
import Paket.Manusia;

public class MainRunTimePaket {
    public static void run(){
        Manusia a1 = new Mahasiswa("Aji");
        System.out.println(a1);
//        a1.setNama("Aji");
        System.out.println(a1.getNama());

        Manusia a2 = new Manusia("Budi");
        System.out.println(a2);
        a2.setNama("Bayu");
        System.out.println(a2.getNama());

        Manusia b1 = new Manusia("Susi");
        System.out.println(b1);
        b1.setNama("Santi");
        System.out.println(b1.getNama());
    }
}
