package praktikum3;

import javax.swing.*;
public class Penggajian3 {
public static void main(String[] args) {
String namaPegawai;
int gaji, jumlahAnak, suamiAtauIstri;
double tunjanganSuamiIstri, tunjanganAnak, penghasilanBruto, iuranPensiun,
penghasilanNetto;
namaPegawai = JOptionPane.showInputDialog("Masukkan Nama Pegawai: ");

gaji = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Gaji Pokok ="));

suamiAtauIstri = Integer.parseInt(JOptionPane.showInputDialog("MemilikiSuami/Istri (Ya=1 / Tidak=0) ? "));

jumlahAnak = Integer.parseInt(JOptionPane.showInputDialog("Berapa JumlahAnak? "));

tunjanganSuamiIstri = suamiAtauIstri * 0.1 * gaji;

tunjanganAnak = jumlahAnak * 0.02 * gaji;

penghasilanBruto = gaji + tunjanganSuamiIstri + tunjanganAnak;

System.out.println("\n============================================");
System.out.println("Nama Pegawai: "+namaPegawai);
System.out.println("Tunjangan Suami/Istri: "+tunjanganSuamiIstri);
System.out.println("Penghasilan Bruto Per-Bulan = " + penghasilanBruto + "rupiah");

iuranPensiun = 0.04 * gaji;
penghasilanNetto = penghasilanBruto - iuranPensiun;
System.out.println("Penghasilan Netto Per-Bulan = " + penghasilanNetto + "rupiah");

//Pembulatan ratusan
int penghasilanNettoBulat = (int) Math.round(penghasilanNetto / 100) * 100;
System.out.println("Penghasilan Netto Per-Bulan (Pembulatan) = " +
penghasilanNettoBulat + " rupiah");
}
}