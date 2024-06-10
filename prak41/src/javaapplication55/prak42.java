package javaapplication55;

import java.util.Scanner;

public class prak42 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("---- List Buah ----\n1. Apel\n2. Mangga\n3. Jeruk");
        System.out.print("Masukkan Pilihan Anda [1 - 3] \n>> ");
        short pilih = x.nextShort();
        
        int h1 = 0;
        String z ="";
        switch (pilih){
            case 1 :
                z = "Apel";
                h1 = 4300;
                break;
            case 2 :
                z = "Mangga";
                h1 = 6200;
                break;
            case 3 :
                z = "jeruk";
                h1 = 5500;
                break;
            default :
                System.exit(0);
                break;
        }
        System.out.println("");
        System.out.print("Jumlah " + z + " Yang Akan Dibeli \n>> ");
        int jumlah = x.nextInt();
        
        int h2,potong = 0,potongan,bayar,kembali;
        double d1,diskon = 0,harga = 0;
        h2 = h1 * jumlah;
        
        switch (pilih) {
            case 1 :
                if (jumlah > 10 && jumlah <=20){
                    potong=6000;
                    diskon=0;
                }else if (jumlah > 20 && jumlah <= 30){
                    potong = 0;
                    diskon = 15;
                }else if (jumlah > 30 ){
                    potong = 6000;
                    diskon = 15;
                }
                break;
            case 2 :
                if (jumlah > 12 && jumlah <=22){
                    potong = 5000;
                    diskon = 0;
                }else if (jumlah > 22 && jumlah <= 32){
                    potong = 0;
                    diskon = 10;
                }else if (jumlah > 32 ){
                    potong = 5000;
                    diskon = 10;
                }
                break;
            case 3 :
                if (jumlah > 14 && jumlah <=24){
                    potong = 4000;
                    diskon = 0;
                }else if (jumlah > 24 && jumlah <= 34){
                    potong = 0;
                    diskon = 5;
                }else if (jumlah > 34 ){
                    potong = 4000;
                    diskon = 5;
                }
                break;
            default :
                potong = 0;
                diskon = 0;        
           }
        d1 = diskon * h2/100;
        potongan = (int) (potong + d1);
        harga = h2 - potongan;
        
        System.out.println("------------- PEMBAYARAN -------------");
        System.out.println("Harga Satuan\t\tRp."+h1);
        System.out.println("Harga Awal\t\tRp."+h2);
        System.out.println("Potongan Harga\t\tRp."+potongan);
        System.out.println("diskon\t\t\tRp."+(int)diskon+"%");
        System.out.println("--------------------------------------");
        System.out.println("Total Harga\t\tRp."+(int)harga);
        System.out.print("Masukkan Nominal Pembayaran\n>> ");
        bayar = x.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("============= NOTA =============");
        System.out.println("Buah\t\t"+z);
        System.out.println("Jumlah\t\t"+jumlah);
        System.out.println("Harga Satuan\tRp."+h1);
        System.out.println("--------------------------------");
        System.out.println("Harga Awal\tRp."+h2);
        System.out.println("Potongan Harga\tRp."+potongan);
        System.out.println("diskon\t\t"+(int)diskon+"%");
        System.out.println("Total Harga\tRp."+(int)harga);
        System.out.println("Total Bayar\tRp."+bayar);
        System.out.println("--------------------------------");
        kembali = (int) (bayar - harga);
        System.out.println("Kembali\t\tRp."+kembali);
        System.out.println("================================");
        System.out.println("          Terima Kasih");
        System.out.println("================================");
    }
}
