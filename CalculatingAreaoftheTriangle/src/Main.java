import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        // kullanıdan üçgenin çevrelerini girmesi istenir
        System.out.println("Üçgenin birinci çevresini giriniz: ");
        int a = tara.nextInt();
        System.out.println("Üçgenin ikinci çevresini giriniz: ");
        int b = tara.nextInt();
        System.out.println("Üçgenin üçüncü çevresini giriniz: ");
        int c = tara.nextInt();

        // üçgenin çevrelerinin toplamının yarısı bize u yu verir
        double u = (a + b + c) / 2;
        // bu formülde u yu kullanarak alanı buluruz
        double area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı: " + area);
    }
}
