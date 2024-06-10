package pola_segitiga_terbalik_bintang;

import java.util.Scanner;

public class Pola_segitiga_terbalik_bintang {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Segitiga Bintang Terbalik ##");
    System.out.println("=============================================");
    System.out.println();
     
    int tinggi_segitiga,i,j;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();
     
    System.out.println();
    
    for(i = 0; i < tinggi_segitiga; i++) {
      for(j = 1; j <= tinggi_segitiga-i; j++) {
        System.out.print(" *");
      }
      System.out.println();
    }



    }
    
}
