package array;
public class array2D_operasiMatrix {
    public static void main(String[] args) {
        
    //seperti aljabar linear
        
        int[][] matrix1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int[][] matrix2 = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        
        printArray(matrix1);
        printArray(matrix2);
        
        int[][] hasilTambah = tambah(matrix1, matrix2);
        int[][] hasilKali = kali(matrix1, matrix2);
        printArray(hasilTambah);
        printArray(hasilKali);
        
        int[][] matrix4 ={
            {1,2},
            {3,4},
        };
        int[][] matrix5 ={
            {11,12},
            {13,14},
        };
        
        printArray(matrix4);
        printArray(matrix5);
        
        int[][] hasilTambah1 = tambah(matrix4, matrix5);
        int[][] hasilKali1 = kali(matrix4, matrix5);
        printArray(hasilTambah1);
        printArray(hasilKali1);
        
        
    }
    private static int[][] kali(int[][] matrix_a, int[][] matrix_b){
    //perkalian matrix  (baris . kolom)
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;
        
        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;
        
        int buffer;
        int[][] hasil = new int[baris_a][kolom_b] ;
        
    //jumlah baris mengikuti matrix pertama
    //jumlah kolom mengikuti matrix kedua
        
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_a; k++) {
                    buffer += matrix_a[i][k] * matrix_b[k][j];
                }
                    hasil[i][j] = buffer;
            }
        }
        return hasil;
    }
    //penjumlahan matrix
    private static int[][] tambah(int[][] matrix_a, int[][] matrix_b){
    //jumlah baris dan kolom harus sama
        int baris1 = matrix_a.length;
        int kolom1 = matrix_a[0].length;
        
        int baris2 = matrix_b.length;
        int kolom2 = matrix_b[0].length;
        
        int[][] hasil = new int[baris1][kolom1];

        if (baris1 == baris2 && kolom1 == kolom2) {
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
                }
            }
        }else{
            System.err.println("baris != kolom");
        }
        return hasil;
    }
    //harus looping manual
    private static void printArray(int[][] dataArray){
        //jumlah baris dan kolom harus sama
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < (kolom -1)) {
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
  
}
