package tes_masuk_kampus;

import java.util.Scanner;

public class Tes_masuk_kampus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t\tKAMPUS QWERTY");
        System.out.println("==================================================");

        double tes_Psikotes, Nilai_Rata_rata_Rapor, nilai_Rata_rata_Ijazah, NA;
        String Pernyataan = "";
        
        System.out.print("TES PSIKOTES = ");
        tes_Psikotes = input.nextInt();
        
        System.out.print("NILAI RATA-RATA RAPORT = ");
        Nilai_Rata_rata_Rapor = input.nextInt();
        
        System.out.print("NILAI RATA-RATA IJAZAH = ");
        nilai_Rata_rata_Ijazah = input.nextInt();
        
        NA = ((tes_Psikotes * 0.2) + (Nilai_Rata_rata_Rapor * 0.4) + (nilai_Rata_rata_Ijazah * 0.4)) / 3;
        
        Pernyataan = (NA >= 30) ? "Diterima" : "Tidak Diterima";
        
        System.out.println("==================================================");
        System.out.println("Nilai Tes Psikolog= " + tes_Psikotes);
        System.out.println("Nilai Rata2 Rapor= " + Nilai_Rata_rata_Rapor);
        System.out.println("Nilai Rata2 Ijazah= " + nilai_Rata_rata_Ijazah);
        System.out.println("Nilai Akhir Anda Adalah= " + NA);
        System.out.println("==================================================");
        System.out.println(Pernyataan);
        System.out.println("==================================================");
        System.out.println("Powered by Muhammad Fajar");

    }
    
}
