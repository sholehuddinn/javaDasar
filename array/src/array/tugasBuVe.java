package array;
public class tugasBuVe {
    public static void main(String[] args) {
        
        int[] angka = {0,1,2,3,4,5,6,7,8,9};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        
        System.out.println("== Menampilkan Semua Angka ==");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("| " + angka[i] + " |");
        }
        
        System.out.println("\n== Menampilkan Angka Genap ==");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print("| " + angka[i] + " |");
            }
        }
        
        System.out.println("\n== Menampilkan Angka Ganjil ==");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 1) {
                System.out.print("| " + angka[i] + " |");
            }
        }
        
        System.out.println("\n\n== Menampilkan Semua Hari ==");
        for (int i = 0; i < hari.length; i++) {
            System.out.print(hari[i] + "  ");
        }
       
        System.out.println("\n== Menampilkan Hari Selasa Sampai Jum'at ==");
        for (int i = 0; i < 10; i++) {
            if (i >= 1 && i < 5) {
                System.out.print(hari[i] + "  ");
            }
        }
        System.out.println("");
    }
}