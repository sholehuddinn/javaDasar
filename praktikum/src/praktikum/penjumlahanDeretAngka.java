package materiprak5;

import java.util.Scanner;

public class penjumlahanDeretAngka {
    public static void main(String[] args) {
        
        Scanner x = new Scanner (System.in);
        
        System.out.print("Masukkan Angka : ");
        int n = x.nextInt();
        int i, hasil = 0;
        
        for (i = n; true; i++) {
            if (i == 0) {
                System.out.print(i + " = ");
                break;
            }
            System.out.print(i + " + ");
            hasil +=  i;
            System.out.print(hasil);
        }
    }
}
