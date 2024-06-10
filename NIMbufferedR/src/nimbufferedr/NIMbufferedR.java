package nimbufferedr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NIMbufferedR {
    public static void main(String[] args) throws IOException {

        BufferedReader  x =  new BufferedReader (new InputStreamReader(System.in));

        String  tahun, kelas, fak, prodi, nama, hp, alamat;
        String NIM ="";
        String y ="";
        String r ="";
        
        try{
        System.out.println("\t  DATA MAHASISWA BARU  \t");
        System.out.println("--------------------------------------------------");
        System.out.println("*di tulis menggunakan huruf kecil");
        System.out.println("");
        System.out.print("nama          :  ");nama = x.readLine();
        System.out.print("nomor hp      :  ");hp = x.readLine();
        System.out.print("alamat        :  ");alamat = x.readLine();
        System.out.print("tahun masuk   :  ");tahun = x.readLine();
        NIM =""+ tahun;
        System.out.print("kelas         :  ");kelas = x.readLine();
        
        switch(kelas){
            case "pagi":NIM =NIM+ "11";
            y = "A";
            r = " f407";
            break;
            case "sore":NIM =NIM+ "21";
            y = "K";
            r = " f407";
            break;
            default :NIM += "eror";
            break;
        }
        
        System.out.print("fakultas      :  ");fak  = x.readLine();
        System.out.print("program studi :  ");prodi = x.readLine();
        
        switch (prodi){
            case "sipil"  : NIM =NIM+ "4100";
            break;
            case "informatika"  : NIM =NIM+ "4200";
            break;
            case "geomatika"  : NIM =NIM+ "4300";
            break;
            default :NIM += "eror";
            break;
        }       
          
        int rand = (int)(Math.random()*100);
        NIM += rand;       
        System.out.println("==================================================");
        
        System.out.println("NAMA       :  " + nama.toUpperCase());
        System.out.println("NIM        :  " + NIM);
        System.out.println("ALAMAT     :  " + alamat.toUpperCase());
        System.out.println("NO. HP     :  " + hp);
        System.out.println("KELAS      :  " + y + r);
        System.out.println("FAKULLTAS  :  " + fak);
        System.out.println("PRODI      :  " + fak + prodi);
        System.out.println("==================================================");
        System.out.println("SELAMAT ANDA MENJADI MAHASISWA BARU");
        System.out.println("UNIVERSITAS DR. SOETOMO");
        }
        catch(IOException PesanSalah){
        System.out.println(PesanSalah);
        }        
    }
}
