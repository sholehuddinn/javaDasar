package loopingyutub;

import java.util.Scanner;

public class penjumlahanLooping {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        int awal,akhir,total;
        
        System.out.print("nilai awal = ");
        awal=x.nextInt();
        System.out.print("nilai akhir = ");
        akhir = x.nextInt();
        
        total = 0;
        
        while (awal<=akhir){
            total = total + awal;
            System.out.println("tambah "+awal+" jadi "+total);
            awal++;
        }
    }
  
}
