package logikaexor;
public class LogikaExOr {
    public static void main(String[] args) {
        
        
        boolean v1 = true;
        boolean v2 = true;
        System.out.println(v1 ^ v2);
        
        v1 = false;
        v2 = true;
        System.out.println(v1 ^ v2);
        
        v1 = false;
        v2 = false;
        System.out.println(v1 ^ v2);
        
        v1 = true;
        v2 = false;
        System.out.println(v1 ^ v2);
    }
    
    
}
