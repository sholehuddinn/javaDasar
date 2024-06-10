package looping;

import java.util.*;

public class Loopingyutub {
    public static void main(String[] args) {

        int[] angka = {11,12,13,14,15,16,17,18,19,20};
        
        System.out.println("Looping Standard");
        for (int i = 0; i < 10; i++) {
            System.out.println("looping ke-" + i + " adalah : " + angka[i]);
        }
        
        System.out.println("Looping dengan property length");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("looping ke-" + i + " adalah : " + angka[i]);
        }
        
        System.out.println("Looping for each");     //array collection
        for ( int bilangan : angka) {
            System.out.println(bilangan);
        }
        
        System.out.println(Arrays.toString(angka)); //butuh import di atas
        
    }
    
}
