package array;

import java.util.*;

public class arrayMultiDimensi {
    public static void main(String[] args) {
        
        //cara membuat array 2 dimensi
        //menggunakan Arrays.deepToString dengan asigment
        int[][] array2d = {
            {1,2},
            {3,4}   
        };
        System.out.println(Arrays.deepToString(array2d));
        printArray(array2d);
        System.out.println(Arrays.toString(array2d[0]));
        System.out.println(Arrays.toString(array2d[1]));
        System.out.println("");
        
        //membuat array 2 dimensi dengan deklarasi
        //int [baris][kolom]
        int[][] arr = new int[5][4];
        printArray(arr);
        System.out.println("panjang array : " + arr.length + "\n");
        
        //looping lengkap manual
        for (int i = 0; i < arr.length; i++) {  //baris
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {   //kolom
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("]\n");
        }  
        System.out.println("");
        
        //looping foreach
        for (int[] baris : arr) {
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //pembuktian kolom != baris masih bisa di print
        int[][] array2 = {
            {1,2,3,4},
            {5,6,7,8,9},
            {10,11,12,13,14}
        };
        printArray(array2);
        System.out.println("");
        
        //penggabungan 2 dimensi array
        char[] arrc1 = {'q','w','e','r','t','y'};
        char[] arrc2 = {'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(arrc1));
        System.out.println(Arrays.toString(arrc2));
        System.out.println("");
        char[][] arrc = {
            arrc1,
            arrc2
        };
        printArray(arrc);
        System.out.println("");
        
        //address
        System.out.println(arrc[0]);
        System.out.println(arrc[1]);
        System.out.println(arrc);
        System.out.println("");
        System.out.println(arrc1);
        System.out.println(arrc2);
        System.out.println(arrc);
        System.out.println("");
        System.out.println(System.identityHashCode(arrc1));
        System.out.println(System.identityHashCode(arrc2));
        System.out.println(System.identityHashCode(arrc));
        System.out.println("");
        System.out.println(Integer.toHexString(System.identityHashCode(arrc1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrc2)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrc)));
        
        //beda tipe data tidak bisa di print
        
        
        
    }
    //looping array multi Dimensi
    private static void printArray(int[][] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
    private static void printArray(char[][] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
