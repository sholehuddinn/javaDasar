package materiprak3.pkg1;

import java.util.Scanner;

public class MateriPrak31 {

    public static void main(String[] args) {

        Scanner x = new Scanner (System.in);
        
        double jari, tinggi, volume, sisi;
        
        System.out.println("kerucut");
        System.out.print("jari-jari= ");
        jari=x.nextDouble();
        
        System.out.print("tinggi\t = ");
        tinggi=x.nextDouble();
        
        sisi=Math.sqrt(Math.pow(jari, 2)+Math.pow(tinggi, 2));
        volume=((Math.PI)*Math.pow(jari, 2)*tinggi)/3;
        
        System.out.println("sisi\t = "+sisi);
        System.out.println("volume\t ="+volume);
        
        
        
        
    }
    
}
