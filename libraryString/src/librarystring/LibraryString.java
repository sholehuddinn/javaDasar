package librarystring;
public class LibraryString {
    public static void main(String[] args) {

        String teks1 = "hai\nfajar";
        String teks2 = "hai\rfajar";
        String teks3 = "hai\tfajar";
        String teks4 = "hai\bfajar";
        String teks5 = "hai\ffajar";
        
        System.out.println("hai fajar");
        System.out.println("new line untuk pindah baris = "+teks1);
        System.out.println("carriage retur = "+teks2);
        System.out.println("tab = "+teks3);
        System.out.println("back space = " + teks3);
        System.out.println("from feed = " +teks5);
        System.out.println("");

        String Nama = "Muhammad Fajar";
        String hobi = " musik ";
        int panjangString = Nama.length();
        System.out.println("pajang nama = " + panjangString);
        String result = Nama + hobi;
        System.out.println(result);       
        
        char hasil = Nama.charAt(7);
        System.out.println(hasil);
        
        System.out.println(Nama.toUpperCase());
        System.out.println(Nama.toLowerCase());

        System.out.println(Nama.indexOf("fajar"));

        System.out.println(Nama.concat(hobi));

        System.out.println("");

        




    }
    
}
