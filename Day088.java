
import java.util.Scanner;


public class day088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 2;
        
        int b = 0;
        int jumlahkamar = sc.nextInt();
        for (int i = 1;i <= jumlahkamar; i++){
            int penghuni = sc.nextInt();
            int kapasitas = sc.nextInt();
            
            if (penghuni + a < kapasitas){
                b++;
            
            }
        }
        System.out.println(b);
    }
    
}
