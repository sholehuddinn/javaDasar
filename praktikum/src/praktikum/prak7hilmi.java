/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class prak7hilmi {
    public static void main(String[] args) {
        
        String[] nama = new String[9];
        String[] namaBrg = {"Almamater", "Buku\t", "Alat Tulis", "Spidol\t", "Tas\t"};
        String[] pilih = {"Lihat Barang", "Beli Barang ", "Lihat keranjang"};
        int[] Stock = {100, 150, 300, 50, 20};
        int[] harga = {150000, 75000, 5000, 10000, 250000};
        Scanner input = new Scanner(System.in);

        int x = 0, Harga = 0;

        System.out.println("=== Selamat datang di toko online UNITOMO ===");

        do {
            System.out.println("=============================================");
            for (int i = 0; i < pilih.length; i++) {
                System.out.println((i + 1) + ". " + pilih[i]);
            }
            System.out.println("=============================================");
            System.out.print("pilih (1/2/3) : ");
            int pilih1 = input.nextInt();

            if (pilih1 == 1) {
                System.out.println("");
                System.out.println("===Nama===\t===Stock===\t===Harga===");
                for (int i = 0; i < namaBrg.length; i++) {
                    System.out.println(namaBrg[i] + "\t   " + Stock[i] + "\t\t  Rp." + harga[i]);
                }
                System.out.println("");
            } else if (pilih1 == 2) {
                System.out.println("=============================================");
                System.out.println("");

                for (int i = 0; i < namaBrg.length; i++) {
                    if (i == 3) {
                        namaBrg[3] = "Spidol";
                    }
                    System.out.println((i + 1) + ". " + namaBrg[i] + "\t\tRp." + harga[i]);
                }
                System.out.println("=============================================");
                System.out.print("Pilih Barang (1-5) : ");
                int pilih2 = input.nextInt();

                x++;
                for (int i = 0; i < 9999999; i++) {
                    if ((pilih2 - 1) == i) {
                        nama[x] = namaBrg[i];
                        Stock[i] -= 1;
                        Harga += harga[i];
                    }
                }
            } else if (pilih1 == 3) {
                System.out.println("");
                System.out.println("==================keranjang==================");
                for (int i = 0; i <= x; i++) {
                    if (nama[i] != null) {
                        System.out.println(i + ". " + nama[i]);
                    }
                }
                System.out.println("=============================================");
                System.out.println("Total Harga = " + Harga);
                break;
            }
        } while (true);

        
        
        
        
        
    }
}
