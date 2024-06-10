package array;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String    buah;
        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
        buah[i] = scan.nextLine();
        }
        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }
    }
   
}
