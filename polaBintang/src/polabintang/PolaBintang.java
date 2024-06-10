package polabintang;

import java.util.Scanner;

public class PolaBintang {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");  //persegi
        int n = x.nextInt();
        System.out.println("\npola persegi");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\npola segi tiga");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
                System.out.print("\n");
        }
        
        System.out.println("\npola segi tiga terbalik");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if ((i + j) == (n-1)) {
                    break;
                }
            }
            System.out.print("\n");
        }
        
        System.out.println("\npola piramida miring");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }else if((i + j) == (n-1)){
                    break;
                }
            }
            System.out.println("");
        }
        
        System.out.println("\npola piramid");
        for(int i = 1; i <= n; i++) {
  
            for(int j = 1; j <= n -i; j++) {
                System.out.print(" ");
            }
    
            for(int k = 1; k <= i; k++) {
            System.out.print(" *");
            }
        System.out.println("");
        }
        
        System.out.println("\npola wajik");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("\npola piramid terbalik");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("\npola segitiga");
        for (int i=0; i<=n; i++){
             for (int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             for (int k=1; k<=i; k++){
                 System.out.print("*");
             }
             System.out.println();
         }

        System.out.println("\npola segitiga");
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < n -1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.println("*");
            }
            System.out.println("");
        }
        
        int a=n,b,e=n-1;
        for(int i=1;i<=n;i++){
            b = 1;
            for(int j=1;j<=a;j++) {
                if (b<=e) {
                    System.out.print(" ");
                    b++;
                } else {
                    if(j==b||j==a||e==0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            e--;
            a++;
            System.out.print("\n");
        }
        
        
            
             
        
        
        
        
        
        
        
        
        
    }
}