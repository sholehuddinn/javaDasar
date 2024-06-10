/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package literasi.dan.rekursif.algorithm;

/**
 *
 * @author Dell
 */

    /**
     * @param args the command line arguments
     */
    public class pangkatRekursif {
        public int HitungPangkat(int x, int y){
            if (y == 1) {
                return x;
            }else if (y == 0) {
                return 1;
            }else{
                return x * HitungPangkat(x, y - 1);
            }
        }
        
        public static long faktorial(long n) {
            System.out.println("masuk = " + n);
            if (n == 1 || n == 0) 
                return 1;
                return n * faktorial(n - 1);
            
        }
    
        public static long fibonacci(long m){
            if (m == 0 || m == 1) {
                return 1;
            }else{
                return fibonacci(m - 2) + fibonacci(m - 1);
            }
        }
        
        public static int fpb(int o, int p){
            if (o % p == 0) {
                return p;
            }else{
                return fpb(p, o % p);
            }
   
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        pangkatRekursif p = new pangkatRekursif();
        
        System.out.println(p.HitungPangkat(3, 6));
        
        System.out.println("20 faktorial = " + faktorial(20));
        
        int q = 10;
        for (int i = 0; i < q; i++) {
            System.out.println(fibonacci(i) + " ");
        }
        
        System.out.println("fpb " + fpb(335, 25));
        
    
        }
    }    