
public class day033 {
    public static void main(String[] args) {
      // konversi otomatis
     // byte -> short -> int -> long -> float -> double 
        byte a  = 90;
        System.out.println(a);
        short b = a;
        System.out.println(b);
        int c = b;
        System.out.println(c);
        long d = c;
        System.out.println(d);
        float e = d;
        System.out.println(e);
        double f = e;
        System.out.println(f);
        System.out.println("");
        
      //konversi manual
      //double -> float -> long -> int -> short -> byte
        double g = 12.5;
        System.out.println(g);
        float h = (float)g;
        System.out.println(h);
        long i = (long)h;
        System.out.println(i);
        int j = (int)i;
        System.out.println(j);
        short k = (short)j;
        System.out.println(k);
        byte l = (byte)k;
        System.out.println(l);
      
    }
    
}
