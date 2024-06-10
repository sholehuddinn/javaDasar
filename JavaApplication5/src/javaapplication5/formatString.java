/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Dell
 */
import java.lang.*;
import java.util.*;

public class formatString {
    public static void main(String[] args) {
        
        String nama = "udin";
        int umur = 18;
        
        System.out.println("nama saya " + nama + ", umur saya " + umur);
        System.out.printf("nama saya %s, umur  saya %d %%", nama, umur);
        
    // struktur format = %[argumen_indeks$][flags][width][.precission] conversion
    
    // %d = integer    
    // [argumen_indeks$]
        System.out.println("\n\n[argumen_indeks$]");
    // udin bayaya udin rinio udin
        System.out.printf("%1$s bahaya %1$s rinio %1$s", nama);
        System.out.println("");
    // umur udin berapa, udin : 18 pak, wah masih muda ya umur nya udin 18
        System.out.printf("umur %1$s berapa, %1$s : %2$d pak, wah masih muda ya umurnya %1$s %2$d", nama, umur);
    
    // [flags]
        System.out.println("\n\n[flags]");
        int angka1 = 5;
        int angka2 = 8;
        int hasil = angka1 + angka2;
        System.out.printf("%d - %d = %+d",angka1, angka2, hasil);   //+
        
    // [width] : lebar slot string nya
        System.out.println("\n\n[width]");
        System.out.println("INTEGER");
        int int1 = 1000;
        System.out.printf("%d\n", int1);
        System.out.printf("%5d\n", int1);   // flags = "+", artinya rata kanan
        System.out.printf("%-5d\n", int1);    // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n", int1);     // mengambil slot String di dalam format 
        System.out.printf("%+-6d\n", int1);     // flags bisa di gabungkan 
        System.out.printf("%10d\n", int1);
        System.out.printf("% 10d\n", int1);
        System.out.printf("%010d\n", int1);     // flags = "0" di depannya berati kita tambahkan leading di depannya 
        System.out.printf("%+010d\n", int1);
//        System.out.printf("%-010d\n", int1);      : error !
        System.out.printf("%,10d\n", int1);     // flags = "," : delimeter per seribu
        int int4 = 100000000;
        System.out.printf("%-,15d\n", int4);
        
    // Floating point
        System.out.println("\nFLOATING POINT");
        float f1 = 1.543f;
        System.out.printf("%f\n", f1);      // mengambil 6 desimal belakang koma
        System.out.printf("%5f\n", f1);
        System.out.printf("%9f\n", f1);     //floating point akan mengambil widh dengan desimal nya
        
    // [.precission]
        System.out.println("\n[.precission]");
        float f2 = 15.678f;
        System.out.printf("%f\n", f2);
        System.out.printf("%.1f\n", f2);    // membulatkan menggunakan "."  :    >=5 = keatas, <5 = kebawah
        System.out.printf("%.2f\n", f2);
        System.out.printf("%8.2f\n", f2);   // gabungan width
        System.out.printf("%08.2f\n", f2);
        System.out.printf("%+08.2f\n", f2);     // gabungan dengan widt dan flag
        
    // contoh
        String nama2 = "ucup";
        float ipk = 3.45455243532f;
        System.out.println("\nnama : " + nama2 + "\nipk  : " + ipk);
        
    // struktur format = %[argumen_indeks$][flags][width][.precission] conversion
        System.out.printf("\nnama : %1$s\nipk  : %2$+10.2f\n\n", nama2, ipk);
    
    // kesimpulan
    // di beri tipe data String
        String info1 = "nama : " + nama2 + ", IPK  : " + ipk;
        System.out.println("info biasa : \n" + info1 + "\n");
    
        String infoFormat = String.format("nama : %1$s, IPk  : %2$+10.2f", nama2, ipk);
        System.out.println("info format String : \n" + infoFormat + "\n");
    
    // format ke dalam StringBuilder
        StringBuilder buildInfo = new StringBuilder();
        Formatter formatbuild = new Formatter(buildInfo);
        
        formatbuild.format("nama : %1$s, IPK  : %2$+10.2f", nama2, ipk);
        System.out.println("String Builder Format : \n" + buildInfo);
    }
}