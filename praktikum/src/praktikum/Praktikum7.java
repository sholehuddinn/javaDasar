package praktikum;

import java.util.Scanner;

public class Praktikum7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Harga = 0, pilihBarang, pilih, a = 0;
        
        String[] nama = new String[99999];
        String[] menu = {"1. Lihat Barang", "2. Beli Barang", "3. Lihat Keranjang"};
        String[] nb = {"Almamater", "Buku\t", "Alat Tulis", "Spidol", "Tas\t"};
        int[] stok = {100, 150, 300, 50, 20};
        int[] harga = {150000, 75000, 5000, 10000, 250000};

        System.out.println("=== Selamat datang di toko online UNITOMO ===");
        do {
        System.out.println("=============================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("=============================================");
            System.out.print("Pilih (1/2/3): ");
            pilih = in.nextInt();
            System.out.println("");
            
            if (pilih == 1) {
                System.out.println("===NAMA===\t    ===STOK===  ==HARGA===");
                for (int i = 0; i < nb.length; i++) {
                    if (i == 3) {
                        nb[3] = "Spidol\t";
                    }
                    System.out.printf("%1$s\t    %2$d\t\tRp.%3$,d;\n", nb[i], stok[i], harga[i]);
                }
            }else if (pilih == 2) {
                a++;
                System.out.println("===NAMA===\t    ===HARGA===");
                for (int i = 0; i < nb.length; i++) {
                    if (i == 3) {
                        nb[3] = "Spidol";
                    }
                    System.out.printf("%1$d. %2$s\t    Rp.%3$,d;\n", (i + 1), nb[i], harga[i]);
                }
                    System.out.print("Pilih Barang : ");
                    pilihBarang = in.nextInt();
                for (int i = 0; i < 99999; i++) {
                    if ((pilihBarang - 1) == i) {
                        nama[a] = nb[i];
                        stok[i] -= 1;
                        Harga += harga[i]; 
                    }
                }
                System.out.println("");
            }else if (pilih == 3) {
                System.out.println("==================KERANJANG==================");
                for (int i = 0; i <= a; i++) {
                    if (nama[i] != null) {
                        System.out.println(i + ". " + nama[i]);
                    }
                }
                System.out.println("=============================================");                                                  
                System.out.printf("Total Harga : %1$,d;\n", Harga);
                break;
            }else{
                continue;
            }
        } while (true);
    in.close();
    }    
}