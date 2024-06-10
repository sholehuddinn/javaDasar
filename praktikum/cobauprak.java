package praktikum;
import java.util.Scanner;

public class cobauprak {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int jumlah, a = 0;
        int[] buah = new int[15];
        int[] kurang = new int[15];
        
        for(int i = 0; i < buah.length; i++){
            buah[i] = 100;
            System.out.print(buah[i] + " ");
        }

        System.out.println("\n===========================================================\n");

        while(true){

            System.out.print("Masukkan jumlah buah yang di beli : ");
                jumlah = in.nextInt();
            
            for(int i = 0; i < buah.length; i++){
                while(a == 100){
                    a++;
                    kurang[i] = a;
                }
            }

            for(int i = 0; i < buah.length; i++){
                System.out.print(kurang[i] + " ");
            }
            
            System.out.println("");
            
            for(int i = 0; i < buah.length; i++){
                System.out.print(buah[i] + " ");
            }
            System.out.println("");
        }
    }
}
