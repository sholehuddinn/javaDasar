package mesinatm;

import java.util.Scanner;

public class MesinAtm {
    public static void main(String[] args) {

    //18. mesin ATM
        Scanner input = new Scanner(System.in);
        
        int bil;
        System.out.print("MASUKAN BILANGAN = ");
        bil = input.nextInt();
        
        int ribu = bil - (bil % 1000);
        int a = ribu / 1000;
        int ratus = bil - (ribu + (bil % 100));
        int b = ratus / 100;
        int puluh = bil - (ribu + ratus + (bil % 10));
        int c = puluh / 10;
        int d = bil % 10;
        
        System.out.println("ribuan = " + a);
        System.out.println("ratusan = " + b);
        System.out.println("puluhan = " + c);
        System.out.println("satuan = " + d);




















    }
    
}
