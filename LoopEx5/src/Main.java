import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.print("Lütfen üstü alınacak sayıyı giriniz: ");
        int n = tara.nextInt();

        System.out.print("Sayının kuvvetini giriniz: ");
        int k = tara.nextInt();
        int total = 1;

        for(int i = 1 ; i <= k ; i++){
            total = total * n;
        }

        System.out.println(n +" üstü " + k + " = " + total);
    }
}
