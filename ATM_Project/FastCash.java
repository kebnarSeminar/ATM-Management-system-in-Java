
package bankmanagement.system;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class FastCash  extends JFrame implements ActionListener {
    JLabel image; 
    JLabel l1;
    ImageIcon im1;
    Image i1;
    ImageIcon im2;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
     String pinNumber;
   public FastCash( String pinNumber){
    this.pinNumber=pinNumber;
        
        setLayout(null);
       im1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jfif"));
       i1=im1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        im2=new ImageIcon(i1);
        image=new JLabel(im2);
        image.setBounds(0,0,900,900);
        add(image);
        l1=new JLabel("please select withdrawl amount");
        l1.setBounds(300,265,700,35);
        l1.setForeground(Color.black);
        l1.setFont(new Font("System",Font.BOLD,16));
        image.add(l1);
        
        b1=new JButton("100");
        b1.setBounds(265,510,70,20);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("System",Font.BOLD,14));
        image.add(b1);
        b2=new JButton("500");
        b2.setBounds(265,540,70,20);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        b2.setFont(new Font("System",Font.BOLD,14));
        image.add(b2);
        b3=new JButton("1000");
        b3.setBounds(260,570,70,20);
        b3.addActionListener(this);
        b3.setForeground(Color.black);
        b3.setFont(new Font("System",Font.BOLD,14));
        image.add(b3);
        b4=new JButton("2000");
        b4.setBounds(260,600,70,20);
        b4.addActionListener(this);
        b4.setForeground(Color.black);
        b4.setFont(new Font("System",Font.BOLD,14));
        image.add(b4);
        b7=new JButton("5000");
        b7.setBounds(445,542,70,20);
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        b7.setFont(new Font("System",Font.BOLD,14));
        image.add(b7);
        b8=new JButton("3500");
        b8.setBounds(445,512,70,20);
        b8.setForeground(Color.black);
        b8.addActionListener(this);
        b8.setFont(new Font("System",Font.BOLD,14));
        image.add(b8);
         b5=new JButton("10000");
        b5.setBounds(425,570,90,20);
        b5.setForeground(Color.black);
        b5.addActionListener(this);
        b5.setFont(new Font("System",Font.BOLD,14));
        image.add(b5);
        b6=new JButton("Back ");
        b6.setBounds(425,595,90,20);
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        b6.setFont(new Font("System",Font.BOLD,14));
        image.add(b6);
        setSize(900,900);
    setVisible(true);
    setLocation(300,0);
    }
  public void actionPerformed(ActionEvent ev){
if(ev.getSource()==b6){
setVisible(false);
new Transactions(pinNumber).setVisible(true);
}else{
String amount=((JButton)ev.getSource()).getText();//500 
Conn c=new Conn();
String sql="SELECT * FROM `deposited` WHERE Pin='"+pinNumber+"'";
try{
ResultSet rs=c.st.executeQuery(sql);
int balance=0;
while(rs.next()){
 if(rs.getString("Type").equals("deposit")){
 balance+=Integer.parseInt(rs.getString("Amount"));
 }else{
 balance-=Integer.parseInt(rs.getString("Amount"));
 
 }
}


if(ev.getSource()!=b6 && balance<Integer.parseInt(amount)){
JOptionPane.showMessageDialog(null, "insuffecient balance");
return;
}
Date date=new Date();
String query="INSERT INTO `deposited` VALUES('"+pinNumber+"','"+date+"','withdrawl','"+amount+"')";
c.st.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Rs"+amount+" "+"is debited successfully");
setVisible(false);
new Transactions(pinNumber).setVisible(true);
}
catch(Exception e){

JOptionPane.showMessageDialog(null,e);
}

}}

public static void main (String[] args){
new FastCash("");

}
}
