
import java.util.Scanner;


public class day057 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       int n = sc.nextInt();
       int i = 1;
      
       if(n < 1){
           System.out.println("invalid input");
       }else{
           while(i < n){
           System.out.print(i + " ");
           i*=2;
       }   
       }
       
    }
    
}
