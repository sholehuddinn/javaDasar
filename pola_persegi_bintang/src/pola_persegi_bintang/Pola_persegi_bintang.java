package pola_persegi_bintang;

import java.util.Scanner;

public class Pola_persegi_bintang {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Persegi Bintang ##");
    System.out.println("===================================");
    System.out.println();
     
    int besar_persegi,i,j;
  
    System.out.print("Input besar persegi: ");
    besar_persegi = input.nextInt();
    
    System.out.println();
    
    for(i=1; i<=besar_persegi; i++) {
      for(j=1; j<=besar_persegi; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    }
    
}
