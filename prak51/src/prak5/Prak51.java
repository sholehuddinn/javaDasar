package prak5;

import java.util.Scanner;

public class Prak51 {
    public static void main(String[] args) {

        Scanner x = new Scanner (System.in);
        
        int harga = 0, jumlah = 0, y = 0, banyak = 0;
        String  nama = "", nb = "", q = "";
        
        System.out.println("---------APRILMART---------");
        System.out.println("Petugas Kasir : ");
            nama = x.nextLine();
        System.out.println("Banyak Jenis Barang : ");
            y = x.nextInt();
            
        for (int i = 1; i < y; i++) {
            System.out.println("-------pesanan ke-" + i +"--------");
            System.out.print("Nama Barang\t: ");
                nb = x.nextLine();
            System.out.println("Harga\t\t:");
                harga = x.nextInt();
            System.out.println("Banyak\t\t:");
                banyak = x.nextInt();
            System.out.println("");
                jumlah += harga * banyak;
            
            System.out.print("apakah ada pesanan lainnya? (0=tidak/1=ya) \njawaban: ");
                q = x.nextLine();
                
            if (q.equals("1")) {
                System.out.println("Banyak Jenis Barang : ");
                    y = x.nextInt();
            
                    for (int i = 1; i < y; i++) {
                System.out.println("-------pesanan ke-" + i +"--------");
                System.out.print("Nama Barang\t: ");
                    nb = x.nextLine();
                System.out.println("Harga\t\t:");
                    harga = x.nextInt();
                System.out.println("Banyak\t\t:");
                    banyak = x.nextInt();
                System.out.println("");
                    jumlah += harga * banyak;
                
            }else{
            break;
            }
        }
            System.out.print("total semuanya: Rp." + jumlah);
    }
    
}
