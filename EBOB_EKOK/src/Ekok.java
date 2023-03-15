import java.util.Scanner;

public class Ekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

//
//        for(int i = 1 ; i <= (n1 * n2) ; i++){        for loop
//            if(i % n1 == 0 && i % n2 == 0){
//                System.out.println(i);
//                break;
//            }

        int i= 1;
        while( i <= (n1 * n2)){                      // while loop
           i++;
            if(i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                break;
            }

        }

    }
}
