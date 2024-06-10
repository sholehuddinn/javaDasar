
package ujianpraktekm.fajar;

import java.util.Scanner;

public class uprak4 {
    public static void main(String[] args) {
        
    
     Scanner input = new Scanner (System.in);
        
        String bidangMinat = "";
        
        System.out.print("Masukkan Nama : ");
        String Nama = input.nextLine ();
        
        System.out.print("Masukkan NIM : ");
        long NIM = input.nextLong();
        
        System.out.print("Masukkan Nilai IPA : ");
        int IPA = input.nextInt();
        
        System.out.print("Masukkan Nilai IPS : ");
        int IPS = input.nextInt();
        
        System.out.print("Masukkan Nilai Bahasa : ");
        int Bahasa = input.nextInt();
        
        int PassingGradeIPA = 80;
        int PassingGradeIPS = 0;
        int PassingGradeBahasa = 80;
        
        
        String kelas = input.nextLine ();
        if (IPA>=PassingGradeIPA && IPS >=PassingGradeIPS && Bahasa >=PassingGradeBahasa){
            System.out.println("anda dapat memilih bidang minat IPA, IPS, atau Bahasa");

 
        }else if (IPS >=PassingGradeIPS && Bahasa >=PassingGradeBahasa){
            System.out.println("anda dapat memilih bidang minat IPS atau Bahasa");
            
    
        }else if (IPA>=PassingGradeIPA ){
            System.out.println("anda dapat memilih bidang minat IPA");
            
        }else if (IPS >=PassingGradeIPS){
            System.out.println("anda dapat memilih bidang minat Bahasa");
           
        }else if (Bahasa >=PassingGradeBahasa) {
            System.out.println("anda dapat memilih bidang minat Bahasa");
        }else {
            System.out.println("anda tidak bisa memilih");
        }
        
       
        System.out.println("");
        System.out.println("IPA");
        System.out.println("IPS");
        System.out.println("Bahasa");
        
        
        System.out.print("Pilih bidang minat : ");
        bidangMinat = input.nextLine ();
        switch ("IPA"){
            case "IPA" : 
                System.out.println("IPA");
                 break;
            case "IPS" :
                System.out.println("IPS");
                 break;
            case "Bahasa":
                System.out.println("Bahasa");
            default:
                System.out.println("Tidak Ada");
                
       
       
    }
        System.out.println("Nama Siswa : "+Nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Keputusan penjurusan : "+bidangMinat);
    }
}
