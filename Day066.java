
import java.util.Scanner;

public class day066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int b = 1; b <= a; b++) {
            for (int x = 1; x <= a; x++) {
                System.out.print("o ");
            }
            System.out.println(" ");
        }
        System.out.println("");

        System.out.println("==========================");
        int c = sc.nextInt();
        int e = sc.nextInt();
        for (int d = 0; d < c; d++) {
            for (int y = 0; y < e; y++) {
                System.out.print("x ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
