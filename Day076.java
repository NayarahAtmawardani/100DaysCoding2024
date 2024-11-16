
import java.util.Scanner;

public class day076 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Membaca input
        System.out.print("Masukkan kata: ");
        String s = sc.nextLine();

        // Menghitung jumlah huruf besar dan kecil
        int a = 0;
        int b = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                a++;
            } else if (Character.isLowerCase(c)) {
                b++;
            }
        }

        // Menentukan hasil berdasarkan aturan
        String hasil;
        if (a > b) {
            hasil = s.toUpperCase();
        } else {
            hasil = s.toLowerCase();
        }

        // Output hasil
        System.out.println("Hasil: " + hasil);

        
    }
}
