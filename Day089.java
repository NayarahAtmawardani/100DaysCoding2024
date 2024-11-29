
import java.util.Scanner;

public class day089 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bil1 = sc.nextLine();
        String bil2 = sc.nextLine();
        String isi = "";

        for (int i = 0; i < bil1.length(); i++) {
            char digit1 = bil1.charAt(i);
            char digit2 = bil2.charAt(i);

            if (digit1 == digit2) {
                isi += "0";
            } else {
                isi += "1";
            }
        }
        System.out.println("Hasil bilangan: " + isi);
    }

}
