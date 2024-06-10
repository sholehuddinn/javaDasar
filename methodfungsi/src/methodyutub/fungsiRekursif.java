package methodyutub;

import java.util.Scanner;

public class fungsiRekursif {
    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        
        System.out.print("Masukkan nilai mu : ");
        int nilai = x.nextInt();
        System.out.println("nilai = " + nilai);
        
        printNilai(nilai);
        
    }
    private static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);
        
        if (parameter == 100) {
            return;
        }
        
        parameter++;
        printNilai(parameter);
    }
}
