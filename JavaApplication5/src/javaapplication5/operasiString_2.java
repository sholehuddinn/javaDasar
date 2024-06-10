package javaapplication5;

import java.util.*;
import java.lang.String;

public class operasiString_2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        String kalimat = "Saya Suka Makan Pisang";
        
    //mengambil komponen dari String
        System.out.println(kalimat.charAt(2));
        
    //Substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);
        
    //concatenation / concat / menggabungkan
        String kalimat2 = kata + " bakso";
        System.out.println(kalimat2);
        
        kata += " bakwan";
        System.out.println(kata);
        
    //concat dengan non String
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);
        
    //lowercase dan uppercase
        System.out.println(kalimat.toLowerCase());
        System.out.println(kalimat.toUpperCase());
        
    //replace
        String kalimat4 = kalimat.replace("Pisang", "matang");
        System.out.println(kalimat);
        System.out.println(kalimat4);
    
    //equality ( persammaan )
        String kataInput = new String("test");    //ini bukan String literal (berada di luar Stringpool)
//        String kataInput = "test";  //kata nya ada di Stringpool
        String kataTest = "test";   //ini juga ada di Stringpool
    
    //compare
        String gorengan1 = "bakwan";
        String gorengan2 = "ote-ote";
        System.out.println(gorengan1.compareTo(gorengan2));     //membandingkan  b sampai o
        System.out.println(gorengan2.compareTo(gorengan1));
        
        System.out.println("persamaan pada lokasi");
    //membandingkan Address nya    
        if (kataInput == kataTest) {
            System.out.println("sama");
        }else{
            System.out.println("beda");
        }
    
    //kalo inputnya dari user berati di memory hit bukan Stringpool
        System.out.print("mengambul input dari user : ");
        String KataInput = in.nextLine();
        System.out.println(KataInput);
        //cek address
        if (KataInput == kataTest) {
            System.out.println("sama");
        }else{
            System.out.println("beda");
        }
        //cek isi
        if (KataInput.equals(kataTest)) {
            System.out.println("sama");
        }else{
            System.out.println("beda");
        }
    
    
    
        
        
    }
}
