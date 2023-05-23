package TestingFacilities.MainFromSlides;

import bangun3D.PrismaSegitiga;

public class MainPrismaSlide60 {
    public static void run(){
        try {
        PrismaSegitiga prisma = new PrismaSegitiga(null, 10);
        System.out.println(prisma);
        System.out.println(prisma.getVolume());
        System.out.println(prisma.getDetailAlas());
        System.out.println("----------------------------");
        } catch (NullPointerException e) {
          System.out.println("Error: " + e.getMessage());
    }
}
}
