package loopingyutub;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int awal, akhir, hasil, i;
        System.out.println("Masukkan Angka");
        System.out.print("Angka Awal  = ");
        awal=x.nextInt();
        System.out.print("Angka Akhir = ");
        akhir=x.nextInt();
        
        if (awal<akhir){
        for (int j = awal; j < akhir; j++) {
            hasil = j % 2;
            if (hasil==1)
                System.out.println("\tganjil = "+j);
            else{
                System.out.print("\tgenap = "+j);
            }
        }
        }else{
            System.exit(0);
        }
        
        
        
        
        
    }
}
