
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

package EvaluasiMentor2;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      boolean sama = a == b; 
      boolean tua = a > b;
      boolean muda = a < b;
        System.out.println(sama);
        System.out.println(tua);
        System.out.println(muda);
    }
  
     

}
