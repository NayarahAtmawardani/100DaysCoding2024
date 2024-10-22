
import java.util.Scanner;

public class day052 {
    public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
       int nilai = sc.nextInt();

          char hasil= (nilai <= 70 && nilai <= 75) ? 'A':
                      (nilai > 85)? 'A' :
                      (nilai >= 60 && nilai <= 85) ? 'B' :
                      (nilai == 50)? 'B': 'C';

           System.out.println(hasil);

}

}
