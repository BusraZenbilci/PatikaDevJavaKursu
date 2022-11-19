/**
 * author: Büşra Zenbilci
 * Taksimetre KM başına 2.20 TL tutmaktadır.
 * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 * Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        double perKm = 2.20;
        int startPrice= 10;

        System.out.println("Mesafe kaç kilometre tuttu? ");
        double km = tara.nextDouble();

        double total= (km * perKm) + startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total + " TL.");

    }
}
