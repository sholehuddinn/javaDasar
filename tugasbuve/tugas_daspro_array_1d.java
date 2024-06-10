package tugasbuve;
public class tugas_daspro_array_1d{
    public static void main(String[] args) {
        
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        System.out.println("== semua angka ==");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("| " + angka[i] + " |");
        }

        System.out.println("\n== Angka Ganjil ==");
        for(int j = 0; j < angka.length; j++){
            if (angka[j] % 2 == 1) {
                System.out.print("| " + angka[j] + " |");
            }
        }

        System.out.println("\n== Angka Genap ==");
        for(int k = 0; k < angka.length; k++){
            if (angka[k] % 2 == 0) {
                System.out.print("| " + angka[k] + " |");
            }
        }

        System.out.println("\n\n== Nama - Nama Hari Dalam 1 Minggu ==");
        for(String HARI : hari){
            System.out.print(HARI + "  ");
        }
        
        System.out.println("\n== Tampilkan Hari Selasa Sampai Jum'at ==");
        for(int l = 0; l < hari.length; l++){
            if (l > 0 && l <  5) {
                System.out.print(hari[l] + "  ");
            }
        }

        int[][] x = {
            {354,5445},
            {354,7845}
        };

        System.out.println("\n");
        for(int i = 0; i < x.length; i++){
            for(int j =0 ; j < x[i].length;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }


    }
}