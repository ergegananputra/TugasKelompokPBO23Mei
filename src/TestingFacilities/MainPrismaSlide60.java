package TestingFacilities;

import bangun3D.PrismaSegitiga;

public class MainPrismaSlide60 {
    public static void run(){
        PrismaSegitiga prisma = new PrismaSegitiga(null, 10);
        System.out.println(prisma);
        System.out.println(prisma.getVolume());
        System.out.println(prisma.getDetailAlas());
        System.out.println("----------------------------");
    }
}