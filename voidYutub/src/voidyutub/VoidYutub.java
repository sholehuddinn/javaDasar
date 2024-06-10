package voidyutub;
public class VoidYutub {
    public static void main(String[] args) {

        //void artinya hampa 
        //void = variabel kosongan tanpa return
        
        System.out.println(simpel());
        
        fungsiVoid("apapun");


    }
    //fungsi atau method tanpa kembalian
    //mengeluarkan aksi aja
    //tanpa mendelegasikan nilai
    //melakukan sebuah pekerjaan saja
    private static void fungsiVoid(String input){
        System.out.println(input);
    }   
    //fungsi atau method dengan kembalian
    //dengan nilai
    private static int simpel(){
        return 10;
    }
}
