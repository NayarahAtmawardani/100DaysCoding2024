
import java.util.Scanner;


public class day062 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        
        if(k <= 0){
            System.out.println("k harus bilangan positif");
            return;
        }
        while(true){
            int a = input.nextInt();
            if(a == 0){
                System.out.println("tidak ada kelipatan "+k);
                break;
            }
            if(a %k == 0 && a > 0){
                System.out.println(a);
               break;
        }
        
    
    }
}
}
