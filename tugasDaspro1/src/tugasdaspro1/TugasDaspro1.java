package tugasdaspro1;

import java.util.Scanner;

public class TugasDaspro1 {
    public static void main(String[] args) {

    //1. menghitung luas segitiga
        short a = 12;
        short t = 14;
       
        double x = 0.5*a*t;
        System.out.println("alas = " + a);
        System.out.println("tinggi = " + t);
        System.out.println("LUAS SEGITIGA = 0.5*a*t");
        System.out.println("LUAS SEGITIGA = " +(int) x);
        System.out.println("");
    //2. menghitung luas persegi  
        short s = 15;
        
        int y = s * s;
        System.out.println("SISI = " + s);
        System.out.println("LUAS PERSEGI = s * s");
        System.out.println("LUAS PERSEGI = " + y);
        System.out.println("");
    //3. menghitung luas lingkaran  
        double pi = 22/7;
        byte r = 7;
        
        double lk = pi * r * r;
        System.out.println("jari-jari = " + r);
        System.out.println("LUAS LINGKARAN = pi * r * r");
        System.out.println("LUAS LINGKARAN = " +(int) lk);
        System.out.println("");
    //4. menghitung luas trapesium
        short b = 16;
        
        double lt = 0.5 * (a + b) * t;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t = " + t);
        System.out.println("LUAS TRAPESIUM = 0.5 * (a + b) * t");
        System.out.println("LUAS TRAPESIUM = " +(int) lt);
        System.out.println("");
    //5. menghitung luas selimut tabung
        int lst = (int) (2 * pi * r * t);
        System.out.println("jari-jari = " + r);
        System.out.println("tinggi = " + t);
        System.out.println("LUAS SELIMUT TABUNG = 2 * pi * r * t");
        System.out.println("LUAS SELIMUT TABUNG = " + lst);
        System.out.println("");
    //6. menghitung luas jajar genjang    
        int lj = a * t;
        System.out.println("alas = " + a);
        System.out.println("tinggi = " + t);
        System.out.println("LUAS JAJAR GENJANG = a * t");
        System.out.println("LUAS JAJAR GENJANG = " + lj);
        System.out.println("");
    //7. menghitung volume balok
        int vb = s * s * s;
        System.out.println("sisi = " + s);
        System.out.println("VOLUME BALOK = s * s * s");
        System.out.println("VOLUME BALOK = " + vb);
        System.out.println("");
    //8. menghitung volume tabung    
        double vt = pi * r * r * t;
        System.out.println("jari-jari = " + r);
        System.out.println("tinggi = " + t);
        System.out.println("VOLUME TABUNG = pi * r * r * t");
        System.out.println("VOLUME TABUNG = " +(int) vt);
        System.out.println("");
    //9. menghitung volume kubus    
        byte p = 10;
        byte l = 18;
        
        int vk = p * l * t;
        System.out.println("PANJANG = " + p);
        System.out.println("LEBAR = " + l);
        System.out.println("TINGGI = " + t);
        System.out.println("VOLUME KUBUS = p * l * t");
        System.out.println("VOLUME KUBUS = " + vk);
        System.out.println("");
    //10. menghitung keliling lingkaran   
        double kl = 2 * pi * r;
        System.out.println("jari-jari = " + r);
        System.out.println("KELILING LINGKARAN = 2 * pi * r");
        System.out.println("KELILING LINGKARAN = " + (int) kl);
        System.out.println("");
    //11. menghitung keliling persegi panjang    
        int kpp = 4 * s;
        System.out.println("sisi = " + s);
        System.out.println("KELILING PERSEGI PANJANG = 4 * s");
        System.out.println("KELILING PERSEGI PANJANG = " + kpp);
        System.out.println("");
    //12. menghitung keliling bangun datar    
        byte s1 = 6;
        byte s2 = 6;
        byte s3 = 4;
        byte s4 = 7;
        byte s5 = 7;
        
        int kbd = s1+s2+s3+s4+s5;
        System.out.println("sisi 1 = " + s1);
        System.out.println("sisi 2 = " + s2);
        System.out.println("sisi 3 = " + s3);
        System.out.println("sisi 4 = " + s4);
        System.out.println("sisi 5 = " + s5);
        System.out.println("kelliling segi lima = " + kbd);
        System.out.println("");
    //13. menghitung keliling segitiga    
        int ks = s1 + s2 + s3;
        System.out.println("sisi 1 = " + s1);
        System.out.println("sisi 2 = " + s2);
        System.out.println("sisi 3 = " + s3);
        System.out.println("KELILING SEGITIGA = s1 + s2 + s3");
        System.out.println("KELILING SEGITIGA = " + ks );
        System.out.println("");
    //14. koversi detik ke jam, menit    
        int xx = 4500;
        int jam = xx/3600;
        int yy = (xx % 3600);
        int mnt = yy / 60;

        System.out.print("x = " + xx );
        System.out.println(" detik ");
        System.out.println("jam = " + jam);
        System.out.println("menit = " + mnt);
        System.out.println("");
    //15. konversi suhu
        Scanner input = new Scanner(System.in);
        int C;
        double F, R;
        System.out.println("MASUKKAN SUHU (celcius) = ");
        C = input.nextInt();
        F = (1.8 * C) + 32;
        R = (0.8 * C);
        
        System.out.println("FAHRENHEIT = " + F);
        System.out.println("REAMUR = " + R);
        System.out.println("");
    //16. menghitung bunga bank   
        int U, M, B, L, X, Y;
        M = 1200000;
        B = 4;
        L = 2;
        
        Y = 1 + B;
        X = (int) Math.pow(Y, L);
        U = M * X;
        System.out.println("UANG PADA AWAL TAHUN = " + M);
        System.out.print("BUNGA TIAP TAHUN = " + B);
        System.out.println(" %");
        System.out.print("LAMA TAHUN = " + L);
        System.out.println(" tahun");
        System.out.println("UANG PADA AKHIR TAHUN = " + U);
        System.out.println("");
    //17. konversi mata uang    
        int  rupiah;
        double dollar, yen, peso;
        System.out.print("MASUKKAN RUPIAH = ");
        rupiah = input.nextInt();
        dollar = rupiah / 8250;
        yen    = rupiah / 4000;
        peso   = rupiah / 2500;
        
        System.out.println("dollar = " + dollar);
        System.out.println("yen = " + yen);
        System.out.println("peso = " + peso);
        




    
        
        



    }
    
}
