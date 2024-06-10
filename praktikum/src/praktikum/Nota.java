package prak6kalkulator;

import javax.swing.*;

public class Nota {
    public static void main(String[] args) {
        
        String pembeli, barang;
        int  jumlah, harga, sub, grand = 0, orang = 0, pilih1, pilih;
        
        while(true){
            orang++;
            pembeli = JOptionPane.showInputDialog(null, "Masukkan Nama Pembeli ke-" + orang, "Menu Pembeli", JOptionPane.PLAIN_MESSAGE);
            if (pembeli.isEmpty()) {
                continue;
            }else{
            System.out.println("Pembeli Ke-" + orang + " : " + pembeli);
            
                int item = 0,  total = 0;   
            do {
                item++;
                barang = JOptionPane.showInputDialog(null, "Masukkan Nama Barang ke-" + item, "", JOptionPane.PLAIN_MESSAGE);
                jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah Barang", "", JOptionPane.PLAIN_MESSAGE));
                harga  = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan harga Barang", "", JOptionPane.PLAIN_MESSAGE));
                sub = jumlah * harga;
                total += sub;
                System.out.println(item + "\t" + barang + "\t" + jumlah + "\t" + harga + "\t" + sub);
                pilih1 = JOptionPane.showOptionDialog(null, "Ada lagi kak?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            } while (pilih1 != 2);
                System.out.println("=============================================");
                System.out.println("\t\t\t\t TOTAL\t" + total);
                System.out.println("");
                grand += total;
        
            pilih = JOptionPane.showOptionDialog(null, "Ada Yang Beli Lagi Nggak", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                
            if (pilih == 2) {
                break;
            }else{
                continue;
            }
        }
        }
        System.out.println("=============================================");
        System.out.println("\t\t\tGRAND TOTAL\t" + grand);
    }
}
