
package online.car.rent;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class OnlineCarRent  extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    OnlineCarRent (){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online/car/rent/car rental/page1.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        //l1.setBounds(0,0,900,500);
        add(l1);
        
        JButton l2=new JButton("WELCOME TO ALAM VEHICLE RENTAL SHOP");
        l2.setBounds(0,0,1500,100);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l2.setBackground(Color.BLUE);
        l2.setForeground(Color.WHITE);
        l1.add(l2);
        
         b1=new JButton("signup");
        b1.setBounds(1200,200,160,50);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        
        
         b1.addActionListener(this);
         l1.add(b1);
         
        b2=new JButton("login");
        b2.setBounds(1200,270,160,50);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
       
        
         b2.addActionListener(this);
         l1.add(b2);
                
        b3=new JButton("Car inventory");
        b3.setBounds(1200,340,160,50);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        l1.add(b3);
        
        b3.addActionListener(this);
                
       
        
        
        setBounds(0,0,1500,810);
        getContentPane().setBackground(Color.WHITE);
        //setLayout(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
        new signup().setVisible(true);
        //this.setVisible(false);   
        }
        else if(ae.getSource()==b2){
            new login().setVisible(true);
            this.setVisible(false); 
        }
        else if(ae.getSource()==b3){
           new menuPage().setVisible(true);
           this.setVisible(false);   
        }
        
        //new menuPage().setVisible(true);
        //this.setVisible(false);
    
    }


    
    public static void main(String[] args) {
        new OnlineCarRent();
        
    }
    
}
