import java.util.Scanner;
public class DAY97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan: ");
        int batas = sc.nextInt();

        System.out.println("Bilangan prima hingga " + batas + " adalah:");
        for (int i = 2; i <= batas; i++) {
            boolean prima = true;

            // Mengecek apakah bilangan i adalah prima
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            // Jika prima tetap true, maka bilangan adalah prima
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
