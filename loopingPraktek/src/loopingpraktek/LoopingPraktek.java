package loopingpraktek;

import java.util.Scanner;

public class LoopingPraktek {
    public static void main(String[] args) {
        
      Scanner x = new Scanner (System.in);
     /*     String y = null;
        
        for (int i = 3; true; i++) {
            System.out.println(i);
            y += i + ", ";
            i += 3;
            
            System.out.print("Menghitung ulang [Y/N] : ");
            String tanya = x.nextLine();
            if (tanya.equals("n")){
                break;
            }
           
        }
         
        int a =0;
        
        for (int i = 1; i <= a; i++) {
            System.out.print("masukkan angka : ");
            a=x.nextInt();
            System.out.println(a+" ");
            System.out.print(a+" ");
            
        }*/
    int p = 0 ,n,i;
        System.out.print("n : ");
        n=x.nextInt();
        for ( i = 1; i <= n; i++) {
            if (p == n) {
                System.out.print(i+" =");
                break;
            }
            System.out.print(i+" + ");
           p += i; 
        }
        
    System.out.println("total = "+p);
    
        
        
        
    }
    
}
