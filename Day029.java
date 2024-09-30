import java.math.BigInteger;//untuk biginteger itu menggunakan import
public class day029 {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("20");
        BigInteger c = new BigInteger("30");
        //aritmatika
        BigInteger jumlah = a.add(b);
        BigInteger kurang = c.subtract(a);
        BigInteger kali = a.multiply(b);
        BigInteger bagi = c.divide(a);        
        //modulus atau sisa bagi
        BigInteger mod = b.mod(c);
              
        System.out.println("penjumlahan = " + jumlah);
        System.out.println("pengurangan = " + kurang);
        System.out.println("perkalian = " + kali);
        System.out.println("pembagian = "+ bagi);
        System.out.println("sisa bagi = " + mod);
        
        
        
    }

}
