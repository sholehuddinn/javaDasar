package guntingbatukertas;

import javax.swing.JOptionPane;
import javax.swing.*;

public class GuntingBatuKertas {
    public static void main(String[] args) {

        int pilih , komp = 0, user = 0;
        String u = ""; // USER
        String b = ""; // KOMPUTER
        String k = ""; // HASIL
        String h = ""; // HISTORY

        do {
            String[] a = {"GUNTING", "BATU", "KERTAS", "History"}; 
            pilih = JOptionPane.showOptionDialog(null, "Tebak Kompuermu Mikirin yang Mana", "GAME GABUT", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION,null, a, a);
            
            double ran =  Math.random() * 3;
            double rand = Math.ceil(ran);
            
            if(pilih >=0 && pilih < 3){
                if (pilih == 0) {
                    u = "GUNTING";
                }else if(pilih == 1){
                    u = "BATU";
                }else if(pilih == 2){
                    u = "KERTAS";
                }
                if(rand == 1.0) {
                    b = "GUNTING";
                }else if(rand == 2.0){
                    b = "BATU";
                }else if(rand == 3.0){
                    b = "KERTAS";
                }
                if(pilih == 0 && rand == 1.0){
                    k = "IMBANG!";
                }else if(pilih == 1 && rand == 2.0){
                    k = "IMBANG!";
                }else if(pilih == 2 && rand == 3.0){
                    k = "IMBANG!";
                }
                if (pilih == 0 && rand == 2.0) {
                    k = "KALAH";
                    komp++;
                }else if(pilih == 0 && rand == 3.0){
                    k = "MENANG";
                    user++;
                }else if(pilih == 1 && rand == 3.0){
                    k = "KALAH";
                    komp++;
                }else if (pilih == 1 && rand == 1.0) {
                    k = "MENANG";
                    user++;
                }else if (pilih == 2 && rand == 1.0) {
                    k = "KALAH";
                    komp++;
                }else if (pilih == 2 && rand == 2.0) {
                    k = "MENANG";
                    user++;
                }
                JOptionPane.showConfirmDialog(null,"KAMU : " + u + "\nKOMP : " + b + "\n" + k, "hasil", JOptionPane.PLAIN_MESSAGE);
            }else if (pilih == 3) {
                JOptionPane.showConfirmDialog(null, "komputer     " + komp + "\nkamu             " + user,"", JOptionPane.PLAIN_MESSAGE);
            }
        } while (pilih != -1);
    }
}