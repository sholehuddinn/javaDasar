package praktikum;

import java.util.Scanner;

public class prak8{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa : "); 
        int jumlah = input.nextInt(); 
        
        String HS[][] = new String[jumlah][4]; 
        double[][] datamahasiswa = new double[jumlah][4]; 
        String[] namamahasiswa = new String[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            int no = i + 1;

            System.out.println("Masukkan Nama Mahasiswa Ke - " + no + " : ");
            String nama = input.next();

            System.out.println("Masukkan Berat Badan Mahasiswa(dalam bentuk kg) Ke - " + no + " : ");
            double berat = input.nextDouble();

            System.out.println("Masukkan Tinggi Badan Mahasiswa (dalam bentuk m) Ke - " + no + " : ");
            double tinggi = input.nextDouble();

            double BMI = berat / Math.pow(tinggi, 2); 
            double hasil = BMI;
            
            datamahasiswa[i] = new double[]{berat, tinggi, BMI}; 
            namamahasiswa[i] = nama; 
            
            if (hasil < 18.5) {
                HS[i][1] = "Kekurangan Berat Badan";
            } else if (hasil >= 18.5 && hasil <= 24.9) {
                HS[i][1] = "Normal/Ideal";
            } else if (hasil >= 25.0 && hasil <= 29.9) 
                { HS[i][1] = "Kelebihan Berat Badan";
            } else if (hasil >= 30.0) {
                HS[i][1] = "Kegemukan / Obesitas";
            } else {
        }

        System.out.println();
        }
        
        for (int i = 0; i < datamahasiswa.length; i++) {
        System.out.println("======================================================");
            System.out.println("Nama Mahasiswa	: " + namamahasiswa[i]);
        System.out.println("Berat Mahasiswa : " + datamahasiswa[i][0] + " kg");
        System.out.println("Tinggi Mahasiswa : " + datamahasiswa[i][1] + " m"); System.out.println("BMI\t\t : " + datamahasiswa[i][2]);
        System.out.println("Status\t\t : " + HS[i][1]);
        System.out.println("======================================================");
        }
        }
        
        
        




    }
