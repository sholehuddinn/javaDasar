package praktikum;
import java.util.Scanner;

public class ujianPraktikum{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int harga, jumlah, uang, ecer, pak, kembalian, a = 0, stok = 0;
        String x;
        int[] tahu = new int[10];

        for(int i = 0; i < tahu.length; i++){
            tahu[i] = 10;
        }
        

        do{
            System.out.print("masukkan Jumlah tahu : ");
                jumlah = in.nextInt();
            System.out.print("Masukkan Jumlah uang : ");
                uang = in.nextInt();
            System.out.println("-----------------------------");
            
            ecer = (jumlah % 10) * 1000;
            pak = (jumlah / 10) * 8000;
            harga = ecer + pak;
            kembalian = uang - harga;

            if (uang < harga) {
                System.err.println("Uang Anda Kurang");
                continue;
            }

            while(true){
                tahu[a]--;
                jumlah--;
                if (tahu[a] == 0 && a != tahu.length - 1) {
                    a++;
                }else if(jumlah == 0){
                    break;
                }
            }

            for(int i = 0; i < tahu.length; i++){
                stok += tahu[i];
                stok -= jumlah;
            }
            
            System.out.println("Total Harga : " + harga);
            System.out.println("kembalian : " + kembalian);
            System.out.println("Stok : " + stok);
            System.out.println("Sisa Di Rak : ");
            for(int i = 0; i < tahu.length; i++){
                System.out.print(tahu[i] + " ");
            }
            System.out.println();
            System.out.println("-----------------------------");
            System.out.print("Ada lagi ngaa[y/n]: ");
            in = new Scanner(System.in);
            x = in.nextLine();
            
            if (x.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }while(true);
    }
}