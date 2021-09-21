
package online.car.rent;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    signup(){
         JLabel l1=new JLabel(" username");
        l1.setBounds(30,30,100,60);
        l1.setFont(new Font("tahoma",Font.BOLD,15));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(170,45,110,25);
        add(t1);
        
        JLabel l2=new JLabel(" password");
        l2.setBounds(30,100,100,60);
        l2.setFont(new Font("tahoma",Font.BOLD,15));
        add(l2);
        
        t2=new JTextField();
        t2.setBounds(170,115,110,25);
        add(t2);
         
        JLabel l3=new JLabel(" phone no.");
        l3.setBounds(30,170,100,60);
        l3.setFont(new Font("tahoma",Font.BOLD,15));
        add(l3);
        
        t3=new JTextField();
        t3.setBounds(170,185,110,25);
        add(t3);
        
        JLabel l4=new JLabel(" email");
        l4.setBounds(30,240,80,60);
        l4.setFont(new Font("tahoma",Font.BOLD,15));
        add(l4);
        
        t4=new JTextField();
        t4.setBounds(170,255,110,25);
        add(t4);
        
        
        
        
        b1=new JButton("submit");
        b1.setBounds(100,350,120,50);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener( this);
        
        b2=new JButton("cancel");
        b2.setBounds(260,350,120,50);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);       
        
        
        setBounds(300,50,550,550);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
             
    }
    public void actionPerformed(ActionEvent ae){
        
    if(ae.getSource()==b1){
        String username=t1.getText();
        String password=t2.getText();
        String phone=t3.getText();
        String email=t4.getText();
        
        mysqlConnection c=new mysqlConnection();
        String str="insert into signup values('" +username +"', '" + password+"','" + phone+"','" + email+"')";
         try{ 
             c.s.executeUpdate(str);
             JOptionPane.showMessageDialog(null,"Account created");
             new  menuPage().setVisible(true);
             
         }
         catch(Exception e){
             System.out.println(e);
         }
    }
           else if(ae.getSource()==b2){
               this.setVisible(false);
            //System.exit(0);
        
           }
    }
    public static void main(String[] args) {
       new signup();
    }
}
