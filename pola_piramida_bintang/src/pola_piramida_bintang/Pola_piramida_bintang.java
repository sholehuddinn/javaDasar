package pola_piramida_bintang;

import java.util.Scanner;

public class Pola_piramida_bintang {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Piramida Bintang ##");
    System.out.println("====================================");
    System.out.println();
     
    int tinggi_segitiga,i,j,k;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();
     
    System.out.println();
    
    for(i=1; i<=tinggi_segitiga; i++) {
  
      for(j=1; j<=tinggi_segitiga-i; j++) {
        System.out.print(" ");
      }
    
      for(k=1; k<=i; k++) {
        System.out.print(i+" ");
      }
      System.out.println();
    }

    }
    
}
