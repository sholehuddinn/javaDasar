package array;
public class arrayDasar {
    public static void main(String[] args) {
        
        //buat array
        String[] nama = {"Linda", "Santi", "Susan", "Mila", "Ayu"};//simpelnya
        
        nama[0] = "Linda";//sama aja
        nama[1] = "Santi";
        nama[2] = "Susan";
        nama[3] = "Mila";
        nama[4] = "Ayu";
        
        System.out.println(nama[2]);
        
        for (int i = 0; i < nama.length; i++) {
            System.out.println("indeks ke -"+i+" : "+nama[i]);
        }
        
        
    }
    
}
