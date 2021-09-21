
package online.car.rent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class login extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1 ,t2;
    //JPasswordField t2;
    login(){
       
        JLabel l1=new JLabel(" username");
        l1.setBounds(30,30,80,60);
        l1.setFont(new Font("tahoma",Font.BOLD,15));
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(170,40,110,30);
        add(t1);
        
        JLabel l2=new JLabel(" password");
        l2.setBounds(30,140,80,40);
        l2.setFont(new Font("tahoma",Font.BOLD,15));
        add(l2);
        
        t2=new JTextField();
        t2.setBounds(170,150,110,30);
        add(t2);
         
         b1=new JButton("login");
        b1.setBounds(100,250,110,50);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("cancel");
        b2.setBounds(250,250,100,50);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        
        b2.addActionListener(this);
        add(b2);
               
        
        
        setBounds(300,50,450,450);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
          String username=t1.getText();
          String password=t2.getText();
          
         mysqlConnection con=new mysqlConnection();
         String str ="select * from login where username ='"+username+"' and password = '"+password+"'" ;
          
         try{
             ResultSet rs=con.s.executeQuery(str);
              if(rs.next()){
                  new menuPage().setVisible(true);
                  this.setVisible(false);
              }
              else{
                  JOptionPane.showMessageDialog(null,"invalid login");
                  this.setVisible(false);
              }
              
         }
          catch(Exception e){
              
          }
          
          
        }
        else if(ae.getSource()==b2){
            System.exit(0);
            
        }
        
    }
    public static void main(String[] args) {
       new login();
    }
}

