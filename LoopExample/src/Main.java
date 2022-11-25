import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int total = 0;
        int howManyNumber = 0;
        
        for(int i = 0 ; i < number ; i++){

            if(i % 3 == 0 && i % 4 == 0){
                System.out.print("Sayılar: " );
                System.out.println(i);
                total += i;
                howManyNumber++;
            }

        }
        System.out.println("Sayıların toplamı: " + total);

        int average = total / (howManyNumber - 1) ;
        System.out.println("Sayıların ortalaması: " + average);

    }
}
