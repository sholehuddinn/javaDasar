package looping;

import java.util.Scanner;

public class tugasBuVe {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int pilihan, n;
        
        while(true){
            System.out.println("Menu :");
            System.out.println("1. rata kanan");
            System.out.println("2. rata kiri");
            System.out.println("3. segitiga");
            System.out.println("4. segitiga terbalik");
            System.out.println("5. segitiga empat");
            System.out.println("6. segitiga sama sisi");
            System.out.println("7. segitiga kota(kosong)");
            System.out.println("8. ketupat");
            System.out.println("9. triangular ");
            System.out.println("10. trapesium");
            System.out.println("11. simetris");
            System.out.println("99. keluar");
            System.out.print("Masukkan Pilihan : ");
            pilihan = x.nextInt();
            
            if (pilihan == 99) {
                break;
            }else if (pilihan == 1) {
                System.out.print("n : ");
                n = x.nextInt();    //rata kanan
                for (int i = 1; i <=n; i++) {
                    for (int j = n; j>i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            }else if (pilihan == 2) {
                System.out.print("n : ");
                n = x.nextInt();    //rata kiri
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                        if (i == j) {
                            break;
                        }
                    }
                    System.out.println("");
                }
            }else if (pilihan == 6) {
                System.out.print("n : ");
                n = x.nextInt();    //segitiga sama sisi
                for (int i = 0;  i <= n; i++){
                    for (int j = 1; j <= n - i; j++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
            }else if (pilihan == 4) {
                System.out.print("n : ");
                n = x.nextInt();    //segitiga terbalik
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = n; k >= (2 * i - n); k--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }else if (pilihan == 8) {
                System.out.print("n : ");
                n = x.nextInt();    //ketupat
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
            }else if (pilihan == 11) {
                System.out.print("n : ");
                n = x.nextInt();    //simetris
                int y =(int) Math.ceil(n/2.0);
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == y) {
                            System.out.print("* ");
                        }else if (j == y) {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                        System.out.println("");
                }
            }else if (pilihan == 3) {
                System.out.print("n : ");
                n = x.nextInt();    //segitiga 
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                
            }else if (pilihan == 7) {
                System.out.print("n : ");
                n = x.nextInt();    //segitiga kosong
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
            }else if (pilihan == 10) {
                System.out.print("n : ");
                n = x.nextInt();    //trapesium
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j > i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    for (int j = 1; j <= n; j++) {
                        System.out.print("* ");
                    }
                    for (int j = 1; j <= n; j++) {
                        System.out.print("* ");
                    if (j==i) {
                        break;
                        }
                    }
                    System.out.println("");
                }
            }else if (pilihan == 5) {
                System.out.print("n : ");
                n = x.nextInt();    //segitiga empat
                int bilangan = 1;
                for(int i = 1; i <= n; i++)
                {
                    for(int j = 1;j <= n; j++)
                    {
                        if(j <= bilangan || j >= n - bilangan + 1)
                        {
                           System.out.printf("*");
                        }
                        else
                        {
                         System.out.printf(" ");    
                        }
                    }
                    if(i <= n / 2)
                  bilangan++;
                    else
                       bilangan--;
                    System.out.println(); 
                }
            }else if (pilihan == 9) {
                System.out.print("n : ");
                n = x.nextInt();    //triangular
                for (int i = 0;  i <= n; i++){
                    for (int j = 1; j <= n - i; j++){
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++){
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
            }else{
                continue;
            }
            System.out.println("");  
        }
    }
}