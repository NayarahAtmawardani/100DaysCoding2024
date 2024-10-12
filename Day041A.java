
package EvaluasiMentor2;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double harga = sc.nextDouble();
        double diskon = sc.nextDouble();
        harga -= diskon*harga/100;
        System.out.println(harga);
        
    }
    
}

