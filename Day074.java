
import java.util.Scanner;

public class day074 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode: ");
        String kode = sc.nextLine();

        // Aturan 1: Panjang kode harus antara 8 hingga 12 karakter
        if (kode.length() < 8 || kode.length() > 12) {
            System.out.println("Kode Tidak Valid");
            return;
        }

        // Aturan 2: Kode harus berisi minimal 2 huruf dan 2 angka
        int jumlahHuruf = 0;
        int jumlahAngka = 0;

        for (int i = 0; i < kode.length(); i++) {
            char karakter = kode.charAt(i);
            if (Character.isLetter(karakter)) {
                jumlahHuruf++;
            } else if (Character.isDigit(karakter)) {
                jumlahAngka++;
            }
        }

        if (jumlahHuruf >= 2 && jumlahAngka >= 2) {
            System.out.println("Kode Valid");
        } else {
            System.out.println("Kode Tidak Valid");
        }
    }
}
