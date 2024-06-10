package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class coba {
    public static void main(String[] args) throws IOException {
        
        FileInputStream inputFile = new FileInputStream("input.txt");

        System.out.println(inputFile.read());

    }
}
