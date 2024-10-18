
import java.util.Scanner;

public class day048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan usia : ");
        int usia = sc.nextInt();

        if (usia >= 0) {
            System.out.println("valid");
            if (usia > 0 && usia <= 12) {
                System.out.println("anak-anak");
            }
            if (usia > 12 && usia < 17) {
                System.out.println("remaja");
            }
            if (usia > 17 && usia <= 59) {
                System.out.println("dewasa");
            }
        } else {
            System.out.println("tidak valid");
        }

    }
}


