package loopingyutub;
public class doWhileLoop {
    public static void main(String[] args) {
        
    /*    do {
            aksi
        } while (kondisi);  */
    
        System.out.println("awal");
        
        int a =0;
        boolean kondisi = true;
        
        do{
            a++;
            System.out.println("do while ke-"+a);
            
            if (a == 10){
                kondisi = false;
            }
        }while(kondisi);
        
    //   System.out.println("akhir"); 
    //      di jalankan program nya baru di cek kondisi nya 
    }
   
}
