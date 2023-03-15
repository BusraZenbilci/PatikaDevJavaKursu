import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();

        int min=0, max = 0;

        for(int i = 1 ; i <= n ; i++){
            System.out.print( i + ". sayı: ");
            int number = input.nextInt();


            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}