

import java.util.Scanner;

public class day078b {

    

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String berland = sc.nextLine();
            String birland = "";

            for (int i = berland.length()-1;i >= 0; i--){
                birland += berland.charAt(i);
            }
            String birland2 = sc.next();
            if(birland2.equalsIgnoreCase(birland)){
                if(birland2.equals(birland)){
                    System.out.println("NO");
                    return;
                }
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
