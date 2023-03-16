import java.util.Scanner;

public class Main {

    // perfect number: A perfect number is a number whose sum of
    // positive integer factors (divisors without a remainder)
    // is equal to itself, excluding the number itself.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int sum = 0;
        for(int i = 1 ; i < number ; i++){
           if(number % i == 0){
               sum = sum + i;
            }
        }
        System.out.println("Girilen sayının bölenleri toplamı: " + sum);

        if(number == sum)
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        else
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");

    }
    
}