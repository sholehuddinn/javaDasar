package tugasbuve;

import java.util.Scanner;

public class tugasifelse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int bonus = 0, total, bersih;
        float bunga, b = 1.5f;

        System.out.print("Gaji utama : ");
        int utama = in.nextInt();

        System.out.print("Lama Kerja : ");
        int lama = in.nextInt();

        System.out.print("umur : ");
        int umur = in.nextInt();

        if (lama >= 7 && umur >= 55) {
            bonus = 2500000;
        }else if (lama >= 7 && umur < 55) {
            bonus = 1500000;
        }else if (lama < 7) {
            bonus = 1000000;
        }

        total = utama + bonus;
        bunga = (total * b) / 100;
        bersih = (int) (total - bunga);

        System.out.println("\n--------------------------------------------------");
        System.out.printf("Lama Bekerja : %d tahun\n", lama);
        System.out.printf("Umur : %d tahun\n", umur);
        System.out.printf("Gaji Utama : Rp.%,d;\n", utama);
        System.out.printf("Bonus Gaji : Rp.%,d;\n", bonus);
        System.out.printf("total gaji : Rp.%,d;\n", total);
        System.out.printf("Bunga : %f %%\n", b);
        System.out.printf("Gaji Yang Diterima : Rp.%,d;\n", bersih);
    }
}
