package praktikum;

import javax.swing.JOptionPane;

public class prak53 {
    public static void main(String[] args) {
        
        String catatan = "";
    String history = "";
    int pilihan = 0;
    int menu;
    int d = 0; //variabel menu keluar
    
    do{
    do{    
    String[] a = {"Buat Catatan", "Lihat catatan","Keluar"}; //variabel menu utama
    pilihan = JOptionPane.showOptionDialog(null, "MENU UTAMA", "PROGRAM CATATAN SEDERHANA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, a, a);
    
    if (pilihan == 0){
        do{
            catatan = JOptionPane.showInputDialog(null, "Masukkan Catatan", "INPUT CATATAN", JOptionPane.PLAIN_MESSAGE);
            history += ">" + catatan + "\n";
            
            if (catatan.length() == 0){
                do{
                catatan = JOptionPane.showInputDialog(null, "Catatan Tidak Boleh Kosong!", "INPUT CATATAN", JOptionPane.OK_CANCEL_OPTION);
                history += ">" +catatan + "\n";
                }while(catatan.isEmpty());
                break;
            }
        }while(catatan.length() < 0);
            JOptionPane.showMessageDialog(null, "BERHASIL MEMBUAT CATATAN", "PEMBERITAHUAN", JOptionPane.PLAIN_MESSAGE);                             
    }
    if(pilihan == 1){
        if(catatan.length() > 0){
            do{
            String[] c = {"Ubah Catatan", "Hapus Catatan", "History", "Kembali"};  //variabel menu catatan
            menu = JOptionPane.showOptionDialog(null , "Catatan Tersimpan : " + catatan, "MENU CATATAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, c, c);
            
            if (menu == 0) {
                catatan = JOptionPane.showInputDialog(null, "Masukkan Catatan", "INPUT CATATAN", JOptionPane.PLAIN_MESSAGE);
                history +=">" + catatan + "\n";
            }else if(menu == 1){
                catatan = "";
                break;
            }else if (menu == 2){
                JOptionPane.showMessageDialog(null, history, "HISTORY",  JOptionPane.PLAIN_MESSAGE);
                }
            }while(menu != 3);
        }else if (catatan.length() == 0){
            JOptionPane.showConfirmDialog(null, "Tidak ada catatan yang tersimpan!\nSilahkan buat catatan terlebih dahulu", "PEMBERITAHUAN", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE);
        }
    }   
    }while(pilihan != 2);
        d = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "MENU UTAMA", JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
            if (pilihan == -1) {
            System.exit(0);
            }
        }while(d != 0);
            if (d == -1) {
            System.exit(0);
        }
    }
}
