package praktikum3;

import javax.swing.*;
public class Beasiswa {
public static void main(String[] args) {
//variable data pribadi:
String namaMahasiswa, nim;
//variable aktivitas di kampus
int semester, ormawa;
double IPS;
//variable kondisi keluarga
long penghasilanAyah, penghasilanIbu, penghasilanOrtu;
int jumlahSaudaraKandung;
//variable kondisi rumah tinggal
int dayaListrikRumah, statusRumah;
String statusRumahTinggal;
//kriteria beasiswa:
boolean aktivitasKampus, kondisiKeluarga, kondisiRumah;
String keputusanAkhir;
namaMahasiswa = JOptionPane.showInputDialog("Nama Mahasiswa: ");
nim = JOptionPane.showInputDialog("Nomor Induk Mahasiswa (NIM): ");
semester = Integer.parseInt(JOptionPane.showInputDialog("Semester: "));
IPS = Double.parseDouble(JOptionPane.showInputDialog("Indeks PrestasiSemester (IPS Terakhir): "));

ormawa = Integer.parseInt(JOptionPane.showInputDialog("Jumlah OrganisasiMahasiswa yang diikuti: "));

penghasilanAyah = Long.parseLong(JOptionPane.showInputDialog("PenghasilanAyah: "));

penghasilanIbu = Long.parseLong(JOptionPane.showInputDialog("PenghasilanIbu: "));

jumlahSaudaraKandung = Integer.parseInt(JOptionPane.showInputDialog("JumlahSaudara Kandung: "));

dayaListrikRumah = Integer.parseInt(JOptionPane.showInputDialog("DayaListrik Rumah (Watt): "));

statusRumah = Integer.parseInt(JOptionPane.showInputDialog("Status Rumah(0=milik pribadi, 1=bukan milik pribadi): "));

penghasilanOrtu = penghasilanAyah + penghasilanIbu;

statusRumahTinggal = (statusRumah != 0)?"Bukan Milik Pribadi":"MilikPribadi";
//kriteria aktivitas kampus:
aktivitasKampus = ((IPS >= 3.0) && (ormawa >= 1) && (semester >= 3 ||

semester <= 8));
//kriteria kondisi keluarga:
kondisiKeluarga = ((penghasilanOrtu <= 1000000) || (jumlahSaudaraKandung >=

5));

//kriteria kondisi rumah tinggal:
kondisiRumah = ((dayaListrikRumah <= 450) || (statusRumah != 0));
keputusanAkhir = (aktivitasKampus && kondisiKeluarga && kondisiRumah) ?"Berhak Mendapat Beasiswa" : "Tidak Berhak Mendapat Beasiswa";

System.out.println("===========DATA YANG TELAH DIINPUTKAN==============");
System.out.println("Nama Mahasiswa: "+namaMahasiswa);
System.out.println("NIM: "+nim);
System.out.println("Semester: "+semester);
System.out.println("Indeks Prestasi Semester: "+IPS);
System.out.println("Jumlah Organisasi Mahasiswa yang diikuti: "+ormawa);
System.out.println("Penghasilan Orang Tua: "+penghasilanOrtu);
System.out.println("Jumlah Saudara Kandung: "+jumlahSaudaraKandung);
System.out.println("Daya Listrik Rumah: "+dayaListrikRumah+ "Watt");
System.out.println("Status Rumah: "+statusRumahTinggal);
System.out.println("\n============HASIL KEPUTUSAN===============");
System.out.println("Keputusan Akhir: "+keputusanAkhir);
}
}
