package praktikum;

import java.util.Scanner;

public class prak52 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
      //st = stok tersedia
      //ks = kurangi stok
      //ts = tambah stok
      //hs = histori produk
        int st, ks = 0, ts = 0, hs, k, total = 0,j = 0; 
        boolean ulang = true;
        st = 15;
        String pilih, enter;
        
        for (k = 0; ulang; ) {
            x = new Scanner(System.in);
            System.out.println("Stok tersedia : " + st );
            System.out.println("\nMenu :");
            System.out.println("1. Tambah Stok\n2. kurangi Stok\n3. History produk\n4. keluar");
            System.out.println("\nPilih Tindakan (1/2/3/4) :");
            pilih = x.nextLine();
        
        if (pilih.equals("1")){
            do {
                System.out.println("Jumlah yang akan di tambahkan");
                ts = x.nextInt() ;
                st += ts;
                break;
            } while (ulang);
                System.out.println("Stok Berhasil Ditambahkan");
                x = new Scanner(System.in);
                enter = x.nextLine();
        }else if (pilih.equals("2")){
            do {
                System.out.println("Jumlah yang akan di kurangkan");
                ks = x.nextInt() ;
                st -= ks;
                break;
            } while (ulang);
                System.out.println("Stok Berhasil Kurangkan");
                x = new Scanner(System.in);
                enter = x.nextLine();
            
        }else if (pilih.equals("3")){
                System.out.println("History Produk");
            
        }else if(pilih.equals("4")){
            System.out.println("Terima Kasih");
            ulang = false;
        }else{
            System.out.println("PILIHAN TIDAK ADA !!");
        }    
        }
    }
}
