
import java.util.Scanner;

public class day058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("invalid input");
        } else {
            while (1 <= n) {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n -= 2;
                } else if (n % 2 == 1) {
                    n -= 1;
                }
            }
            System.out.println(1);
        }
    }
}
