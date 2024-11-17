
import java.util.Scanner;

public class day077 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String c = sc.next();

            // Periksa apakah pernyataan mengandung ++ atau --
            if (c.equals("++X")||c.equals("X++")) {
                x++;
            } else if (c.equals("--X")||c.equals("X--")) {
                x--;
            }
        }

        // Cetak hasil akhir x
        System.out.println(x);

    }

}
