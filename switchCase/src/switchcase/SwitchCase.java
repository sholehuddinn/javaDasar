package switchcase;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("masukkan nomor hari = ");
            int hari = input.nextInt();

            String namaHari = "";
            switch(hari){
                case 1 : namaHari = "ahad"; break;
                case 2 : namaHari = "senin"; break;
                case 3 : namaHari = "selasa"; break;
                case 4 : namaHari = "rabu"; break;
                case 5 : namaHari = "kamis"; break;
                case 6 : namaHari = "jum'at"; break;
                case 7 : namaHari = "sabtu"; break;
                
            }
            System.out.println("NAMA HARI ADALAH "+namaHari);

            if (hari <1 || hari>7){
                System.out.println("hari tidak di temukan");
            }else{
                System.out.println("");
            }
    
























    }
    
}
