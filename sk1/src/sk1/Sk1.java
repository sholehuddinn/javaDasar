package sk1;

import javax.swing.JOptionPane;

public class Sk1 {
    public static void main(String[] args) {

        String nomor ="";
        Object edws;
        nomor =JOptionPane.showInputDialog("Masukkan nomor yang anda pikirkan dari 1-100");

        String pesan = "Nomor yang anda pikirkan adalah "+nomor;
        JOptionPane.showMessageDialog(null, pesan);



    }
    
}
