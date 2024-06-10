package Daspro.jption;

import javax.swing.JOptionPane;

public class joption {

    static String catatan = "";
    private static Object kembaliKeMenuU;

    public static void main(String[] args) {
        int menuUtama;
        do {
            menuUtama = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU UTAMA\n" +
                            "1. PEMBERITAHUAN\n" +
                            "2. KEMBALI\n" +
                            "3. KELUAR"));
            switch (menuUtama) {
                case 1:
                    pemberitahuan();
                    break;
                case 2:
                    kembaliKeMenuUtama();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "PILIHAN TIDAK VALID");
            }
        } while (menuUtama != 3);
    }

    public static void pemberitahuan() {
        if (catatan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "TIDAK ADA CATATAN YANG TERSIMPAN");
        } else {
            JOptionPane.showMessageDialog(null, "CATATAN TERSIMPAN :\n" + catatan);
        }
        kembaliKeMenuUtama();
    }

    public static void kembaliKeMenuUtama() {
        int menuCatatan = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU CATATAN\n" +
                        "1. BUAT CATATAN\n" +
                        "2. LIHAT CATATAN\n" +
                        "3. INPUT CATATAN\n" +
                        "4. HAPUS CATATAN\n" +
                        "5. RIWAYAT\n" +
                        "6. KEMBALI\n" +
                        "7. KELUAR"));
        switch (menuCatatan) {
            case 1:
                buatCatatan();
                break;
            case 2:
                lihatCatatan();
                break;
            case 3:
                inputCatatan();
                break;
            case 4:
                buatCatatan();
                break;
            case 5:
                riwayat();
                break;
            case 6:
                main(null);
                break;
            case 7:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "PILIHAN TIDAK VALID");
        }
    }

    private static void riwayat() {
    }

    public static void buatCatatan() {
        if (!catatan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CATATAN:\n" + catatan);
        } else {
            JOptionPane.showMessageDialog(null, "TIDAK ADA CATATAN YANG TERSIMPAN");
        }
        kembaliKeMenuUtama();
    }

    public static void lihatCatatan() {
        if (!catatan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CATATAN:\n" + catatan);
        } else {
            JOptionPane.showMessageDialog(null, "TIDAK ADA CATATAN YANG TERSIMPAN");
        }
        kembaliKeMenuUtama();
    }

    /**
     * 
     */
    public static void inputCatatan() {
        String catatanBaru = JOptionPane.showInputDialog(null, "MASUKKAN CATATAN");
        if (catatanBaru == null || catatanBaru.isEmpty()) {
            JOptionPane.showMessageDialog(null, "PILIHAN TIDAK VALID");
            inputCatatan();
        } else {
            catatan = catatanBaru;
            JOptionPane.showMessageDialog(null, "CATATAN BERHASIL DIBUAT");
            ;
        }
    }
}