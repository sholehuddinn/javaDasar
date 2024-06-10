package studikasusrs;

import java.util.Scanner;

public class StudiKasusRS {

    private static Object integer;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String status,kamar,dokter;
        int x, harga;
        double y;
        System.out.print("status pasien = ");
        status = input.nextLine();
        
        System.out.print("nama kamar = ");
        kamar = input.nextLine();
        
        System.out.print("Dokter = ");
        dokter = input.nextLine();
        
        System.out.print("lama di rumah sakit = ");
        x = input.nextInt();
                
        switch(status){
            case "mandiri" : status = integer.parseInt(500000);
            break;
            case "BPJS" : status = integer.parseInt(300000);
            break;
            case "akses": status = integer.
        }
        switch(kamar){
            case melati : kamar = integer.parseInt(1000000);
            break;
            case mawar : kamar = integer.parseInt(2000000);
            break;
            case dahlia : kamar = integer.parseInt(3000000);
            break;
            case anggrek : kamar = integer.parseInt(4000000);
            break;
            case tulip : kamar = integer.parseInt(5000000);
            break;
        }
        switch(dokter){
            case andi : dokter = integer.parseInt(500000);
            break;
            case joko : dokter = integer.parseInt(400000);
            break;
            case karni : dokter = integer.parseInt(300000);
            break;
            case udin : dokter = integer.parseInt(200000);
            break;
            case amin : dokter = integer.parseInt(100000);
            break;
        }
        if (x>=10)&&(x<9){
            y = 0.5;
        }else if (x>=8)&&(x<7){
            y = 0.6;
        }else if (x>=6)&&(x<5){
            y = 0.7:
        }else{
            y = 0;  
        }
        
        harga = (status+kamar+dokter)*y;
        System.out.println("harga = " + harga);






    }
    
}
