package tugasbuve;
import java.util.Scanner;

public class ordomatrix {
    public static void main(String[] args) {
        int baris, kolom;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Baris : ");
            baris = in.nextInt();
        System.out.print("Masukkan Kolom : ");
            kolom = in.nextInt();

    int[][] ma = new int[baris][kolom];
    int[][] mb = new int[baris][kolom];
    int[][] mc = new int[baris][kolom];

    System.out.println("\n\nin nilai a");
    for(int i = 0; i < ma.length; i++){
        for(int j  = 0 ; j < mb.length; j++){
            System.out.print("[" + (i + 1) + "][" + (j+1) + "] : ");
            ma[i][j] = in.nextInt();
        }
    }
    
    System.out.println("\n\nin nilai b");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            System.out.print("[" + (i + 1) + "][" + (j+1) + "] : ");
            mb[i][j] = in.nextInt();
        }
    }
    
    System.out.println("\n\nout");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] / mb[i][j];
            System.out.println(mc[i][j]);
        }
    }
    
    System.out.println("\n\nout");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] * mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    System.out.println("\n\nout");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j]- mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    System.out.println("\n\nout");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] + mb[i][j];
            System.out.println(mc[i][j]);
        }
    }



    }
}
