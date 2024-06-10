package tugasbuve;

import java.util.Arrays;
import java.util.Scanner;

public class multiarray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String sandi;
        
        char[][] huruf = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'},
            {'U', 'V', 'W', 'X', 'Y', 'Z'}
        };

        for (int i = 0; i < huruf.length; i++){
            for (int j = 0; j < huruf[i].length; j++){
                System.out.print(huruf[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.print("Masukkan Sandi : ");
        sandi = in.nextLine().toUpperCase();

        System.out.print("Sandi kamu Adalah : ");

        for (int i = 0; i < sandi.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                for (int k = 0; k < huruf[j].length; k++) {
                    if (sandi.charAt(i) == huruf[j][k]) {
                        System.out.print(j + "" + k );
                    }
                }
            }
        }

        System.out.println("");

    }
}