
package javaapplication54;

import java.util.Scanner;

public class JavaApplication54 {

    public static void main(String[] args) {
 
//        1. Seorang mahasiswa ingin menghitung panjang sisi miring segitiga siku - siku.Dia
//           memiliki panjang sisi - sisi lainnya, yaitu sisi tegak(a = 5) dan sisi alas(b = 12).Bantulah
//           mahasiswa ini menghitung panjang sisi miring (c =  ?) menggunakan rumus Pythagoras:
//           c = √(a ^ 2 + b ^ 2 ). 
        
        Scanner input = new Scanner(System.in);
        
        int a, b;
        double c;
        
        System.out.print("a = ");
        a = input.nextInt();
        
        System.out.print("b = ");
        b = input.nextInt();
        
        c = Math.sqrt(Math.pow(a, 2)+(Math.pow(b, 2)));
        
        System.out.println("==================");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        } 
    }
    

