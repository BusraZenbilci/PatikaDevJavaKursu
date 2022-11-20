import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            double a,b,c;
            Scanner input= new Scanner(System.in);

            System.out.print("a : ");
            a= Double.parseDouble(input.nextLine());
            System.out.print("b : ");
            b= Double.parseDouble(input.nextLine());
            System.out.print("c : ");
            c= Double.parseDouble(input.nextLine());
            System.out.println("Hello world!");
            if (a>b && a>c){
                if (b>c){
                    System.out.println("a > b > c");
                } else {
                    System.out.println("a > c > b");
                }

            }
            else if (b>a && b>c){
                if (a>c){
                    System.out.println("b > a > c");
                } else {
                    System.out.println("b > c > a");
                }

            }else{
                if (b>a){
                    System.out.println("c > b > a");
                }else {
                    System.out.println("c > a > b");
                }
            }

        }
    }

