package javaapplication55;

import java.util.Scanner;

public class Prak41 {
    public static void main(String[] args) {

        String grade ="";
        int  tugas, uts, uas;
        double na;
        
        Scanner x = new Scanner (System.in);
        
        System.out.println("masukkan nilai");
        System.out.print("tugas = ");
        tugas = x.nextInt();
        
        System.out.print("uts = ");
        uts = x.nextInt();
        
        System.out.print("uas = ");
        uas = x.nextInt();
        
        na = (0.1 * tugas) + (0.4 * uts) + (0.5 * uas);
        
        if (uts == 0|| uas == 0){
            grade = "X ";
        }else if (na > 100 ){
            grade = "over load";
        }else if (na >=86 && na <=100 ){
            grade = "A ";
        }else if(na >= 80 && na <86){
            grade = "A-";
        }else if (na >= 76 && na < 80){
            grade = "B+";
        }else if (na >= 70 && na <76){
            grade = "B ";
        }else if (na >= 66 && na <70){
            grade = "B-";
        }else if(na >= 60 && na < 66){
            grade = "C+";
        }else if (na >= 56 && na <60){
            grade = "C ";
        }else if (na >= 36 && na < 56){
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("na = " + na);
        System.out.println("grade = " + grade);
    }
}
