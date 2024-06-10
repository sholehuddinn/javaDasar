package javaapplication5;

import java.util.Arrays;

public class operasiString_1 {
    public static void main(String[] args) {
        
    //membuat String
        String kataString = "hallo";
        
        char[] kataChar = {'h','a','l','l','o'};
        
    //menampilkan String
        System.out.println(kataString);
        System.out.println(kataChar);
        System.out.println(Arrays.toString(kataChar));
        
    //menampilkan komponen dari String
        System.out.println("komponen pertama dari char : "+kataChar[0]);
        System.out.println("komponen pertama dari String : "+kataString.charAt(0));
        
    //merubah komponen char
    //merubah komponen String di java itu immutable (agar lebih save)
        kataChar[0] = 'c';
        System.out.println(kataChar);
        
    //kataString[0] = "c"; <------------ tidak bisa
    //kataString.charAt(0) = "c"; <------------ tidak bisa
        
    //merubah komponen String secara tidak langsung menggunakan .substring
        printAddress("kataString", kataString);
        
        kataString = "c" + kataString.substring(1, 5);
        
        printAddress("kataString", kataString);
        
    //memory khusus String = Stringpool 
        String s1 = "hallo";
        String s2 = "callo";
        String s3 = "test";
        String s4 = "testing";
        
        printAddress("s1", s1);
        printAddress("s2", s2);
        printAddress("s3", s3);
        printAddress("s4", s4);
        
        s4 = s4.substring(0, 4);
        printAddress("s4", s4);
     
    // Kesimpulan :
    // 1. String di java itu immutable
    // 2. String yang  berada di Stringpool itu memory nya akan reuseable / lebih evisien
    // 3. membuat String di method baru akan di taruh di memory lain bukan di Stringpool
    // kita liat lebih dalam
    
        String a = new String("hallo");
        printAddress("a", a);
        
    }
    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
