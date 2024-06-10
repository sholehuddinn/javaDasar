package prak6kalkulator;

import javax.swing.*;

public class Prak6kalkulator {
    public static void main(String[] args) {

        double  angka1, angka2, hasil = 0;
        String pilih;
        
        while(true){
            pilih = (String) JOptionPane.showInputDialog(null, "Pilih Operasi Kalkulator\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n9. Keluar", "MENU", JOptionPane.PLAIN_MESSAGE);
            if (pilih.equals("9")) {
                break;
            }else if (pilih.isEmpty()) {
                continue;
            }else{
                angka1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Angka Pertama", "ANGKA 1",  JOptionPane.PLAIN_MESSAGE));
                angka2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Angka Kedua", "ANGKA 2", JOptionPane.PLAIN_MESSAGE));
            
                    if (pilih.equals("1")) {
                        hasil = angka1 + angka2;
                    }else if (pilih.equals("2")) {
                        hasil = angka1 - angka2;
                    }else if (pilih.equals("3")) {
                        hasil = angka1 * angka2;
                    }else if (pilih.endsWith("4")) {
                        if (angka2 != 0) {
                                hasil = angka1 / angka2;
                            } else {
                                JOptionPane.showMessageDialog(null, "Pembagian Dengan 0 Tidak Bisa !", "Peringatan",JOptionPane.WARNING_MESSAGE);
                                continue; 
                            }
                    }else{
                        JOptionPane.showMessageDialog(null, "INVALID!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
                    }
            JOptionPane.showMessageDialog(null,"Hasil = " + hasil, "output",JOptionPane.PLAIN_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Terima Kasih Selamat Datang Kembali", "", JOptionPane.PLAIN_MESSAGE);
    }
}
