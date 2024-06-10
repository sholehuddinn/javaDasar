package tugaspraktikum2;
public class TugasPraktikum2 {
    public static void main(String[] args) {

    //tugas praktikum M. Fajar Sholehuddin
    //studi kasus 1
        double L, a, b, t;
        
        a = 8;
        b = 10;
        t = 6;
        
        L = 0.5 * (a + b) * t;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("tinggi = " + t);
        System.out.println("luas trapesium = " + (int)L);
        System.out.println("");
    //studi kasus 2
        int pkb, lkb, pka, lka, mb, hm, hk;
        
        pkb = 5;
        lkb = 6;
        pka = 15;
        lka = 6;
        mb = 5;
        hk = 25000;
        hm = 125000;
        
        int karpetBudi = pkb * lkb;
        int hargaKarpetBudi = karpetBudi * hk;
        int mejaBudi = mb * hm;
        int karpetArif = lka * pka;
        int bayarArif = karpetArif * hk;
        double pajak  = 10 * (hargaKarpetBudi + mejaBudi)/100;
        int bayarBudi = (int) ((hargaKarpetBudi + mejaBudi) - pajak);
        
        System.out.println("panjang karpet = " + pkb);
        System.out.println("lebar karpet = " + lkb);
        System.out.println("harga karpet = " + hk + "/m2");
        System.out.println("jumlah meja = " + mb);
        System.out.println("harga meja = " + hm + "/pcs");
        System.out.println("harga yang harus di bayar budi = " + bayarBudi);
        System.out.println("");
        System.out.println("panjang karpet Arif = " + pka);
        System.out.println("lebar karpet Arif = " + lka);
        System.out.println("harga karpet = " + hk + "/m2");
        System.out.println("Diskon = 10 %");
        System.out.println("harga yang harus di bayar Arif = " + bayarArif);
        System.out.println("");
    //studi kasus 3
        int hargaHaji = 48000000;
        int tabungan = 20000000;
        int dpDariTabungan = 10000000;
        int cicilan = 24;
        
        int x = (tabungan - dpDariTabungan);
        int y = hargaHaji - x;
        double z = y / cicilan;
        
        System.out.println("Harga Biyaya Haji = " + hargaHaji);
        System.out.println("Tabungan awal yang di berikan = " + dpDariTabungan);
        System.out.println("Lama cicilan yang di inginkan = " + cicilan);
        System.out.println("Cicilan yang harus di bayar tiap bulan = " + (int)z);
        System.out.println("Sisa tabungan sekarang = " + x);
                
        
        




    }
    
}
