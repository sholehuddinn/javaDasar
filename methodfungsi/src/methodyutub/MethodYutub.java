package methodyutub;
public class MethodYutub {
    public static void main(String[] args) {

        int x, y;
        
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);
        
        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);
        
        x = 30;
        y = hitung(x);
        System.out.println("x = " + x + " y = " + y);
        
        System.out.println("");
        
        int panjang = 10;
        int lebar = 13;
        int luas = luas(panjang,lebar);
        System.out.println("panjang = " + panjang + "\nlebar = " + lebar + "\nluas = " + luas);
        int keliling = kel(panjang, lebar);
        System.out.println("keliling = " + keliling);
    }
    private static int kel(int panjang, int lebar) {
        int kel = (panjang + lebar) * 2;
        return kel;
    }
    private static int luas(int panjang, int lebar){
        int hasilL ;
        hasilL = panjang * lebar;
        return hasilL;
    }
    private static int hitung (int in){
        int hasil;
        
//        hasil = in * in;
        hasil = (in + 2) * in;
//        hasil = (in + in) * 2;
        
        return hasil;
    }
}
