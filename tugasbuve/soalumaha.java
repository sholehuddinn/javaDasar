package tugasbuve;

import javax.swing.JOptionPane;

public class soalumaha {
    public static void main(String[] args) {

        String kode, jumlah, jenis, nama = null, kondisi = null, bonus = null;
        int harga = 0, pajak = 0, total, totalHarga;
        double Pajak;
        
        kode = JOptionPane.showInputDialog(null,"Masukkan kode barang","kode" ,JOptionPane.PLAIN_MESSAGE);



        jumlah = JOptionPane.showInputDialog(null, "Masukkan Jumlah Barang", "jumlah", JOptionPane.PLAIN_MESSAGE);

        char[] kb = new char[6];

        for (int i = 0; i < kb.length; i++) {
            kb[i] = kode.charAt(i);
        }

        if (kb[2] == 'A') {
            jenis = "Audio/vidio";
        }else if (kb[2] == 'B') {
            jenis = "Televisi";
        }else if (kb[2] == 'C') {
            jenis = "Komputer";
        }else if (kb[2] == 'D') {
            jenis = "HP";
        }else{
            jenis = "Lain - Lain";
        }

        if (kb[3] == '0' && kb[4] == '1') {
            nama = "DVD Player";
            harga = 400000;
        }else if (kb[3] == '0' && kb[4] == '2') {
            nama = "Speaker Aktiv";
            harga = 300000;
        }else if (kb[3] == '0' && kb[4] == '3') {
            nama = "Sammsung 42 inci";
            harga = 3400000;
        }else if (kb[3] == '0' && kb[4] == '4') {
            nama = "Komputer";
            harga = 5500000;
        }else if (kb[3] == '0' && kb[4] == '5') {
            nama = "Handphone";
            harga = 2800000;
        }else {
            nama = "Lain - Lain";
            harga = 0;
        }

        if (kb[5] == 'N') {
            kondisi = "Baru";
            bonus = "Payung";
            pajak = 10;
        }else if (kb[5] == 'S') {
            kondisi = "Bekas";
            bonus = "Kaos";
            pajak = 5;
        }

        totalHarga = harga * Integer.parseInt(jumlah);
        Pajak = pajak * totalHarga / 100;
        total = (int) (totalHarga - Pajak);

        System.out.println(Pajak);

        JOptionPane.showMessageDialog(null, "Kategori\t: " + jenis + "\nNama Barang\t: " +
        nama + "\nHarga Satuan\t: " + harga + "\nKondisi Barang\t: " + kondisi + "\nTahun Pembuatan\t: 20" + 
        kb[0] + kb[1] + "\nBonus\t: " + bonus + "\nPajak\t: " + pajak + "%\nTotal Pembayaran\t: " + total, 
        "output", JOptionPane.PLAIN_MESSAGE);

    }
}
