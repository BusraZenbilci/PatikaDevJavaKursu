/**
 * aouthor: Busra Zenbilci
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire
 * diliminin alanı bulan programı yazınız.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r , a;   // r: radius    a: center angle
        double pi = 3.14;

        Scanner tara = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r = tara.nextInt();
        System.out.println("Dairenin merkez açısının ölçüsü nedir: ");
        a = tara.nextInt();
        double area = (pi * Math.pow(r , 2) * a) / 360;
        double circle = 2 * pi *r;

        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Dairenin çevresi: " + circle);
    }
}
