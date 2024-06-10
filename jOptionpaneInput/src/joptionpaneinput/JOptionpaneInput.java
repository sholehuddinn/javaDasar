package joptionpaneinput;

import javax.swing.*;

public class JOptionpaneInput {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("masukkan nama anda");
        String pesan = "hello" +nama +"!";
        JOptionPane.showMessageDialog(null, pesan);
    }
    
}
