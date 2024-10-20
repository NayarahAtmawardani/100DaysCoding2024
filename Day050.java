
import java.util.Scanner;


public class day050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        
        if(N % 2 == 1 && N < 30){
            System.out.println("ON");
        }else if (N % 2 == 0){
            if(N < 12){
                System.out.println("OFF");
            }else if (N >= 12 && N <= 30){
                System.out.println("ON");
            }else {
                System.out.println("OFF");
            }
        }else{
            System.out.println("lain-lain");
        }
    }
    
}
