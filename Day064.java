
public class day064 {public static void main(String[] args) {
    outer:
    for (int a = 1 ; a <= 5 ; a++){
        if(a == 3){
            System.out.println(a);
            break outer;
        }
        System.out.println(a);
    }
    
    }
    
}
