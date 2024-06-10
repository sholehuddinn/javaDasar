
import java.util.Scanner;


public class uprak5 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("nama = ");
        String nama = x.nextLine();
        
        System.out.println("jenis kereta\n1. biasa\t06.00\n2. wira-wiri\t05.00\n3. cepat\t07.00\n4. exspres\t07.00");
        System.out.println("");
        
        
        System.out.print("jenis kereta = ");
        short jk = x.nextShort();
        
        System.out.print("jam kedatangan di stasiun = ");
        float jks = x.nextFloat();
        
        System.out.println("====================================");
        
        int denda = 10000;
        int total = 0,harga = 0,td = 0;
        float wt=0.0f;
        
        switch (jk){
            case 1 :
                wt = jks + 0.40f;
                harga = 5000;
                break;
            case 2 :
                wt = jks + 0.30f;
                harga = 10000;
                break;
            case 3 :
                wt = jks + 0.20f;
                harga = 15000;
                break;
            case 4 :
                wt = jks +0.12f;
                harga = 20000;
                break;
            default :
                System.exit(0);
                break;
        }
        
        if (wt > 8.15 && wt <= 8.30){
            td=denda *1;
        }else if(wt > 8.30 && wt <= 8.45){
            td=denda *2; 
        }else if(wt > 8.45 && wt <= 9.00){
            td=denda *3; 
        }else if(wt > 9.00 ){
            td=denda *4; 
        }else {
            td = 0;
        }
        
        total = (harga + td);
        
        System.out.println("nama\t" + nama);
        System.out.println("jam sampai kantor\t"+wt);
        System.out.println("total denda\t"+total);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
