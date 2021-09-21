
package online.car.rent;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class menuPage  extends JFrame implements ActionListener{
    
    JButton b1,b2,b3;
    
    
    menuPage(){
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("online/car/rent/car rental/toyota noah.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(300,300,200,200);
        add(l1); 
        
        JButton b4=new JButton("CAR INVENTORY");
        b4.setBounds(0,0,1500,100);
        b4.setFont(new Font("serif",Font.BOLD,30));
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        add(b4);
        
        b1=new JButton("noah");
        b1.setBounds(300,500,200,50);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b1.addActionListener(this);
        
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("online/car/rent/car rental/axio.jpg"));
        Image i5=i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(800,300,200,200);
        add(l2); 
        
        b2=new JButton("axio");
        b2.setBounds(800,500,200,50);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        b2.addActionListener(this);
        
        
         ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("online/car/rent/car rental/toyota allion.jpg"));
        Image i8=i7.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(550,300,200,200);
        add(l3); 
        
         b3=new JButton("allion");
        b3.setBounds(550,500,200,50);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        add(b3);
        
        b3.addActionListener(this);
        
        
        
        setBounds(0,0,1500,810);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
       if(ae.getSource()==b1){
         //new fish().setVisible(true);
        //this.setVisible(false);   
        }
        else if(ae.getSource()==b2){
            //new meat().setVisible(true);
             this.setVisible(false); 
        }
        else if(ae.getSource()==b3){
           // new fruitVegetable().setVisible(true);
             this.setVisible(false);   
        }
    }
    
   public static void main(String[] args) {
       new menuPage();
    }
     
}
