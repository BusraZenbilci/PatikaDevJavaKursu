import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        int n , r , kombinasyon;
        int  r_factorial = 1;
        int  n_factorial = 1;
        int nMinusrFaktorial = 1;

        System.out.print("Lütfen n değerini giriniz: ");
        n= tara.nextInt();

        System.out.print("Lütfen r değerini giriniz: ");
        r = tara.nextInt();

        for(int i = 1 ; i <= n ; i++){
            n_factorial = n_factorial * i;
        }
        System.out.println("n!: " + n_factorial);

        for(int j = 1 ; j <= r ; j++){
            r_factorial = r_factorial * j;
        }
        System.out.println("r!: " + r_factorial);

        for(int z = 1 ; z <= (n-r) ; z++){
            nMinusrFaktorial = nMinusrFaktorial * z;
        }

        System.out.println("(n-r)!: " + nMinusrFaktorial);

        kombinasyon = n_factorial / (r_factorial * nMinusrFaktorial);

        System.out.println("Kombinasyon C(n,r): " + kombinasyon);

    }
}
