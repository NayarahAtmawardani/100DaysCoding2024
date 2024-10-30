
import java.util.Scanner;

public class day060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a;
        do{
            a = sc.nextInt();
            if(a>0){
               sum+=a; 
            }
        }while(a!=0);
        System.out.println(sum);
    }
}
