package looping;
public class ve {
    public static void main(String[] args) {
        
        for (int i = 0; i < 2; i++) {
            System.out.println("fajar");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i + "");
            }
            System.out.println("");
        }
        System.out.println("");
        int i = 0;
        
        while(i < 10){
            i++;
            System.out.println(i);
        }
        System.out.println("");
        boolean y = true;
        while(y){
            System.out.println("wesmari");
            y = false;
        }
        
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (true);
        
        // Branching Stetement
        
        
        
        
        
    }
}
