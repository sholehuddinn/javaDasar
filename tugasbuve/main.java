package tugasbuve;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    in = new Scanner(System.in);

    int[][] ma = new int[2][2]; // matriks pertama
    int[][] mb = new int[2][2]; // matriks ke 2
    int[][] mc = new int[2][2]; // mariks hasil

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
    
    System.out.println("\n\nout bagi");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] / mb[i][j];
            System.out.println(mc[i][j]);
        }
    }
    
    System.out.println("\n\nout kali");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] * mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    System.out.println("\n\nout kurang");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j]- mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    System.out.println("\n\nout tambah");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] + mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    System.out.println("\n\nout modulus");
    for(int i = 0; i < ma.length; i++){
        for(int j = 0; j < mb.length; j++){
            mc[i][j] = ma[i][j] % mb[i][j];
            System.out.println(mc[i][j]);
        }
    }

    // array 3d

    int[][][] a = {{
        {8945,8794,7845,8745},
        {8945,5412,8456,8456}},
        {
        {8412,1235,6532,8456}}
    };

    for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a.length; j++){
            for(int k = 0; k < a.length; k++){
                System.out.println(a[i][j][k]);
            }
            System.out.println();
        }
        System.out.println();
    }





    }
}