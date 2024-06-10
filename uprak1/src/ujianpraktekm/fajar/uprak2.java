
package ujianpraktekm.fajar;

import java.util.Scanner;

public class uprak2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ======================================= ");
        System.out.println(" === Selamat Datang Di Bioskop Batam === ");
        System.out.println(" ======================================= ");
        System.out.println("Daftar Film");
        System.out.println("1. Aquamen");
        System.out.println("2. Bumblebee");
        System.out.println("3. Spider-Man");
        
        System.out.print("Pilih Nomor Film : ");
        int filmpilihan = input.nextInt();
        System.out.print("Jumlah Tiket Yang Ingin Dibeli : ");
        int jumlahtiket = input.nextInt();
        
        switch (filmpilihan) {
            case 1:
                handleAquamen(jumlahtiket);
                break;
            case 2:
                handleBumblebee(jumlahtiket);
                break;
            case 3:
                handleSpiderman(jumlahtiket);
                break;
            default :
                System.out.println("Pilihan Tidak Ada");
        }
        input.close();
    }
    
    private static void handleAquamen (int jumlahtiket){
        double hargatiket = 35000;
        double totalharga = hargatiket * jumlahtiket;
        
        if (jumlahtiket >= 4) {
            double diskon = totalharga * 0.1;
            totalharga -= diskon;
            System.out.println("Anda Mendapatkan Diskon 10%");
        }
        System.out.println("Total Harga : Rp. " + totalharga);       
    }
    private static void handleBumblebee (int jumlahtiket){
        double hargatiket = 38000;
        double totalharga = hargatiket * jumlahtiket;
        
        if (jumlahtiket >= 5){
            System.out.println("Anda Mendapatkan Bonus 1 PopCorn");
        }
        System.out.println("Total Harga : Rp. " + totalharga);
    }
    private static void handleSpiderman (int jumlahtiket){
        double hargatiket = 22000; 
        double totalharga = hargatiket * jumlahtiket;
        
        if (totalharga >= 60000 && totalharga <= 90000){
            System.out.println("Anda Mendapatkan Bonus 1 Pop Corn Dan 1 Pepsi");
        }else if (totalharga > 90000) {
            System.out.println("Anda Mendapatkan Bonus 3 PopCorn dan 2 Pepsi");
        }else if (totalharga >= 5){
            System.out.println("Anda Mendapatkan Bonus 1 Pop Corn");
    }
        System.out.println("Total Harga :Rp" + totalharga);
    }
}
