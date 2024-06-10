package materiprak5;

import javax.swing.JOptionPane;

public class MateriPrak5 {
    public static void main(String[] args) {

        int count = 1;
        int banyaknya, hargaSatuan, hargaTotal = 0;
        int loop;
        String namaBarang;
        while (true) {
            JOptionPane.showMessageDialog(null, "Item ke " + count);
            namaBarang = JOptionPane.showInputDialog("Nama Barang: ");
            banyaknya = Integer.parseInt(JOptionPane.showInputDialog("Banyaknya : "));
            hargaSatuan = Integer.parseInt(JOptionPane.showInputDialog("Harga Satuan: "));
            loop = JOptionPane.showConfirmDialog(null, "Input Lagi? ","Konfirmasi", 1);
            
            System.out.println(banyaknya+"\t"+namaBarang+"\t\t"+(hargaSatuan*banyaknya));

            hargaTotal=hargaTotal+(banyaknya*hargaSatuan);
            count++;
                if (loop != 0) {
                    break;
                }
            }
        System.out.println("===========================================");
        System.out.println("Total Harga: \t\t" + hargaTotal);
    }
}