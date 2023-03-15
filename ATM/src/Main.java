import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        int balance = 1500;
        int right = 3;
        int select;

        while(right > 0){
            String password, user_name;
            System.out.println("Please enter your user name: ");
            user_name = tara.nextLine();
            System.out.println("Please enter your password: ");
            password = tara.nextLine();

            if(user_name.equals("patika") && password.equals("dev123")){
                System.out.println("You have logged into the system.");

                do{
                    System.out.println("Please select the action you want to do.");
                    System.out.println("1 - Deposit\n" +
                            "2 - Withdraw money\n" +
                            "3 - Balance inquiry\n" +
                            "4 - Log out");
                    select = tara.nextInt();
                    switch(select){
                        case 1:
                            System.out.println("Amount of deposit: ");
                            int price = tara.nextInt();
                            balance += price;
                            System.out.println("Your balance is " + balance);
                            break;
                        case 2:
                            System.out.println("Amount of withdraw money: ");
                            price = tara.nextInt();
                            if(price > balance){
                                System.out.println("Insuficient balance.");
                            }
                            else{
                                balance -= price;
                                System.out.println("Your balance is " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;

                    }

                }while(select != 4);
                System.out.println("You log out. Have a good day!");
                break;
            }
            else {
                if (right == 0) {
                    System.out.println("Your account has been blocked.");
                } else {
                    System.out.println("Your user name or password is wrong. Try again.");
                    System.out.println("Your right: " + (--right));
                }
            }
       }
   }
}