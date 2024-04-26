
package bankmanagement.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Withdrawl extends JFrame implements ActionListener {
  ImageIcon im1;
  ImageIcon im2;
  Image i1;
  JLabel image;
  JLabel l1;
  JTextField amount;
  JButton b1;
  JButton b2;
    String pinNumber;
    public Withdrawl( String pinNumber){
        this.pinNumber=pinNumber;
  
    im1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jfif"));
    i1=im1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
    im2=new ImageIcon(i1);
    image=new JLabel(im2);
    add(image);
    
   l1=new JLabel("enter the amount you need to withdrawl");
   l1.setBounds(300,255,700,35);
   l1.setForeground(Color.black);
   l1.setFont(new Font("System",Font.BOLD,16));
   image.add(l1);
   
   amount =new JTextField();
   amount.setBounds(280,440,200,30);
   image.setFont(new Font("System",Font.BOLD,22));
    image.add(amount);
   
   b1=new JButton("Withdrawl");
   b1.setBounds(410,545,100,20);
   b1.addActionListener(this);
   image.add(b1);
   
    b2=new JButton("Back");
   b2.setBounds(410,575,100,20);
   b2. addActionListener(this);
   image.add(b2);
   
  
    setSize(900,900);
    setLocation(300,0);  
    setVisible(true);
     
    }
 public void actionPerformed(ActionEvent ev){
 if(ev.getSource()==b1){
 String withdrAmount=amount.getText();
 Date date=new Date();
 if(withdrAmount.equals("")){
 JOptionPane.showMessageDialog(null,"please enter the amount you need");
 }
 else{
  Conn co=new Conn();
 String query="INSERT INTO `withdrawn`(`Pin`, `Date`, `Type`, `Amount`) VALUES('"+pinNumber+"','"+date+"','withdrawl','"+withdrAmount+"')";
 try{
 co.st.executeUpdate(query);
  JOptionPane.showMessageDialog(null,"Rs "+withdrAmount+" "+"is"+" "+"withdrawn successfully");
  setVisible(false);
  new Transactions(pinNumber).setVisible(true);
 }
 catch(Exception e){
         JOptionPane.showMessageDialog(null,e); 
         }
 }}
 
 else if(ev.getSource()==b2){ 
 setVisible(false);
 new Transactions(pinNumber).setVisible(true);
 }
 }   
  public static void main(String[] args){
 new Withdrawl(""); 
  }  
}
