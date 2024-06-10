package javaapplication55;

import java.util.Scanner;

public class prak43 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        int lk,gaji,um,ta,anak,total,bAnak = 0,Bonusa = 0;
        double bonus = 0;
        
        System.out.print("lama kerja = ");
        lk = x.nextInt();
        
        System.out.print("anak = ");
        anak = x.nextInt();
        
        gaji = 4000000;
        um = 1000000;
        
        if (anak <= 3){
            Bonusa = anak;
        }else if (anak >3){
            Bonusa = 3;
        }
        
        if (lk < 1){
            bonus = 0;
            bAnak = 0;
        }else if (anak > 0 && lk <=10){
            bonus = 400000;
            bAnak = 100000 * Bonusa;
        }else if (lk >10 && anak > 0){
            bonus = 800000;
            bAnak = 150000 * Bonusa;
        }
        
        total = (int) (gaji + bonus + bAnak);
        
        System.out.println("lama kerja = "+lk+" tahun"); 
        System.out.println("anak = "+anak);
        System.out.println("gaji = "+gaji);
        System.out.println("bonus = "+(int)bonus);
        System.out.println("tunjangan anak = "+bAnak);
        System.out.println("total gaji = "+total);
        System.out.println(Bonusa);
    }
  
}
