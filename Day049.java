import java.util.Scanner;


public class day049 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        
        if (N > 0 && N <= 9){
            System.out.println("satuan");
        }else if (N >= 10 && N <= 99){
            System.out.println("puluhan");
        }else if (N > 99 && N <= 999){
            System.out.println("ratusan");
        }else if (N >= 1000 && N <= 9999){
            System.out.println("ribuan");
        }else if (N <= 10000 && N <= 99999){
            System.out.println("puluh ribuan");
        }
    }
    
}
