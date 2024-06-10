package javaapplication54;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class prak5 {
    public static void main(String[] args) {
      
    JFrame frame = new JFrame("MENGHITUNG LUAS TANAH");
    
    JTextField P = new JTextField();
    P.setBounds(50, 80, 100, 30);

    JTextField L = new JTextField();
    L.setBounds(320, 80, 100, 30); 
    
    JLabel f1 = new JLabel("PANJANG");
    f1.setBounds(50, 50, 100, 30);
    
    JLabel f2 = new JLabel("LEBAR");
    f2.setBounds(320, 50, 100, 30);
    
    JLabel f3 = new JLabel("Menghitung Luas Tanah");
    f3.setBounds(25, 250, 300, 30);
    
    JButton Tombol = new JButton("Cetak Luas");
    Tombol.setBounds(300, 300, 120, 30);
    
    JTextArea label = new JTextArea();
    label.setBounds(20, 400, 500, 200);
    label.setEditable(false);
    label.setSize(460, 100);
    
    frame.add(P);
    frame.add(L);
    frame.add(f1);
    frame.add(f2);
    frame.add(f3);
    frame.add(Tombol);
    frame.add(label);
    frame.setSize(500,600);
    frame.setLayout(null);
    frame.setVisible(true);
    
     Tombol.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
        int p, l, luas;
        p = Integer.parseInt(P.getText());
        l = Integer.parseInt(L.getText());
        luas = p*l;
        
        label.setText("panjang\t= " + p+" M\nlebar\t= "+l+" M\nLuas\t= "+luas+" M^2");
        }
     } );
     }
    
    }
  

