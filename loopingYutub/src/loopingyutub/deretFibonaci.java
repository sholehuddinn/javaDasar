package loopingyutub;

import java.util.Scanner;

public class deretFibonaci {
    public static void main(String[] args) {
        
        int fn1=1,fn2=0,fn=1,n;
        Scanner x = new Scanner(System.in);
        
        System.out.print("nilai fibonacci = ");
        n=x.nextInt();
        
        System.out.println("for");
        for (int i = 1; i <= n; i++) {
            System.out.println("nilai ke-"+i+" adalah "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }           
 /*       System.out.println("while");
        boolean kon = true;
        int y=0;
        while(kon){
            
            y++;
            System.out.println("nilai ke-"+y+" adalah "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            
            if(y == n){
                kon = false;
            }
        }           */
 /*       System.out.println("do while");
        boolean kondisi = true;
        int a =0;
        do{
            a++;
            System.out.println("nilai ke-"+a+" adalah "+fn);
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            
            if (a == n){
                kondisi = false;
            }
        }while(kondisi);
        
        */
        
        
    }
    
 
}
