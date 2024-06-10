package tugasbuve;
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        
        String[][] entry = {
            {"Siti xxx", "735-1234", "Surabaya"},
            {"Siti yyy", "983-333", "Sidoarjo"},
            {"Siti zzz", "456-3322", "Surabaya"}
        };
        
        for(int i = 0; i < entry.length; i++){
                System.out.println("Nama : " + entry[i][0]);
                System.out.println("Tel.# : " + entry[i][1]);
                System.out.println("Address : " + entry[i][2]);
                System.out.println();
        }
    }
}