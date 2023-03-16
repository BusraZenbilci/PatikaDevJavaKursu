import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int sum = 0;
        int rakamlar;

       while( number != 0) {
           rakamlar = number % 10;
           sum += rakamlar;
           number /= 10;
       }
        System.out.println("Basamak sayılarının toplamı: " + sum);
    }
}