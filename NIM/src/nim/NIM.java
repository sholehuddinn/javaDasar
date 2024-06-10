package nim;

import java.util.Scanner;

public class NIM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String NIM = "";
        System.out.println("MASUKKAN PILIHAN");
        System.out.println("================");
        
        System.out.print("tahun = ");
        int tahun = input.nextInt(); 
        NIM += tahun;
        
        System.out.println("");
        System.out.println("1. pagi");
        System.out.println("2. sore");
        System.out.print("MASUKKAN ANGKA KELAS = ");
        
        int kelas;
        kelas = input.nextInt();
        
        if(kelas == 1){
            NIM += "11";
        }else if(kelas == 2){
            NIM += "21";
        }else{
            System.err.println("eror");
        }
            System.out.println("");
        System.out.println("1. TEKNIK SIPIL");
        System.out.println("2. TEKNIK INFORMATIKA");
        System.out.println("3. TEKNIK GEOMATIKA");

        System.out.print("MASUKKAN ANGKA JURURSAN = ");
        int jurusan = input.nextInt();
        
        switch (jurusan){
            case 1  : NIM += "4100";
            break;
            case 2  : NIM += "4200";
            break;
            case 3  : NIM += "4300";
            break;
            default : System.err.println("eror");
            break;
        }
        int rand = (int)(Math.random()*100);
        NIM += rand;
        
        System.out.println("");
        System.out.println("NIM = "+NIM);        
    }
}
