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
public class prak8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int a = 0;
        double[][] bmi = new double[9999][3];    //    BMI  = [a][0] = Berat Badan / [a][1] = Tinggi Badan / [a][3] = bmi
        String[][] data = new String [9999][2];  // out = [a][0] = nama / [a][1] = status
    
        System.out.println("Berhenti = 0 !!");
        
        do{
            in = new Scanner (System.in);
                System.out.print("Nama\t: ");
                        data[a][0] = in.nextLine();
                System.out.print("Berat\t: ");
                        bmi[a][0] = in.nextDouble();
                System.out.print("Tinggi\t: ");
                        bmi[a][1] = in.nextDouble();
                System.out.println("");
                a++;
        }while(!data[a-1][0].equals("0"));
        
        for (int i = 0; i < (a - 1); i++) {
            bmi[i][2] = bmi[i][0] / Math.pow(bmi[i][1] / 100, 2);
            
            if (bmi[i][2] >= 30.0) {
                data[i][1] = "Obesitas / Kegemukan";
            }else if (bmi[i][2] < 30.0 && bmi[i][2] >= 25.0) {
                data[i][1] = "Kelebihan Berat Badan";
            }else if (bmi[i][2] < 25.0 && bmi[i][2] >= 18.50) {
                data[i][1] = "Normal / ideal";
            }else if (bmi[i][2] < 18.53) {
                data[i][1] = "Kekurangan Berat Badan";
            }
        }
        
        System.out.println("OUTPUT!!");
        System.out.println("======================================");
        for (int i = 0; i < (a - 1); i++) {
            System.out.println("Nama Mahasiswa\t : " + data[i][0]);
            System.out.println("Berat Mahasiswa\t : " + bmi[i][0] + " kg" );
            System.out.println("Tinggi Mahasiswa : " + bmi[i][1] / 100 + " m" );
            System.out.println("BMI\t\t : " + bmi[i][2]);
            System.out.println("Status\t\t : " + data[i][1]);
            System.out.println("======================================");
        }
    }
}
