package javaapplication55;
public class prak45 {
   String nama;
   int harga,jumlah,bayar;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }    
    public int bayar() {
        bayar=harga * jumlah;
        return bayar;    
    }    
        
        
   
    }

