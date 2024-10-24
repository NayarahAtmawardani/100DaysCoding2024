import java.util.Scanner;


public class day053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        
        for(int a = 1 ; a < N ; a++){
            if(a % 3 != 0 && a % 2 == 0){
                System.out.println(a);
            }
        }
    }
    
}
