package bufferedreaderinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) {
        BufferedReader  x =  new BufferedReader (new InputStreamReader(System.in));
        String nama;
        String alamat ;
        try
        {
            System.out.println("masukkan nama anda = ");nama = x.readLine();
            System.out.println("masukkan alamat anda = ");alamat = x.readLine();
            System.out.println();
            System.out.println("nama anda = " +nama );
            System.out.println("nama alamat = " +alamat );
        }
        catch(IOException PesanSalah)
        {
            System.out.println(PesanSalah);
        }
    }
    
}
