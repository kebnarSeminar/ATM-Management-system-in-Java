
package bankmanagement.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;


public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
     
    String pinNumber;
    JLabel l1;
    JLabel l2;
    Image i1;
     ImageIcon  im1;
      JLabel image;
      ImageIcon im2;
       
   public BalanceEnquiry(String pinNumber){
   this.pinNumber=pinNumber;
         im1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jfif"));
         i1=im1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
         im2=new ImageIcon(i1);
         image=new JLabel(im2);
        image.setBounds(0,0,900,900);
        add(image);
   
    back=new JButton("Back");
   back.setBounds(410,550,95,25);
        back.setForeground(Color.black);
       back.addActionListener(this);
        back.setFont(new Font("System",Font.BOLD,16));
        image.add(back);
        
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
l1=new JLabel("Your current account");
l1.setBounds(300,460,200,15);
l1.setForeground(Color.black);
l1.setFont(new Font("System",Font.BOLD,16));
image.add(l1);
l2=new JLabel("balance is:"+balance);
l2.setBounds(310,480,200,15);
l2.setForeground(Color.black);
l2.setFont(new Font("System",Font.BOLD,16));
image.add(l2);
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}

      
        setVisible(true);
   setSize(900,900);
   setLocation(300,0);
   }
   
   
   
   public void actionPerformed(ActionEvent ev){
  
       if(ev.getSource()==back){
       setVisible(false);
  new Transactions(pinNumber).setVisible(true);}
      
   
   }
   
   
public static void main(String []args){
new BalanceEnquiry("");

}
}
