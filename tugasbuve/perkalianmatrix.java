package tugasbuve;
import java.util.Scanner;

public class perkalianmatrix {
    public static void main(String[] args) {
        
        int[][] ma = new int[3][3]; 
        int[][] mb = new int[3][3]; 
        int[][] mc = new int[3][3]; 

        Scanner inp = new Scanner(System.in);

        System.out.println(" ma");
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print("[" + (i + 1) + "][" + (j+1) + "] : ");
                ma[i][j] = inp.nextInt();
            }
        }

        System.out.println(" mb");
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print("[" + (i + 1) + "][" + (j+1) + "] : ");
                mb[i][j] = inp.nextInt();
            }
        }
        System.out.println("out");
        System.out.println(" ma");
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print(ma[i][j] + "  ");
            }
        }
        
        System.out.println(" \n\nmb");
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print(mb[i][j] + "  ");
            }
        }







    }
}
