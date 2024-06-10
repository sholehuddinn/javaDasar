package prank;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prank {
    public static void main(String[] args) {

        String message = "\"The Comedy of Errors\"\n"
        + "is considered by many scholars to be\n"
        + "the first play Shakespeare wrote";
            for (int i = 9999; i < 99999; i++) {
                
            JOptionPane.showMessageDialog(new JFrame(), message, "virus",JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
}
