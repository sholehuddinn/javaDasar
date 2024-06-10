package praktikum;

import java.util.Scanner;

public class masmas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");
            System.out.println("Pilih operasi kalkulator:");
            
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan kalkulator kami. Sampai jumpa!");
                break; // Keluar dari loop jika pengguna memilih '0'
            } else if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                double angka1 = input.nextDouble();

                System.out.print("Masukkan angka kedua: ");
                double angka2 = input.nextDouble();

                double hasil = 0;

                if (pilihan == 1) {
                    hasil = angka1 + angka2;
                } else if (pilihan == 2) {
                    hasil = angka1 - angka2;
                } else if (pilihan == 3) {
                    hasil = angka1 * angka2;
                } else if (pilihan == 4) {
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Pembagian oleh nol tidak diizinkan.");
                        continue; // Lanjut ke iterasi berikutnya jika pembagian oleh nol
                    }
                }

                System.out.println("Hasil: " + hasil);
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka antara 0 dan 4.");
            }
        }
        input.close();
    }
}
