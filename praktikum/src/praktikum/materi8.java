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
public class materi8 {
    public static void main(String[] args) {
                            
        Scanner in = new Scanner (System.in);
        
        System.out.print("Data Mahasiswa : ");
            int data = in.nextInt();
        
        String[][] data2 = new String [data][3];
        
        for (int i = 0; i < data; i++) {
            in = new Scanner (System.in);
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("Nama\t: ");
                data2[i][0] = in.nextLine();
            System.out.print("Nim\t: ");
                data2[i][1] = in.nextLine();
            System.out.print("Prodi\t: ");
                data2[i][2] = in.nextLine();
            System.out.println("");
        }
        
        System.out.println("Data Mahasiswa");
        
        for (int i = 0; i < data; i++) {
            System.out.println("Nama\t: " + data2[i][0]);
            System.out.println("Nim\t: " + data2[i][1]);
            System.out.println("Prodi\t: " + data2[i][2]);
            System.out.println("---------------------------------");
        }
        
        
        
        
        
    }
}
