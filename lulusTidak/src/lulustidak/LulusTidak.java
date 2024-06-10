package lulustidak;

import java.util.Scanner;

public class LulusTidak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.println("MASUKKAN NILAI TUGAS = ");
        int tugas = input.nextInt();
        
        System.out.println("MASUKKAN NILAI UTS = ");
        int uts = input.nextInt();
        
        System.out.println("MASUKKAN NILAI UAS = ");
        int uas = input.nextInt();
        
        double nilaiAkhir = (tugas+uts+uas)/3;
        boolean isPassed = nilaiAkhir >= 70;
        System.out.println("LULUS / TIDAK = " + isPassed);


    }
    
}
