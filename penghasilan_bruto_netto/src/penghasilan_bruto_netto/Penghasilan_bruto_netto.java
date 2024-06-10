package penghasilan_bruto_netto;

import java.util.Scanner;

public class Penghasilan_bruto_netto {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("gaji = ");
        int gaji = input.nextInt();
        
        System.out.print("jumlah aanak = ");
        int jumlahAnak = input.nextInt();
        
        System.out.print("suami / istri = ");
        int suamiAtauIstri = input.nextInt();
        
        double tunjanganSuamiIstri, tunjanganAnak,penghasilanBruto, iuranPensiun, penghasilanNetto;
                
        tunjanganSuamiIstri = suamiAtauIstri * 0.1 * gaji;
        tunjanganAnak = jumlahAnak * 0.02 * gaji;
        penghasilanBruto = gaji + tunjanganSuamiIstri+ tunjanganAnak;

        System.out.println("Penghasilan Bruto Per-Bulan = "+ (int)Math.ceil(penghasilanBruto) + " rupiah");

        iuranPensiun = 0.04 * gaji;
        penghasilanNetto = penghasilanBruto - iuranPensiun;
        System.out.println("Penghasilan Netto Per-Bulan = "+ (int)Math.ceil(penghasilanNetto) + " rupiah");
                
    }
    
}
