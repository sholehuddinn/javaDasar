
package javaapplication54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prak3 {
    public static void main(String[] args) throws IOException{
        /*3. Sebuah lingkaran memiliki jari- jari seluar 7 cm, hitung luas keseluruhan lingkaran tersebut.*/
    
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    
        String jari;
        int  r; double L;
        try
        {
        System.out.print("Jari-jari = ");jari = input.readLine();
        System.out.println("==========================================");
        r = Integer.parseInt(jari);
        L = Math.PI * Math.pow(r, 2);
        System.out.println("Jari-jari\t = " + r);
        System.out.println("Luas linkaran\t = " + L);
        }
        catch(IOException PesanSalah)
        {
            System.out.println(PesanSalah);
        }
    }     
}
