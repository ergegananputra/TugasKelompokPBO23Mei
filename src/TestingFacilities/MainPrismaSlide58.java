package TestingFacilities;

import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSiku;
import bangun3D.PrismaSegitiga;

public class MainPrismaSlide58 {
    public static void run(){
    Segitiga segitigaSiku = new SegitigaSiku(3, 4);
    PrismaSegitiga prisma1 = new PrismaSegitiga(segitigaSiku, 10);
    System.out.println(prisma1);
    System.out.println(prisma1.getVolume());
    System.out.println(prisma1.getDetailAlas());
    System.out.println("----------------------------");

    SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(10, 7);
    PrismaSegitiga prisma2 = new PrismaSegitiga(segitigaSamaKaki, 10);
    System.out.println(prisma2);
    System.out.println(prisma2.getVolume());
    System.out.println(prisma2.getDetailAlas());
    System.out.println("----------------------------");
    }
}