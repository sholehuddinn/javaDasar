package determinan_dan_akarnya;
public class Determinan_dan_akarnya {
    public static void main(String[] args) {
        
        float a, b, c;
        double D, X1, X2, X1X2, X11, X22;
        boolean PernyataanD1, PernyataanD2, PernyataanD3;
        
        a = 8;
        b = 12;
        c = 6;
        D = (b * b) - (4 * a * c);
        
        System.out.println("Nilai Determinan= " + D);
        
        PernyataanD1 = D == 0;
        X1X2 = -b / 2 * a; //X1=X2=-b/2*a;
        System.out.println("Apakah Nilai D==0, true/false? " + PernyataanD1);
        System.out.println("Nilai Akar X1= " + X1X2);
        System.out.println("Nilai Akar X2= " + X1X2);
        System.out.println();
        
        PernyataanD2 = D >= 0;
        X1 = (-b + (Math.sqrt(D))) / (2 * a);
        X2 = (-b - (Math.sqrt(D))) / (2 * a);
        System.out.println("Apakah Nilai D>=0, trus/false? " + PernyataanD2);
        System.out.println("Nilai Akar X1= " + X1);
        System.out.println("Nilai Akar X2= " + X2);
        System.out.println();
        
        PernyataanD3 = D <= 0;
        X11 = (-b / (2 * a)) + (Math.sqrt(-D)) / (2 * a);
        X22 = (-b / (2 * a)) + (Math.sqrt(-D)) / (2 * a);
        System.out.println("Apakah Nilai D<=0, true/false? " + PernyataanD3);
        System.out.println("Nilai X1= " + X11);
        System.out.println("Nilai X2= " + X22);
    }
    
}
