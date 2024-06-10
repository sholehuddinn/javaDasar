package soalpilgan;

import java.util.Scanner;

public class SoalPilgan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("berapa umumnya tegangan listrik rumah...");
        System.out.println("A. 220");
        System.out.println("B. 110");
        System.out.println("C. 890");
        System.out.println("D. 674");
        System.out.println("E. 329");
        
        System.out.print("silahkan pilih jawaban yang benar = ");
        String pilihan = input.nextLine();

        if (pilihan.equalsIgnoreCase("A")){
            System.out.println("jawaban benar");
        }else{
            System.out.println("jawaban salah");
        }













    }
    
}
