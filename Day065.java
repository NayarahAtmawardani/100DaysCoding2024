
import java.util.*;

public class day065 {

    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int a = oke.nextInt();

        while (a >= 10) {
            int b = 0;
            while (a > 0) {
                b += a % 10;
                a /= 10;
            }
            a = b;
        }
        System.out.println("hasil: " + a);
    }

}
