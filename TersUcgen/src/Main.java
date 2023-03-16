import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = tara.nextInt();

        for(int i = 0 ; i <= n ; i++){
            for(int k= 0 ; k < i ; k++){
                System.out.print(" ");

            }

            for(int j = 0 ; j < 2*n - (2*i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}