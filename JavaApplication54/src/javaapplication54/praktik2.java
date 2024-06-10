
package javaapplication54;

import java.util.Scanner;

public class praktik2 {
    public static void main(String[] args) {
        
    /* 2. Rangga memiliki Rp 10.000.000 untuk diinvestasikan dalam deposito bank. Bank
    menawarkan suku bunga tahunan sebesar 6%. Berapa jumlah uang yang Anda miliki
    setelah 5 tahun? Hitung jumlah uang Rangga setelah 5 tahun di investasikan ke
    dalam deposito bank. */
    
        Scanner input = new Scanner(System.in);
        
        long uang;
        int tahun, A, b;
        double B;
        
        System.out.print("uang = ");
        uang = input.nextLong();
        
        System.out.println("tahun = ");
        tahun = input.nextInt();
        
        b = 6;
        B = (b * uang * tahun)/100;
        A = (int) (uang - B);
        System.out.println("*****************************************");
        System.out.println("Uang awal\t\t = " + uang);
        System.out.println("Bunga tahunan sebesar\t = " + b + " %");
        System.out.println("Lama menabung\t\t = " + tahun + " tahun");
        System.out.println("Saldo\t\t\t = " + A);
    }
}
