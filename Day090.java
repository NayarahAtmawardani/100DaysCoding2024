package MentiBelajar.Days100;
import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String magnet1 = sc.nextLine();
        int grup = 1;

        for (int i = 1; i < n; i++) {
            String magnet2 = sc.nextLine();
            if (!magnet2.equals(magnet1)) {
                grup++;
            }
            magnet1 = magnet2;
        }

        System.out.println(grup);
    }
}
