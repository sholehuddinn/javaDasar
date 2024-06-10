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
public class materi7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("masukkan panjang array : ");
        int inp = in.nextInt();
        
        int[] angka = new int[inp];
        
        for (int i = 0; i < inp; i++) {
            System.out.print("Masukkan Angka ke-" + (i + 1) + " : ");
            angka[i] = in.nextInt();
        }
        System.out.println("Isi Array :");
        for (int i = 0; i < inp; i++) {
            System.out.println("Angka ke-" + (i + 1) + " : " + angka[i]);
        }
        System.out.print("nilai maksimal : ");
        int max = angka[0];
        for (int i = 0; i < inp; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println(max);
    }
}