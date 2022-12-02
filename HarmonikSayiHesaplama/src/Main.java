import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        double result = 0.0;

        System.out.println("Girdiğiniz sayının harmonik serisi: ");
        for(int i = 1 ; i <= number ; i++){
            System.out.print("1/" + i + " + ");

        }

        for(double i = 1 ; i <= number ; i++){
            result += (1/i);

        }
        System.out.println("  ");
        System.out.println("Harmonik dizinin toplamı: " + result);

    }
}
