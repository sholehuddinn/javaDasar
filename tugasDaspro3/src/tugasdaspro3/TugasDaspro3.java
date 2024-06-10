package tugasdaspro3;

import java.util.Scanner;

public class TugasDaspro3 {
    public static void main(String[] args) {

        String nama;
        int lamaKerja, usia, gaji, Bg , tunjangan, m=0;
        double pajak;
        
        tunjangan = 1000000;
        int bg1 = 2500000;
        int bg2 = 1500000;
        int bg3 = 1000000;
        
        Scanner input = new Scanner(System.in);

        System.out.println("\tTOTAL GAJI SELAMA SATU TAHUN");
        System.out.println("\t\tPT XYZ");
        
        System.out.println("==================================================");
        
        System.out.print("masukkan nama    = ");
        nama = input.nextLine();
        
        System.out.print("masukkan usia    = ");
        usia = input.nextInt();

        System.out.print("lama kerja di pt = ");
        lamaKerja = input.nextInt();
        
        System.out.print("gaji\t\t = ");
        gaji = input.nextInt();        
        
        if((usia>=55)&&(lamaKerja>=7)){
            System.out.println("bonus gaji\t = " + (m=bg1));
        }else if ((usia<55)&&(lamaKerja>=7)){
            System.out.println("bonus gaji\t = " + (m=bg2));
        }else if((usia>1)&&(lamaKerja<7)){
            System.out.println("bonus gaji\t = " + (m=bg3));
        }else{
            System.out.println("");
        }
        System.out.println("pajak\t\t = 3%");
        System.out.println("==================================================");
        
        System.out.println("nama karyawan\t = " + nama);
        System.out.print("usia\t\t = " + usia);
        System.out.println(" Tahun");
        System.out.print("lama kerja di pt = " + lamaKerja);
        System.out.println(" Tahun");
        System.out.println("gaji pokok\t = " + gaji);
        System.out.println("bonus gaji\t = " + m);
        System.out.println("total \t\t = " + (Bg = gaji + m));
        
        pajak = ((3*Bg)/100);
        System.out.println("pajak\t\t = " + (int)pajak);
        System.out.println("tunjangan\t = " + tunjangan);
        System.out.println("terima gaji\t = " + (long)(Bg+tunjangan-pajak));
                
        System.out.println("==================================================");
        System.out.println("Powered by Muhammad Fajar");
        

        }
    }
    

