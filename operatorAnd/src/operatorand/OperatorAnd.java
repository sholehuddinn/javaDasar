package operatorand;
public class OperatorAnd {
    public static void main(String[] args) {

        int i = 0;
        int j = 10;
        boolean test ;

        test = (i>10) && (j++>9);
        test = (i>10) & (j++>9);
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("test = " +test);
        
        




    }
    
}
