
import java.util.Scanner;


public class day036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan harga satu barang : ");
        double a = sc.nextDouble();
        System.out.print("Masukkan jumlah barang yang ingin dibeli : ");
        double b = sc.nextDouble();
        System.out.print("Masukkan persentase diskon : ");
        double c = sc.nextDouble();
        System.out.print("Masukkan jumlah uang yang anda miliki : ");
        double d =sc.nextDouble();
        
        double totalsebelum = a*b;
        double totaldiskon = totalsebelum * (c/100);
        double totalsetelah = totalsebelum - totaldiskon;
        double sisaSetelahBayar = d - totalsetelah;
        double tidakDapatDibagiRp50k = sisaSetelahBayar % 50000;
        System.out.println(""); 
       System.out.println("Total harga sebelum diskon: " + totalsebelum);
       System.out.println("Total harga setelah diskon: " + totalsetelah);
       System.out.println("Sisa uang setelah pembayaran: " + sisaSetelahBayar);
       System.out.println("Sisa uang yang tidak dapat dibagi dalam pecahan Rp50.000: " + tidakDapatDibagiRp50k);
       
        
        
    }
    
}
