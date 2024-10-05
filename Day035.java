
import java.util.Scanner;


public class day035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah uang awal : ");
        int a = sc.nextInt();
        System.out.print("Masukkan pengeluaran pertama : ");
        int b = sc.nextInt();
        System.out.print("Masukkan jumlah pemasukkan pertama : ");
        int c = sc.nextInt();
        System.out.print("Masukkan jumlah pengeluaran kedua : ");
        int d = sc.nextInt();
        System.out.print("Masukkan jumlah pemasukkan kedua : ");
        int e = sc.nextInt();
        System.out.println("");
        
        System.out.println("Total uang anda sekaramg adalah : " + (a-b+c-d+e));
    }
    
}
