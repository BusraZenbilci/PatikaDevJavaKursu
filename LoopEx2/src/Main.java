import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int n;
        int total = 0;
        do{
            System.out.print("sayı giriniz: ");
            n= tara.nextInt();
            if(n % 2 == 0 && n % 4 == 0){
                total = total + n;
            }

        } while(n % 2 == 0);

        System.out.println("Toplam: " + total);
    }
}
