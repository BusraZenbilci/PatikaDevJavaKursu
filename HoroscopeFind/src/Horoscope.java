
import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {
        int day = 1, month = 1;
        boolean isValid = true;
        Scanner scanner = new Scanner(System.in);
        while (isValid) {
            System.out.print("Please enter the Month you were born(in number): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                scanner.nextLine();
                if (!(month <= 12 && month > 0)) {

                    System.out.println("Please enter a valid month.");
                } else isValid = false;
            } else {
                System.out.println("You should enter a number.");
                scanner.nextLine();
            }

        }

        isValid = true;

        int lastDay;
           if  (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {

            lastDay = 31;

        } else if (month == 2) {
            lastDay = 29;
        } else {
            lastDay = 30;
        }
        while (isValid) {
            System.out.print("Please enter day of the Month you were born: ");
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                scanner.nextLine();
                if (day <= 0 || day > lastDay) {
                    System.out.println("Please enter valid day.");
                } else {
                    isValid = false;
                }
            } else {
                System.out.println("Please enter the day as number.");
                scanner.nextLine();
            }
        }
        if (month == 1) {
            if (day <= 19) {
                System.out.println("Your horoscope is Capricorn");
            } else {
                System.out.println("Your horoscope is Aquarius");
            }
        } else if (month == 2) {
            if (day <= 18) {
                System.out.println("Your horoscope is Aquarius");
            } else {
                System.out.println("Your horoscope is Pisces");
            }
        } else if (month == 3) {
            if (day <= 19) {
                System.out.println("Your horoscope is Pisces");
            } else {
                System.out.println("Your horoscope is Aries");
            }
        } else if (month == 4) {
            if (day <= 18) {
                System.out.println("Your horoscope is Aries");
            } else {
                System.out.println("Your horoscope is Taurus");
            }
        } else if (month == 5) {
            if (day <= 20) {
                System.out.println("Your horoscope is Taurus");
            } else {
                System.out.println("Your horoscope is Gemini");
            }
        } else if (month == 6) {
            if (day <= 20) {
                System.out.println("Your horoscope is Gemini");
            } else {
                System.out.println("Your horoscope is Cancer");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Your horoscope is Cancer");
            } else {
                System.out.println("Your horoscope is Leo");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Your horoscope is Leo");
            } else {
                System.out.println("Your horoscope is Virgo");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Your horoscope is Virgo");
            } else {
                System.out.println("Your horoscope is Libra");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Your horoscope is Libra");
            } else {
                System.out.println("Your horoscope is Scorpio");
            }
        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Your horoscope is Scorpio");
            } else {
                System.out.println("Your horoscope is Sagittarius");
            }
        } else  {
            if (day <= 21) {
                System.out.println("Your horoscope is Sagittarius");
            } else {
                System.out.println("Your horoscope is Capricorn");
            }
        }

        }
    }

