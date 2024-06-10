
package ujianpraktekm.fajar;

import java.util.Scanner;

public class Uprak1 {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama\t\t= ");
        String nama = input.nextLine();
        
        System.out.print("No. KTP\t\t= ");
        String ktp = input.nextLine();
        
        System.out.print("Durasi Menginap\t= ");
        short inap = input.nextShort();
        
        System.out.println("");
        
        System.out.println("Masukkan Jumlah Tipe Kamar Yang Akan Di sewa : ");
        System.out.print("Standard Room\t= ");
        short tipe1 = input.nextShort();
        
        System.out.print("Superrior room\t= ");
        short tipe2 = input.nextShort();
        
        System.out.print("Suite Room\t= ");
        short tipe3 = input.nextShort();
        
        System.out.println("");
        
        System.out.println("Masukkan Jumlah Fasilitas Tambahan Yang Akan Disewa");
        System.out.print("Extra Bed\t= ");
        short exbed = input.nextShort();
        
        System.out.println("====================================================");
        
        int  x, total, xtra, out ;
        if (tipe1 >0 ){
            x = tipe1 * 350000 * inap;
        }else if (tipe2 >0 ){
            x = tipe2 * 550000 * inap;
        }else if (tipe3 >0){
            x = tipe3 * 700000 * inap;
        }else{
            x = 1;
        }
        
        xtra = exbed * 50000 * inap;
        out = x + xtra;
        
        System.out.println("Nama pelanggan                      = " + nama);
        System.out.println("Nomor KTP                           = " + ktp);
        System.out.println("Durasi Menginap                     = " + inap + " hari");
        System.out.println("Total Biaya Sewa Kamar              = " + x);
        System.out.println("Total Biaya Sewa Fasilitas Tambahan = " + xtra);
        System.out.println("Total Yang Harus Dibayar            = " + out);
    }
    
}
