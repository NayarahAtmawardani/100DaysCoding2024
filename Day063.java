
import java.util.Scanner;


public class day063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int b = 0;
        for (int a = 0 ; a <= n ; a++){
            if(a % 3 == 0 && a % 5 == 0){
               continue;
            }else if (a % 3 == 0 || a % 5 == 0){
               b++;
            }
        }
        System.out.println(b);
    }
   
}
