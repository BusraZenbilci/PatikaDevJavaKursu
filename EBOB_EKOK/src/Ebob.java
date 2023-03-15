import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();


//        for(int i = 1 ; i < n1 && i < n2 ; i++){      for loop
//            if(n1 % i == 0 && n2 % i == 0){
//                System.out.println(i);
//                ebob = i;
//            }
//        }

        int ebob=1;

        int i = 1;
       while ( (i < n2)) {                            // while loop

           if(n1 % i == 0 && n2 % i == 0){
               ebob = i;
           }
           i++;
       }
        System.out.println(ebob);


    }
}