import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        if(year % 4 == 0){
            System.out.println( year + " bir artık yıldır !");
        }
        else
            System.out.println(year + " bir artık yıl değildir.");
    }

}
