/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class prak7desma {
    public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);
        String nb[] = new String[9];
        String barang[] ={"Almamater","Buku","Alat tulis","Spidol","Tas"};
        int stok[] = {100,150,300,50,20},nilai ,a = 0;
        int harga[] = {150000,75000,5000,10000,250000,0};

        System.out.println("=== Selamat Datang di Toko online UNITOMO ==");
        do{
        
        System.out.println("============================================");
        System.out.println("1. Lihat barang");
        System.out.println("2. Beli Barang");
        System.out.println("3. Lihat Keranjang");
        System.out.println("============================================");
        nilai = input.nextInt();
        //Lihat Barang
        if(nilai == 1){
            System.out.println("==NAMA==\t==Stok==\t==Harga==");
            for (int i = 0; i < barang.length; i++ ) {
                
                if(i != 0 && i != 2){
                    System.out.println(barang[i]+"\t\t"+stok[i]+"\t\t"+String.format("%,d", harga[i]));
                }else{
                    System.out.println(barang[i]+"\t"+stok[i]+"\t\t"+String.format("%,d", harga[i]));
                }
            }
            System.out.println("============================================");
        //beli barang
        }else if(nilai == 2){
            System.out.println("==NAMA==\t==Harga==");
            for (int i = 0; i < barang.length; i++){
                if(i != 0 && i != 2 && i != 3){
                    System.out.println((i+1)+"."+barang[i]+"\t\t"+String.format("%,d", harga[i]));
                }else{
                    System.out.println((i+1)+"."+barang[i]+"\t"+String.format("%,d", harga[i]));
                } 
            }
            System.out.println("============================================");
            System.out.print("pilih barang : ");
            nilai = input.nextInt()-1;
            
            for (int i = 0; i < barang.length; i++){
                if (nilai == i){
                    nb[a] = barang[i];
                    a++;
                    harga[5] += harga[i];
                }
            }
        //Lihat keranjang
        }else if(nilai == 3){
            System.out.println("\n=====Keranjang Anda=====");
            for (int i = 0; i < nb.length; i++){
                if(nb[i] != null){
                    System.out.println((i+1)+"."+nb[i]);
                }
            }
            System.out.println("Total harga : "+String.format("%,d",harga[5]));
            break;
        }
        }while(true);
        
        
    }
}
