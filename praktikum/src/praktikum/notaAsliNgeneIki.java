package materiprak5;

import javax.swing.JOptionPane;

public class notaAsliNgeneIki {
    public static void main(String[] args) {
        
        int i = 1, j;
        int innerLoop, outerLoop;
        int banyaknya, hargaSatuan, hargaTotal, totalPemasukan;
        String namaPembeli, namaBarang;
        totalPemasukan=0;
        while (true) {
            namaPembeli = JOptionPane.showInputDialog("Masukkan Nama Pembeli ke "+ i);
            j = 1;
            hargaTotal=0;
            System.out.println("Nama Pembeli: " + namaPembeli);
            while (true) {
                namaBarang = JOptionPane.showInputDialog("Nama Item ke : " + j);
                banyaknya = Integer.parseInt(JOptionPane.showInputDialog("Banyaknya : "));
                hargaSatuan = Integer.parseInt(JOptionPane.showInputDialog("Harga Satuan: "));

                innerLoop = JOptionPane.showConfirmDialog(null, "Input Item Lagi?", "Konfirmasi", 1);

                System.out.println(banyaknya + "\t" + namaBarang + "\t\t" + hargaSatuan + "\t\t" + (hargaSatuan * banyaknya));

                hargaTotal = hargaTotal + (banyaknya * hargaSatuan);
                j++;
                if (innerLoop != 0) {
                    break;
                    }
                }
                totalPemasukan = totalPemasukan + hargaTotal;

                System.out.println("===============================");

                System.out.println("Total Harga: \t\t" + hargaTotal);
                System.out.println("\n\n");
                outerLoop = JOptionPane.showConfirmDialog(null, "Input Pembeli Lagi?", "Konfirmasi", 1);

                if (outerLoop != 0) {
                    break;
                    }
                i++;
                }
                System.out.println("=====================================");
                System.out.println("Total Pemasukan: \t\t" + totalPemasukan);
    }
}