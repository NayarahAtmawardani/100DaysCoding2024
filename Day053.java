
import java.util.Scanner;


public class day053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int finish = sc.nextInt();
        
        for(int start = 1 ; start < finish ; start++){
            if(start % 3 != 0 && start % 2 == 0){
                System.out.print(start + " ");
            }
        }
    }
    
}
