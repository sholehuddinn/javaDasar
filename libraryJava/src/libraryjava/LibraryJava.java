package libraryjava;
public class LibraryJava {
    public static void main(String[] args) {

        int a = -2;
        int b = 7;

        System.out.println("absolute = "+Math.abs(a));
        System.out.println("absolute = "+Math.abs(b));
        System.out.println("");
        
        int c = 2;
        int d = 8;

        System.out.println("pangkat = " + (int)Math.pow(d, c));
        System.out.println("");

        double e = 3.71;
        double f = 3.41;
        
        System.out.println(e);
        System.out.println(f);
        System.out.println("pembulatan ke atas = " + Math.ceil(e));
        System.out.println("pembulatan ke atas = " + Math.ceil(f));
        System.out.println("pembulatan ke bawah = " + Math.floor(e));
        System.out.println("pembulatan ke bawah = " + Math.floor(f));
        System.out.println("pembulatan ke terdekat = " + Math.round(e));
        System.out.println("pembulatan ke terdekat = " + Math.round(f));
        System.out.println("");

        //sin cos tan
        double g = 30;
        double h = 45;
        
        System.out.println(g);
        System.out.println(h);
        System.out.println("sin 30 = " + Math.sin(Math.toRadians(g)));
        System.out.println("cos 30 = " + Math.cos(Math.toRadians(g)));
        System.out.println("tan 30 = " + Math.tan(Math.toRadians(g)));
        System.out.println("sin 45 = " + Math.sin(Math.toRadians(h)));
        System.out.println("cos 45 = " + Math.cos(Math.toRadians(h)));
        System.out.println("tan 45 = " + Math.tan(Math.toRadians(h)));
        System.out.println("");

        //konstanta PI
        int radius;
        radius = 10;
        
        System.out.println("luas lingkaran dengan jari-jari " +radius+" satuan = " + (Math.PI*Math.pow(radius, 2)));
        System.out.println("");

        //angka random
        double j;
        
        j = Math.random();
        System.out.println("nilai random 1 = "+j);
        System.out.println("nilai random 2 = "+Math.floor(100*j));

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("nilai random 1-100,nilai ke-" + i + " = " + Math.floor(100*j));
        }
        System.out.println("");                
        
        int k = 15;
        int l = 8;
        
        System.out.println("nilai max adalah = " + Math.max(k, l));
        System.out.println("nilai min adalah = " + Math.min(k, l));
        System.out.println("");
        
        //mancari akar
        double m = 625;
        double akar;
        akar = Math.sqrt(m);
        System.out.println("akar  = " + akar);
        System.out.println("");
        
        
    }
    
}
