
package pola_persegi_panjang_bintang;

import java.util.Scanner;

public class Pola_persegi_panjang_bintang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
    System.out.println("##  Program Java Persegi Panjang Bintang ##");
    System.out.println("===========================================");
    System.out.println();
     
    int tinggi_persegi,lebar_persegi,i,j;
  
    System.out.print("Input tinggi persegi: ");
    tinggi_persegi = input.nextInt();
    
    System.out.print("Input lebar persegi: ");
    lebar_persegi = input.nextInt();
     
    System.out.println();
    
    for(i=1; i<=tinggi_persegi; i++) {
      for(j=1; j<=lebar_persegi; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }
     
    }
    
}
