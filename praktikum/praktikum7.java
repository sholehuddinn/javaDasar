package praktikum;
import java.util.Scanner;

public class praktikum7 {
 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String[] nama = {"Almamamater", "Buku", "Alat Tulis", "Spidol", "Tas\t"};
    String[] pilihan = {"Lihat Barang", "Beli Barang", "Lihat Keranjang"};
    int[] stok = {100, 150, 300, 50, 20};
    int[] harga = {150000, 75000, 5000, 10000, 250000};

    String[] nbr = new String[99999];
    int Harga = 0, pilih, pilih2, no = 0;

    System.out.println("== Selamat Datang Di Toko Online Unitomo ==");
    
    do{
        in = new Scanner(System.in);
        System.out.println("===========================================");
        for(int i = 0; i < pilihan.length; i++){
            System.out.println((i + 1) + ". " + pilihan[i]);
        }
        System.out.println("===========================================");
        System.out.print("Masukkan Pilihan (1/2/3) : ");
        pilih = in.nextInt();
        System.out.println();

        if (pilih == 1) {
            System.out.println("== Nama ==\t == Stok ==\t == Harga ==");
            for(int i =0; i < nama.length; i++){
                System.out.printf("%1$d. %2$s \t %3$d \t\t %4$,d\n", (i + 1), nama[i], stok[i], harga[i]);
            }
            System.out.println("");
        }else if (pilih == 2) {
            System.out.println("== Nama ==\t == Harga ==");
            for(int i =0; i < nama.length; i++){
                System.out.printf("%1$d. %2$s \t %3$,d\n", (i + 1), nama[i], harga[i]);
            }
            System.out.print("Pilih Barang : ");
            pilih2 = in.nextInt();
            for(int i = 0; i < nbr.length; i++){
                if (pilih2 == (i + 1)) {
                    nbr[i] = nama[i];
                    stok[i] -= 1;
                    Harga += harga[i];
                }else{
                    continue;
                }
            }
            System.out.println("");
        }else if (pilih == 3) {
            for(int i = 0; i < nbr.length; i++){
                if (nbr[i] != null) {
                    no++;
                    System.out.println(no + ". " + nbr[i]);
                }
            }
        }else{
            continue;
        }
    }while(pilih != 3);
        System.out.println("\nKeranjang : \nSisa Stok : ");
        for(int i = 0; i < stok.length; i++){
            if (i == 1) {
                nama[1] = "Buku\t";
            }
            System.out.println((i + 1) + ". " + nama[i] + "\t" + stok[i]);
        }
        System.out.println("");
        System.out.println("Total Harga : " + Harga);
 }   
}
