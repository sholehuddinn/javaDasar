import java.util.Scanner;

public class prak7idris {
    public static void main(String[] args) {
        
  Scanner     input = new Scanner(System.in); 
  ArrayList<String> history1 = new ArrayList<>(); 
  ArrayList<Integer> history2 = new ArrayList<>();



while (true) {

String[] nama = {"Almamater", "Buku", "Alat tulis", "Spidol", "Tas"};

int[] stock = {100, 150, 300, 50, 20};

int[] Harga = {150000, 75000, 5000, 10000, 250000};

int Pilih;

System.out.println("=== Selamat datang di toko online UNITOMO ===");
System.out.println("============================================="); 
System.out.println("1. Lihat barang");
System.out.println("2. Beli barang");
System.out.println("3. Lihat keranjang");
 
System.out.println("4. Keluar");
System.out.println("=============================================");
System.out.println("");



System.out.println("Pilih (1,2,3,4) :");

int pilihan = input.nextInt();




switch (pilihan) {

case 1: System.out.println("===NAMA===\t===STOK===\t===HARGA==="); 
System.out.println(nama[0] + "\t" + stock[0] + "\t\tRp. " + Harga[0]); 
System.out.println(nama[1] + "\t\t" + stock[1] + "\t\tRp. " + Harga[1]); 
System.out.println(nama[2] + "\t" + stock[2] + "\t\tRP. " + Harga[2]); 
System.out.println(nama[3] + "\t\t" + stock[0] + "\t\tRp. " + Harga[3]);
System.out.println(nama[4] + "\t\t" + stock[4] + "\t\tRp. " + Harga[4]);
break;



case 2: System.out.println("===NAMA===\t===HARGA===");
System.out.println(nama[0] + "\tRp. " + Harga[0]); System.out.println(nama[1] + "\t\tRp. " + Harga[1]); 
System.out.println(nama[2] + "\tRp. " + Harga[2]); System.out.println(nama[3] + "\t\tRp. " + Harga[3]); 
System.out.println(nama[4] + "\t\tRp. " + Harga[4]); System.out.println("Pilih Barang  : ");
 
Pilih = input.nextInt();




if (Pilih == 1) { System.out.println("Almamater"); history1.add(nama[0]); history2.add(Harga[0]);
} else if (Pilih == 2) { System.out.println("Buku"); history1.add(nama[1]); history2.add(Harga[1]);
} else if (Pilih == 3) { System.out.println("Alat tulis"); history1.add(nama[2]); history2.add(Harga[2]);
} else if (Pilih == 4) { System.out.println("Spidol"); history1.add(nama[3]); history2.add(Harga[3]);
} else if (Pilih == 5) { System.out.println("Tas"); history1.add(nama[4]); history2.add(Harga[4]);
} else {

System.out.println("Pilihan anda tidak ada!\n Silahkan  Masukkan Kembali!");

}
 
break;

case 3:

System.out.println("================= KERANJANG =================");
System.out.println(history1 + "\n"); System.out.println("============================================="); 
int Total = 0;
for (int harga : history2) { Total += harga;
}

System.out.println("Total Harga : " + Total); System.out.println("");
break;




case 4:

System.out.println("Anda Keluar Dari Program"); System.exit(0);
break;




default:

System.out.println("Masukkan Pilihan Kembali!");

}

}

    }
}
