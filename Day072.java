
import java.util.Scanner;

public class day072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("masukkan nilai : ");
        int nilai = sc.nextInt();
        int faktorial = f(nilai);
        System.out.println(faktorial);
    }
    public static int f (int b) {
        System.out.println(b);
        if(b == 0){
            return b;
        }
        return b*f(b-1);
    }

}
