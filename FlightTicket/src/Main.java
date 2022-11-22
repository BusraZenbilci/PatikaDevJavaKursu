import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age, tripType, KM;

        Scanner tara = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        KM = tara.nextInt();
        double normalTutar = KM * 0.10;

        System.out.print("Yaşınızı giriniz: ");
        age = tara.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tripType = tara.nextInt();

        if (age < 0 || KM < 0) {
            System.out.println("      ");
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }

        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = (normalTutar * 50) / 100;
        } else if (age >= 12 && age < 24) {
            ageDiscount = (normalTutar * 10) / 100;
        } else if (age > 65) {
            ageDiscount = (normalTutar * 30) / 100;
        }

        if (tripType == 1 || tripType == 2) {
            switch (tripType) {
                case 1:
                    double total = normalTutar - ageDiscount;
                    System.out.println("   ");
                    System.out.println("Gidiş tutarınız: " + total);
                    break;

                case 2:
                    total = 2 * ((normalTutar - ageDiscount) - (normalTutar - ageDiscount) * 0.2);
                    System.out.println("  ");
                    System.out.println("Gidiş-dönüş tutarınız: " + total);
                    break;
            }

        } else {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);

        }
    }

}



