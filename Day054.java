
import java.util.Scanner;


public class day054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int genap = 0;
        int ganjil = 0;
        
        for (int a = 1; a <= N; a++){
            if(a % 2 == 0){
               genap += a;
            }else {
                ganjil += a;
            }
        }System.out.println(genap);
         System.out.println(ganjil);
    }
    
}
