package array;

import java.util.Arrays;

public class ArrayYutub {
    public static void main(String[] args) {

    //penjumlahan 2 buah array
    //caranya menjumlahkan memakai looping  
        int[] arrayAngka1 = {1,6,4,9,12,58,5,7,5,7};
        int[] arrayAngka2 = {0,9,8,7,6,5,4,3,2,1};
        System.out.println("");
        
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        System.out.println("menjumlahkan array");
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");
        System.out.println("");
        
    //menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i < arrayAngka2.length; i++) {
            //biar ga saling menimpa jadi nya i + arrayAngka2.length
            arrayHasil2[i + arrayAngka2.length] = arrayAngka2[i];
        }
        System.out.println("menggabungkan 2 buah array");
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 2");
        System.out.println("");
                    
    //shorting reverse / mengurutkan tapi terbalik
        System.out.println("mengurutkan array");
        printArray(arrayAngka1, "array 1");
        
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka1, "sorted");
        
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reverse");
        System.out.println("");
        
    //merubah array menjadi string (menggunakan Arrays.toString())
        System.out.println("merubah array menjadi string");
        int[] arrayAngka3 = {2,4,5,2,5,7,8};
        printArray(arrayAngka3, "array 3");
        
    //megkopy array
        System.out.println("\nmengkopy array");
        int[] arrayAngka4 = new int[7];
        printArray(arrayAngka3, "array 3");
        printArray(arrayAngka4, "array 4");
        System.out.println("\nmengkopy dengan loop");
            for (int i = 0; i < arrayAngka3.length; i++) {
                arrayAngka4[i] = arrayAngka3[i];
            }
        printArray(arrayAngka3, "array 3");
        printArray(arrayAngka4, "array 4");
        
        System.out.println("\nmengkopy dengan copy.Of");
        int[] arrayAngka5 = Arrays.copyOf(arrayAngka3, arrayAngka3.length);//parameter ke 2 untuk yang di kopy berapa
        printArray(arrayAngka3, "array 3");
        printArray(arrayAngka4, "array 4");
        printArray(arrayAngka5, "array 5");
        
        System.out.println("\nmengkopy dengan copyOfRange");
        int[] arrayAngka6 = Arrays.copyOfRange(arrayAngka3, 3, 7);
        //parameter ke 3, 4 = (3)dari, (4)ke , misal (..., 3, 7) <== yang ke 7 tidak di ambil
        printArray(arrayAngka3, "array 3");
        printArray(arrayAngka6, "array 6");
        
    //fill array : mengisi semua indeks array dengan nilai sama
        System.out.println("\nfill array");
        int[] arrayAngka7 = new int[10];
        printArray(arrayAngka7, "array 7");
        Arrays.fill(arrayAngka7, 4);
        printArray(arrayAngka7, "array 7");
        
    //komparasi array buat bikin percabangan
        System.out.println("\nkomparasi array / membandingkan 2 array");
        int[] arrayAngka8 = {1,2,3,4,5};
        int[] arrayAngka9 = {1,2,3,4,5};
        int[] arrayAngka10 = {6,7,8,9};
        printArray(arrayAngka8, "array 8");
        printArray(arrayAngka9, "array 9");
        printArray(arrayAngka10, "array 10");
        
        if (Arrays.equals(arrayAngka8, arrayAngka9)) {
            System.out.println("array sama");
        }else{
            System.out.println("array beda");
        }
        if (Arrays.equals(arrayAngka8, arrayAngka10)) {
            System.out.println("array sama");
        }else{
            System.out.println("array beda");
        }
        
        System.out.println("");
        printArray(arrayAngka8, "array 8");
        printArray(arrayAngka9, "array 9");
        printArray(arrayAngka10, "array 10");
        System.out.println("mengecek array mana yang lebih besar");
//        System.out.println(Arrays.compare(arrayAngka9, arrayAngka10));
        
        System.out.println("\nngecek indeks yang berbeda");
//        System.out.println(Arrays.mismatch(arrayAngka8, arrayAngka9));
        
        //serch array
        System.out.println("\nserch array");
        int[] arrayAngka11 = {5,6,8,56,8,6,12,58,2,8,1};
        int angka = 5;
        int posisi = Arrays.binarySearch(arrayAngka11, angka);//parameter ke 2 : key
        printArray(arrayAngka11, "array 11");
        System.out.println("angka " + angka + " ada di indeks " + posisi);
        //library Arrays.binarySearch harus di sorting dulu
        int i = 0;
        System.out.println("");
        Arrays.sort(arrayAngka11);
        printArray(arrayAngka11, "array 11");
        posisi = Arrays.binarySearch(arrayAngka11, angka);//parameter ke 2 : key
        System.out.println("angka " + angka + " ada di indeks " + posisi);
        System.out.println("");
        //sorting ada di atas
    }
    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
    private static void address(int[] dataArray, String message){
        System.out.println("address " + message + " = " + dataArray);
    }
}