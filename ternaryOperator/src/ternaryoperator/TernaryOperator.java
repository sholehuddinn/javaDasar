package ternaryoperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner x = new Scanner (System.in);
        
        System.out.print("input = ");
        x = x.next();
        
        int y = (x == 10) ? (x * x) : (x / 2);
        
        System.out.println("nilai = "+y);











    }
    
}
