import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik , turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = input.nextInt();
        if(mat < 0 || mat > 100){
            mat = 0;
        }

        System.out.println("Türkçe notunuz : ");
        turkce= input.nextInt();
        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.println("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.println("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.println("Müzik notunuz : ");
        muzik= input.nextInt();
        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        double average = (mat + fizik + turkce + muzik + kimya) / 5;
        if(average <= 55){
            System.out.println("Sınıfta kaldınız.");
        }
        else
            System.out.println("Sınıfı geçtiniz.");

        System.out.println("Ortalamanız: " + average);
    }
}
