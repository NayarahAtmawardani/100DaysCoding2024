
import java.util.Scanner;


public class day055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        
        for(int a = N; a >= 1 ; a--){
            if(N % a == 0){
                System.out.print(a + " ");
            }      
            
        }
        
    }
    
}
