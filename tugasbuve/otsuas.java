package tugasbuve;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class otsuas {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        
        char[][] huruf = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'},
            {'U', 'V', 'W', 'X', 'Y', 'Z', ' '}
        };

        System.out.print("masukkan sandi : ");
        String huruf2 = in.nextLine().toUpperCase();
        System.out.println("----------------------------------------------------------");
        System.out.println("SANDI : " + huruf2);
        System.out.print("SANDI ANDA ADALAH : ");

        for (int i = 0; i < huruf2.length(); i++) {
            for (int j = 0; j < huruf.length; j++) {
                for (int k = 0; k < huruf[j].length; k++) {
                    if (huruf2.charAt(i) == huruf[j][k]) {
                        System.out.print(j + "" + k);
                    }
                }
            }
        }

        System.out.println("");

    }
}
