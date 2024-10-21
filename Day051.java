
import java.util.Scanner;


public class day051 {
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dadu = sc.nextInt();
        int kartu = sc.nextInt();
        String sihir = "";

        switch (dadu) {
            case 1:
                if (kartu >= 1 && kartu <= 5) sihir = "Fireball";
                else if (kartu >= 6 && kartu <= 10) sihir = "Lightning Bolt";
                else sihir = "Teleportation";
                break;
            case 2:
                if (kartu >= 1 && kartu <= 5) sihir = "Fireball";
                else if (kartu >= 6 && kartu <= 10) sihir = "Lightning Bolt";
                else sihir = "Teleportation";
                break;
            case 3:
                if (kartu >= 1 && kartu <= 3) sihir = "Ice Shard";
                else if (kartu >= 4 && kartu <= 8) sihir = "Wind Blast";
                else sihir = "Earthquake";
                break;
            case 4:
                if (kartu >= 1 && kartu <= 3) sihir = "Ice Shard";
                else if (kartu >= 4 && kartu <= 8) sihir = "Wind Blast";
                else sihir = "Earthquake";
                break;
            case 5:
                if (kartu >= 1 && kartu <= 7) sihir = "Water Wave";
                else sihir = "Stone Wall";
                break;
            case 6:
                if (kartu >= 1 && kartu <= 7) sihir = "Water Wave";
                else sihir = "Stone Wall";
                break;
            default:
                sihir = "Tidak valid";
        }

        System.out.println(sihir);
    }
}

