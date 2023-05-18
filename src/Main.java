import TestingFacilities.*;
/* Semua uji coba pindah ke package Testing Facilities.
*  Buat kelas baru untuk eksperimen percobaan.
*  Kelas Main hanya untuk run saja.*/

public class Main {

    public static void main(String[] args) {
        MainRunTimeBangun.run();
        divider(5);
        MainRunTimePaket.run();
    }



    public static void divider(int spacing){
        for (int i = 0; i < spacing; i++) {
            System.out.println();
        }
    }
}