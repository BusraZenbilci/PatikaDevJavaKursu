public class Main {
    public static void main(String[] args) {

        System.out.println("1 ve 100 arasındaki asal sayılar: ");


        for(int i = 2 ; i <= 100 ; i++){    // i ve k, 2'den başlar çünkü 1 asal sayı değildir.
            int k;
            for(k = 2 ; k <i ; k++){
                if(i % k == 0)
                break;

            }
            if(k == i){
                System.out.print(i + " ");
            }
        }
    }
}