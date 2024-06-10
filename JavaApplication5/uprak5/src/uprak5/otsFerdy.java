/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uprak5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class otsFerdy {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("Nama = ");
        String nama = x.nextLine();
        
        System.out.println("Asal Perguruan Tinggi = ");
        String pt = x.nextLine();
        
        System.out.println("");
        System.out.println("Masukkan nilai Tes Tulis Bidang:");
        
        System.out.print("Algoritma Pemrograman = ");
        double n1 = x.nextDouble();
        
        System.out.print("Rekayasa Perangkat Lunak = ");
        double n2 = x.nextDouble();
        
        System.out.print("Kecerdasan Buatan = ");
        double n3 = x.nextDouble();
        
        System.out.print("Jaringan Komputer = ");
        double n4 = x.nextDouble();
        
        System.out.println("");
        System.out.println("Masukkan Nilai Tes Wawancara");
        
        System.out.print("Kemampuan Komunikasi = ");
        double m1 = x.nextDouble();
        
        System.out.print("Motivasi = ");
        double m2 = x.nextDouble();
        
        System.out.print("Ide Rencana Tesis = ");
        double m3 =  x.nextDouble();
        
        String y = "";
        double tulis, wawan, putusan;
        tulis = (n1*0.25)+(n2*0.25)+(n3*0.25)+(n4*0.25);
        wawan = (m1*0.35)+(m2*0.35)+(m3*0.3);
        putusan = (tulis*0.6)+(wawan*0.4);
        
        if (putusan >= 80 && putusan <= 100){
            y = "Diterima";
        }else if (putusan > 100){
            y = "Over Load";
        }else{
            y = "Tidak Diterima";
        }
        
        System.out.println("");
        System.out.println("Hasil Ujian");
        System.out.println("Nama Calon Mahasiswa\t= " +nama);
        System.out.println("Asal Perguruan Tinggi\t= "+pt);
        System.out.println("Akumulasi Nilai Tes Tulis Bidang\t= "+tulis );
        System.out.println("Akumulasi Nilai Tes Wawancara\t= "+wawan);
        System.out.println("Akumulasi Penilaian Total\t= "+putusan);
        System.out.println("Keputusan Penerimaan\t= "+y);
        
        
        
        
        
        
        
        
    }
}
