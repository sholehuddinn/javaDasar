
package javaapplication54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prak4 {
    public static void main(String[] args) throws IOException {
      /*4. Anda memiliki tumpukan buku di rak. Buku-buku tersebut membentuk tumpukan
        tinggi 30 cm. Setiap buku memiliki ketebalan sebesar 2,5 cm. Berapa banyak buku
        dalam tumpukan tersebut?  */
      
      BufferedReader  x =  new BufferedReader (new InputStreamReader(System.in));
      
      String tinggi, tebal;
      double jumlah, t , tb;
      try
      {
        System.out.print("tinggi buku = ");tinggi = x.readLine();
        System.out.print("tebal buku  = ");tebal = x.readLine();
        
        t = Double.parseDouble(tinggi);
        tb = Double.parseDouble(tebal);
        
        jumlah = t / tb;
        
        System.out.println("==================================");
        System.out.println("Tinggi buku = " + tinggi);
        System.out.println("Tebal buku  = " + tebal);
        System.out.println("Jumlah buku = " + (int)jumlah);
      }
      catch(IOException PesanSalah)
        {
            System.out.println(PesanSalah);
        }
    }
  
}
