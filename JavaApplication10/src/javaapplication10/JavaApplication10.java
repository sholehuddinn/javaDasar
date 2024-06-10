package javaapplication10;

import javax.swing.JOptionPane;
import javax.swing.*;

public class JavaApplication10 {
    public static void main(String[] args) {

        int st = 15;// stok tersedia
        String history = "", enter, menu;
      
        do{  
        menu = JOptionPane.showInputDialog(null, "Stok Tersedia : " + st + "\n\nMenu :\n1. tambah stok\n2. kurangi stok\n3. history\n4. keluar\nmasukkan pilihan(1/2/3/4)","MENU UTAMA", JOptionPane.PLAIN_MESSAGE);
            do{
                if (menu.isEmpty()) {
                   JOptionPane.showConfirmDialog(null, "MASUKKAN PILIHAN (1/2/3/4)","", JOptionPane.WARNING_MESSAGE);
                   break;
                }
            }while(menu.isEmpty());
                if (menu.equalsIgnoreCase("1")) {
                    enter = JOptionPane.showInputDialog(null, "Jumlah Yang Akan Ditambahkan :", "", JOptionPane.PLAIN_MESSAGE);
                    st += Integer.parseInt(enter);
                    history += "==> + stok : " + enter + "\n";
                    JOptionPane.showMessageDialog(null, "Stok Berhasil Ditambahkan", "", JOptionPane.PLAIN_MESSAGE);
                }else if (menu.equalsIgnoreCase("2")) {
                    enter = JOptionPane.showInputDialog(null, "Jumlah Yang Akan Dikurangkan :", "", JOptionPane.PLAIN_MESSAGE);
                    st -= Integer.parseInt(enter);
                    history += "==> - stok : " + enter + "\n";
                    JOptionPane.showMessageDialog(null, "Stok Berhasil Dikurangkan", "", JOptionPane.PLAIN_MESSAGE);
                }else if (menu.equalsIgnoreCase("3")) { 
                    break;
                }else  {
                    JOptionPane.showConfirmDialog(null, "INPUT TIDAK VALID", "PERINGATAN!",  JOptionPane.WARNING_MESSAGE);
                }
        }while(true);
            JOptionPane.showMessageDialog(null, "Terima Kasih", "keluar", JOptionPane.PLAIN_MESSAGE);
    }
}