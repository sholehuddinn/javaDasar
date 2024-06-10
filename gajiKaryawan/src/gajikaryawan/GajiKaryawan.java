package gajikaryawan;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gaji, prestasi;
        int stdGaji = 1000000;
        int stdPrestasi = 60;
        
        boolean isBonusGaji;
        System.out.print("MASUKAN GAJI = ");
        gaji = input.nextInt();
        
        System.out.print("MASUKKAN PRESTASI = ");
        prestasi = input.nextInt();
        
        isBonusGaji = (gaji<stdGaji)&&(prestasi>stdPrestasi);
        System.out.println(isBonusGaji);




    }
    
}
