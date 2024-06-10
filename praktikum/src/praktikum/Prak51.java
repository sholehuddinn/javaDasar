package praktikum;

import java.util.Scanner;

public class Prak51 {
    public static void main(String[] args) {

        Scanner x = new Scanner (System.in);
        
        int harga = 0, jumlah = 0, y = 0,total = 0;
        String q;
        
        System.out.println("---------APRILMART---------");
        System.out.print("Petugas Kasir : ");
            nama = x.nextLine();
        
        do {
            System.out.print("Banyak Jenis Barang : ");
                y = x.nextInt();
            System.out.println("");
            for (int i = 1; i <= y; i++) {
                    x = new Scanner (System.in);
                System.out.println("-------pesanan ke-" + i + "-------");
                System.out.print("Nama Barang\t: ");
                    nb = x.nextLine();
                System.out.print("Harga\t\t: Rp.");
                    harga = x.nextInt();
                System.out.print("Jumlah\t\t: ");
                    jumlah = x.nextInt();
                System.out.println("");
                    total += harga * jumlah;
                if (y == i) {
                        x = new Scanner (System.in);
                    System.out.print("apakah ada pesanan lainnya? (0=tidak/1=ya) \njawaban: ");   
                        q = x.nextLine();
                    System.out.println("");
                        i++;
                }            }
        } while (!q.equals("0"));
            System.out.println("total semuanya: Rp." + total);
        }
}



