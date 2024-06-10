package nim_joption;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JTextArea;  

public class NIM_jOption {

    private static Object mf;

    public static void main(String[] args) {
               
        JFrame frame = new JFrame("INSTITUT TEKNOLOGI TERTUTUP");
        
        String[] jurusan = {"sipil","informatika","geomatika"};
        final JComboBox Jlist =new JComboBox(jurusan);
        Jlist.setSelectedIndex(2);
        Jlist.setBounds(320,225,125,30);
        
        String[] kelas1= {"pagi","sore"};
        JComboBox kelas =  new JComboBox<>(kelas1);
        kelas.setBounds(165, 225, 120, 30);
        
        String[] tahun = {"2021","2022","2023","2024"};
        JComboBox f = new JComboBox<>(tahun);
        f.setBounds(25,225, 100,30);  
        
        JLabel f1 = new JLabel("Kelas");
        f1.setBounds(175, 195, 100, 30);
        
        JLabel f2 = new JLabel("Prodi");
        f2.setBounds(345, 195, 100, 30);

        JLabel f3 = new JLabel("Masukkan data anda di bawah ini");
        f3.setBounds(130, 50, 240, 100);
        
        JLabel f4 = new JLabel ("Nama");
        f4.setBounds(25, 120, 100, 30);
        
        JLabel f5 = new JLabel ("tahun");
        f5.setBounds(25, 195, 200, 30);
        
        JLabel f6 = new JLabel ("Nomor HP");
        f6.setBounds(345, 120, 100, 30);
        
        JTextField NAMA = new JTextField();
        NAMA.setBounds(25, 150, 250, 30);
        
        JTextField nh = new JTextField();
        nh.setBounds(320, 150, 100, 30);
        
        JButton Tombol = new JButton("Cetak Nim");
        Tombol.setBounds(300, 300, 120, 30);
        
        JTextArea label = new JTextArea();
        label.setBounds(20, 400, 500, 200);
        label.setEditable(false);
        label.setSize(460, 100);
        
        frame.add(nh);
        frame.add(kelas);
        frame.add(Tombol);
        frame.add(Jlist);
        frame.add(NAMA);
        frame.add(f1);
        frame.add(f);
        frame.add(f2);
        frame.add(f3);
        frame.add(f4);
        frame.add(f6);
        frame.add(f5);
        frame.add(Tombol);
        frame.add(label);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);//menampilkan kotak an
        
        Tombol.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
        String NIM ="";
        NIM =""+f.getItemAt(f.getSelectedIndex());
        
         switch(kelas.getSelectedIndex()){
            case 0:
            NIM+="11";
            break;
            case 1:
            NIM+="21";
        }
          switch(Jlist.getSelectedIndex()){
            case 0:
            NIM+="4200";
            break;
            case 1:
            NIM+="4300";
            break;
            case 2:
            NIM+="4100";
            break;
        }
          
          String jursan=""+Jlist.getItemAt( Jlist.getSelectedIndex());
          
          String kelas1=""+kelas.getItemAt(kelas.getSelectedIndex());
          
          String r = ""+f.getItemAt(f.getSelectedIndex());
          
          int rand = (int) (Math.random()*100);
          
          if (NAMA.getText().isEmpty()){
              label.setText("tulis nama !");
          }else if (nh.getText().isEmpty()){
              label.setText("tulis nomor hp !");
          }else{
              label.setText("NAMA\t" + NAMA.getText()+"\nNIM\t" + NIM+rand+"\nNO. HP\t" + nh.getText()+"\nTAHUN\t" + r+"\nKELAS\t" + kelas1+"\nPRODI\t" + jursan);
          }
        }
        });
    }
}
