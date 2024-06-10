
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;  
public class PembuatannimV2 {
    
    
    
    
    
    public static void main (String[]args){
        
        

        JFrame frame = new JFrame();
        String[] jurusanList = {"Informatika","Geomatika","Sipil"};
        final JComboBox Jlist =new JComboBox(jurusanList); Jlist.setSelectedIndex(2);
        Jlist.setBounds(320,200,125,30);
        frame.getContentPane().setBackground(Color.CYAN);

        
        String[] jamKelas = {"Kelas Pagi", "Kelas Malam"};
        JComboBox listKelas = new JComboBox<>(jamKelas);
        listKelas.setBounds(165, 200, 120, 30);

        
        //JLabel label = new JLabel();
        


        JTextArea label = new JTextArea();
        label.setBounds(20, 400, 500, 200);
        label.setEditable(false);
        label.setSize(460, 100);

        JLabel f = new JLabel("Tahun Masuk");
        f.setBounds(25,170, 100,30);  
        
        JLabel f1 = new JLabel("Waktu Kelas");
        f1.setBounds(175, 170, 100, 30);
        
        JLabel f2 = new JLabel("Jurusan");
        f2.setBounds(345, 170, 100, 30);

        JLabel f3 = new JLabel("Masukkan data anda di bawah ini");
        f3.setBounds(130, 50, 240, 100);
        
        JTextField tahun = new JTextField();
        tahun.setBounds(10, 200, 120, 30);
       
        
        JButton Tombol = new JButton("Cetak Nim");
        Tombol.setBounds(300, 300, 120, 30);
        Color warna = new Color(50, 255, 180);
        Tombol.setBackground(warna);
        
        
        frame.add(Jlist); frame.add(Tombol); frame.add(label); frame.add(tahun); frame.add(listKelas); frame.add(f); frame.add(f1); frame.add(f2); frame.add(f3);
        frame.setSize(500,600);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        
        Tombol.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        String NIM="";
        NIM+=tahun.getText();
        switch(listKelas.getSelectedIndex()){
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

        String jursan=""+Jlist.getItemAt(Jlist.getSelectedIndex());
        
        String waktuKelas = ""+listKelas.getItemAt(listKelas.getSelectedIndex());

        String tahunDaftar = tahun.getText();
        if (tahun.getText().isEmpty()){
           label.setText("tolong Masukkan Tahun");
        }else{label.setText("Tahun masuk kuliah :\t"+tahun.getText()+"\nGolongan :\t\t"+waktuKelas+"\nProgram Studi :\t"+jursan+"\n\n NIm anda adalah :\t"+NIM+(int)(Math.random()*100));}
          

        
        }
        });
    }
}
