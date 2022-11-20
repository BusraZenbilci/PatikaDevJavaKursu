import java.util.Arrays;
import java.util.Scanner;

public class SolutionWithArray {
    public static void main(String[] args) {
        int [] grades = new int[5];
        String [] classes = {"Matematik" , "Fizik ", "Kimya" ,"Türkçe ", "Müzik"};
        int length = 5;
        double average = 0;

        Scanner tara = new Scanner(System.in);
        for(int i = 0 ; i < grades.length; i++){
            System.out.print(classes[i] + " grades: ");
            grades[i] = tara.nextInt();
            if(grades[i] < 0 || grades[i] > 100){
                System.out.println("Entered an invalid grade!");
                length--;
            }
            else{
                average = grades[i] + average;
            }
        }

        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Average is: " + (average / length));
    }
}
