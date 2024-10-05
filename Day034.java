
import java.util.Scanner;


public class day034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukakan nama lengkap : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan usia : ");
        int umur = sc.nextInt();
        System.out.print("masukkan jenis kelamin L/P : ");
        char jk = sc.next().charAt(0);
        System.out.print("Masukkan tinggi badan : ");
        double tb = sc.nextDouble();
        System.out.print("apakah anda sudah menikah : ");
        boolean status = sc.nextBoolean();
        System.out.println("");
        
        
        
        
        System.out.println("Formulir pendaftaran");
        System.out.println("====================");
        System.out.println("Nama lengkap : " + nama);
        System.out.println("Usia : " + umur);
        System.out.println("Jenis kelamin : " +jk );
        System.out.println("Tinggi Badan : " + tb + "cm");
        System.out.println("Status : " + status);
        
    }
    
}
