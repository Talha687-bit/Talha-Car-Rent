import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    login(){
       
        JLabel l1=new JLabel(" username");
        l1.setBounds(30,30,80,60);
        l1.setFont(new Font("Alam",Font.BOLD,15));
        add(l1);
       
        JTextField t1=new JTextField();
        t1.setBounds(170,40,110,30);
        add(t1);
       
        JLabel l2=new JLabel(" password");
        l2.setBounds(30,140,80,40);
        l2.setFont(new Font("Alam",Font.BOLD,15));
        add(l2);
       
        JTextField t2=new JTextField();
        t2.setBounds(170,150,110,30);
        add(t2);
         
        JButton b1=new JButton("login");
        b1.setBounds(100,250,110,50);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        add(b1);
       
        JButton b2=new JButton("cancel");
        b2.setBounds(250,250,100,50);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        add(b2);
               
       
       
        setBounds(300,50,450,450);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
       
    }
    public static void main(String[] args) {
       new login();
    }
}