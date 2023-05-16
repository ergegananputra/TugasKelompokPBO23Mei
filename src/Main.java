import bangun2D.*;
import bangun3D.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public void simpleGroundTestAvailableClass(){
        // bangun 2D
        Persegi persegi = new Persegi(10);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki();
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi();
        SegitigaSiku segitigaSiku = new SegitigaSiku();

        List<Object> bangun2D = Arrays.asList(persegi, persegiPanjang, segitigaSamaKaki, segitigaSamaSisi, segitigaSiku);
        System.out.println("=== Bangun 2D ===");
        for (Object bangun: bangun2D) {
            String msg = bangun.toString();
            if (!msg.startsWith("bangun2D")){
                System.out.println(msg);
            } else {
                System.out.println("[ Unimplemented Error! ] \t" + bangun.getClass());
            }
        }

        // Divider
        System.out.println("\n");

        // bangun 3D
        Balok balok = new Balok(10, 10, 10);
        Kerucut kerucut = new Kerucut();
        Kubus kubus = new Kubus(10);
        Limas limas = new Limas();
        Prisma prisma = new Prisma();
        Tabung tabung = new Tabung(7, 10);

        List<Object> bangun3D = Arrays.asList(balok, kerucut, kubus, limas, prisma, tabung);
        System.out.println("=== Bangun 3D ===");
        for (Object bangun: bangun3D) {
            String msg = bangun.toString();
            if (!msg.startsWith("bangun3D")){
                System.out.println(msg);
            } else {
                System.out.println("[ Unimplemented Error! ] \t" + bangun.getClass());
            }
        }
    }
    public static void main(String[] args) {
        Main publicFacility = new Main();
        publicFacility.simpleGroundTestAvailableClass();
    }
}