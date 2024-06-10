package prak52;

import java.util.Scanner;
public class faris52 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int stk = 0;
        int hs = 0;
        String[][] historiProduk = new String[5][3];

        while (true) {
            System.out.println("\nMenu Manajemen Stok Produk:");
            System.out.println("1. Tambah Stok");
            System.out.println("2. Kurangi Stok");
            System.out.println("3. History Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih tindakan (1/2/3/4): ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan jumlah stok baru yang akan ditambahkan: ");
                int stkBaru = input.nextInt();
                if (stkBaru <= 0) {
                    System.out.println("Jumlah stok baru harus lebih besar dari 0");
                } else {
                    stk += stkBaru;
                    historiProduk[hs][0] = "Tambah Stok";
                    historiProduk[hs][1] = Integer.toString(stkBaru);
                    historiProduk[hs][2] = Integer.toString(stk);
                    hs++;
                    System.out.println("Stok berhasil ditambahkan, stok saat ini : " + stk);
                }
            } else if (pilih == 2) {
                System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
                int ks = input.nextInt();
                if (ks > stk) {
                    System.out.println("Stok tidak cukup untuk dikurangi");
                } else {
                    stk -= ks;
                    historiProduk[hs][0] = "Kurangi Stok";
                    historiProduk[hs][1] = Integer.toString(ks);
                    historiProduk[hs][2] = Integer.toString(stk);
                    hs++;
                    System.out.println("Stok berhasil dikurangi, stok saat ini : " + stk);
                }
            } else if (pilih == 3) {
                System.out.println("\nHistory Produk:");
                for (int i = 0; i < hs; i++) {
                    System.out.println((i + 1) + ". " + historiProduk[i][0] + " sebanyak " + historiProduk[i][1] + ", stok saat ini : " + historiProduk[i][2]);
                }
            } else if (pilih == 4) {
                System.out.println("Terima kasih");
                break;
            } else {
                System.out.println("Input salah, silahkan pilih angka 1-4");
            }
        }
    }
}
