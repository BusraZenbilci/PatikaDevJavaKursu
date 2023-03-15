import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0, number1 = 0, number2 = 1;

        System.out.print("Bir sayı giriniz: ");

        int number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(number1 + " ");
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}