import java.awt.*;
import javafx.scene.control.PasswordField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class formdata extends JFrame{
    JButton tombol1;
    JLabel nama, nim, login,jekel,agama,alamat;
    TextField Uname;
    JFormattedTextField pw ;
    JTextArea al;
    JRadioButton rb1,rb2;
    JComboBox cb;
    ButtonGroup bg;
    
    public void form(){
        setTitle("Data Diri Mahasiswa");
        tombol1 = new JButton("Ok");
        login = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        Uname = new TextField(" ");
        nim = new JLabel("NIM");
        pw = new JFormattedTextField(" ");
        jekel = new JLabel("Jenis Kelamin");
        rb1=new JRadioButton("L");  
        rb2=new JRadioButton("P");  
        ButtonGroup bg=new ButtonGroup();    
        bg.add(rb1);bg.add(rb2);  
        agama = new JLabel("Agama");
        String ag[]={"Islam","Kristen","Katolik","Hindu","Budha"};
        cb=new JComboBox(ag);        
        alamat = new JLabel("Alamat");
        al = new JTextArea();
        
        setLayout(null);
        add(login);
        add(nama);
        add(Uname);
        add(nim);
        add(pw);
        add(jekel);
        add(rb1);
        add(rb2);
        add(agama);
        add(cb);
        add(alamat);
        add(al);
        add(tombol1);
        
        login.setBounds(180, 15, 250, 25);
        nama.setBounds(80, 35, 100, 60);
        Uname.setBounds(200, 55, 180, 20);
        nim.setBounds(80, 72, 100, 60);
        pw.setBounds(200, 92, 180, 20);
        jekel.setBounds(80, 112, 100, 60);
        rb1.setBounds(210, 132, 50, 20);
        rb2.setBounds(310, 132, 180, 20);
        agama.setBounds(80, 152, 100, 60);
        cb.setBounds(200, 172, 180, 20);
        alamat.setBounds(80, 192, 100, 60);
        al.setBounds(200, 212, 210, 120);
        tombol1.setBounds(350, 375, 60, 20);
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
                 }
}

                 
    

                 