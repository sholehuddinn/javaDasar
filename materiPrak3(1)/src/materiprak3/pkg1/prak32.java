package materiprak3.pkg1;

import java.util.Scanner;

public class prak32 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        double  b, c, sudut,luas;
        
        System.out.print("b\t= ");
        b = x.nextDouble();
        
        System.out.print("c\t= ");
        c = x.nextDouble();
        
        System.out.println("sudut\t= ");
        sudut = x.nextDouble();
        
        luas = 0.5 * b * c * Math.sin(sudut);
        
        System.out.println("luas\t= " + luas);
                
    }
}
