
import java.util.Scanner;

public class day075 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan teks:");
        String teks = sc.nextLine();

        System.out.print("Masukkan huruf target:");
        char target = sc.nextLine().toLowerCase().charAt(0);

        // Menghitung frekuensi huruf
        int frekuensi = 0;
        for (char huruf : teks.toLowerCase().toCharArray()) {
            if (huruf == target) {
                frekuensi++;
            }
        }

        // Output jumlah frekuensi huruf target
        System.out.println("Jumlah kemunculan huruf '" + target + "' adalah: " + frekuensi);

       
    }
}


