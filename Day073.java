
import java.util.Scanner;

public class day073 {

    public static int hitungVokalPosisiGanjil(String kata) {
        String vokal = "aeiouAEIOU";
        int jumlahVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            // Mengecek posisi ganjil (dimulai dari 0, jadi (i+1) % 2 == 1 untuk posisi ganjil)
            if ((i + 1) % 2 == 1 && vokal.contains(String.valueOf(kata.charAt(i)))) {
                jumlahVokal++;
            }
        }

        return jumlahVokal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();

        int hasil = hitungVokalPosisiGanjil(kata);
        System.out.println("Jumlah huruf vokal di posisi ganjil: " + hasil);

        
    }
}
