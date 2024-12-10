import java.util.Scanner;
 
public class DAY100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("=====================");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        double hasil = 0;
        boolean valid = true;

        if (pilihan == 1) {
            hasil = angka1 + angka2;
        } else if (pilihan == 2) {
            hasil = angka1 - angka2;
        } else if (pilihan == 3) {
            hasil = angka1 * angka2;
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                valid = false;
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            valid = false;
        }
        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

    }
}
