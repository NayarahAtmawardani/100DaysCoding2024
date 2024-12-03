public class DAY93 {
    public static void main(String[] args) {
        
        int n = 5; // Jumlah baris pola
        
        for (int i = 0; i < n; i++) {
            // Cetak spasi di awal
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Cetak bintang pertama
            System.out.print("*");
            // Cetak spasi di tengah
            if (i > 0) {
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print(" ");
                }
                // Cetak bintang kedua
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
