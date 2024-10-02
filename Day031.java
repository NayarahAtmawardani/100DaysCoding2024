
public class day031 {
    public static void main(String[] args) {
        String apaaja = "120";
        byte inibyte = Byte.parseByte(apaaja);
        System.out.println(inibyte);
        short inishort =Short.parseShort(apaaja);
        System.out.println(inishort);
        int iniInt = Integer.parseInt(apaaja);
        System.out.println(iniInt);
        long inilong =Long.parseLong(apaaja);
        System.out.println(inilong);
        
        String apaaja2 = "10.5";
        double inidouble = Double.parseDouble(apaaja2);
        System.out.println(inidouble);
        float inifloat = Float.parseFloat(apaaja2);
        System.out.println(inifloat);
        
        String apaaja3 = "true";
        boolean iniboolean = Boolean.parseBoolean(apaaja3);
        System.out.println(iniboolean);
        
        String apaaja4 ="nayakiyowo";
        char inichar = apaaja4.charAt(5);
        System.out.println(inichar);
    }
   
}
