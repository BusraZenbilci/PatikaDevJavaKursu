import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        int n;
        System.out.print("Sayı giriniz: ");
        n = tara.nextInt();

        System.out.println("   ");

        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i < n; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("     ");
        System.out.println("     ");

        System.out.print("5'in katları: ");
        for (int j = 1; j < n; j*=5){
            System.out.print(j + " ");
        }

    }
}
