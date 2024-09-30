
import java.math.BigDecimal;


public class day30 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("20.5");
        BigDecimal b = new BigDecimal ("10.3");
        BigDecimal c = new BigDecimal ("30.3");
        
        BigDecimal jumlah = a.add(b);
        BigDecimal kurang = a.subtract(b);
        BigDecimal kali = a.multiply(c);
       
        System.out.println("penjumlahan = " + jumlah);
        System.out.println("pengurangan = " + kurang);
        System.out.println("perkalian = " + kali);
        
       
        
    }
    
}
