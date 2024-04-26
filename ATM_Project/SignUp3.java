
package bankmanagement.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignUp3 extends JFrame implements ActionListener {
   JRadioButton r1;
    JRadioButton r2;
     JRadioButton r3;
      JRadioButton r4;
     JCheckBox c1;
      JCheckBox c2;
       JCheckBox c3;
        JCheckBox c4;
          JCheckBox c5;
            JCheckBox c6;
              JCheckBox c7; 
                      JButton submit;
                       JButton cancel;
  JLabel l1;
    JLabel l2;
     JLabel l3;
      JLabel l4;
       JLabel l5;
        JLabel l6;
         JLabel l7;
      
    ButtonGroup group;
    long rand;
    String pinNumber;
  public SignUp3(String pinNumber){
     this.pinNumber=pinNumber;
setTitle("DETAILS ON ACCOUNT");
setLayout(null);
Random ran=new Random();
   rand=(Math.abs((ran.nextLong()%9000L)+1000L));
l1=new JLabel("page3:account Details");
l1.setFont(new Font("Raleway",Font.BOLD,30));
l1.setBounds(250,40,400,40);
add(l1);

l2=new JLabel("Account Type");
l2.setFont(new Font("Raleway",Font.BOLD,22));
l2.setBounds(100,100,400,40);
add(l2);
r4=new JRadioButton("Recurring Deposit Account");
r4.setFont(new Font("Raleway",Font.PLAIN,16));
r4.setBounds(300, 140, 600, 30);
add(r4);
r1=new JRadioButton("Saving Account");
r1.setFont(new Font("Raleway",Font.PLAIN,16));
r1.setBounds(100, 140, 200, 30);
add(r1);
r2=new JRadioButton("Current Account");
r2.setFont(new Font("Raleway",Font.PLAIN,16));
r2.setBounds(100, 170, 200, 30);
add(r2);
r3=new JRadioButton("Fixed Deposit Account");
r3.setFont(new Font("Raleway",Font.PLAIN,16));
r3.setBounds(300, 170, 600, 30);
add(r3);
 group=new ButtonGroup();
 group.add(r1);
 group.add(r2);
 group.add(r3);
 group.add(r4);

 
 l1=new JLabel("Card Number");
 l1.setBounds(100,220,400,30);
 add(l1);
 
  l2=new JLabel("XXXX-XXXX-XXXX-4184");
 l2.setBounds(300,225,400,30);
 add(l2);
 
 l3=new JLabel("your 16 digits card number");
 l3.setBounds(100,230,400,30);
 add(l3);
 

 l4=new JLabel("Pin Number");
 l4.setBounds(100,250,400,30);
 add(l4);
 
 l5=new JLabel("XXXX");
 l5.setBounds(300,255,400,30);
 add(l5);
 l6=new JLabel("your 4 digit pin number");
 l6.setBounds(100,260,400,30);
 add(l6);
 
 l7=new JLabel("Services Required:");
 l7.setBounds(100,300,400,30);
 add(l7);
 
c1=new JCheckBox("ATM CARD");
c1.setBounds(100, 330, 200, 30);
add(c1);
 c2=new JCheckBox("Mobile Banking");
c2.setBounds(100, 360, 200, 30);
add(c2);
 c3=new JCheckBox("Cheque Book");
c3.setBounds(100, 390, 200, 30);
add(c3);
 
 c4=new JCheckBox("Internet Banking");
c4.setBounds(300, 330, 600, 30);
add(c4);
 c5=new JCheckBox("Email and SMS alert");
c5.setBounds(300, 360, 600, 30);
add(c5);
c6=new JCheckBox("E-Statement");
c6.setBounds(300, 390, 600, 30);
add(c6);

c7=new JCheckBox("I here by declares that above details are correct to the besy of my knowledge");
c7.setBounds(100, 470, 600, 30);
add(c7);

submit=new JButton("Submit");
submit.setBounds(450,550,100,30);
submit.addActionListener(this);
add(submit);

cancel=new JButton("Cancel");
cancel.setBounds(600,550,100,30);
cancel.addActionListener(this);
add(cancel);



setSize(850,800);
  setVisible(true);
  setLocation(350,200);}
  public void actionPerformed(ActionEvent ev){
  if(ev.getSource()==submit){
      
      
     String formno=""+rand;
      
      String accountType=null;
  if(r1.isSelected()){
      accountType="saving account";
  }
  else if(r2.isSelected()){
  accountType="Current account";
  }
  else if(r3.isSelected()){
  accountType="Fixed Deposit account";
  }
 
  else if(r4.isSelected()){
  accountType="recurring deposit account";
  } 
  
  
   Random random=new Random();
                   String cardNumber=""+Math.abs((random.nextLong()%9000000L))+504093600L;
                   String pinNumber=""+Math.abs((random.nextLong()%9000)+1000);
String facility= null;
if(c1.isSelected()){
facility="ATM CARD";
}
else if(c2.isSelected()){
facility="mobile banking";
}
else if(c3.isSelected()){
facility="Cheque Book";
}
else if(c4.isSelected()){
facility="Internet banking";
}
else if(c5.isSelected()){
facility="Email and SMS";
}
else if(c6.isSelected()){
facility="E-Statementt";
}
  try{
      if(accountType.equals("")){
      JOptionPane.showMessageDialog(null, "account type is required");
      }else{if(c7.isSelected()){
          submit.setEnabled(true);
          Conn connector=new Conn();
      String sql="INSERT INTO `accountdetails`(`formno`, `accountType`, `cardNumber`, `pinNumber`, `facility`) VALUES ('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
      String query="INSERT INTO `login`(`CardNo`, `PinNo`) VALUES ('"+cardNumber+"','"+pinNumber+"')";
      connector.st.executeUpdate(sql);
      connector.st.executeUpdate(query);
      JOptionPane.showMessageDialog(null, "inserted successfully"+"Card Number:"+cardNumber+"pinNumber:"+pinNumber);
      setVisible(false);
      new Deposit(pinNumber).setVisible(true);}
      
      
      }
  }
 
  catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
  
  }
  
  
  
  }
  else if(ev.getSource()==cancel){} 
  setVisible(false);
  new Login(pinNumber).setVisible(true);
  }

public static void main(String[] args){
new SignUp3("");

}}

