package javaapplication5;

import java.lang.StringBuilder;

public class String_Builder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printBuild(builder);
        
    // append
    // kalo concat membuat memory baru
        builder.append(" semuanya");
        printBuild(builder);
        
        builder.append(" warga surabaya");
        printBuild(builder);

    // insert
        builder.insert(19, " kota");
        printBuild(builder);
        
    //delete
        builder.delete(0, 5);
        printBuild(builder);
        
    //rubah character pada index tertentu
        builder.setCharAt(0, 'T');
        printBuild(builder);
        
    // replace
        builder.replace(20, 28, "bandung");
        printBuild(builder);

    //merubah menjadi String
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int Saddress = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(Saddress));   //merubah address
        System.out.println("");
        
    //  merubah kembali menjadi StringBuilder
        StringBuilder builderr = new StringBuilder(kalimat);
        printBuild(builderr);
    }
    private static void printBuild(StringBuilder build){
        System.out.println("data = " + build);
        System.out.println("panjang = " + build.length());
        System.out.println("kapasitas = " + build.capacity());  // +16

        int address = System.identityHashCode(build);
        System.out.println("address = " + Integer.toHexString(address) + "\n");
    }
    
}
