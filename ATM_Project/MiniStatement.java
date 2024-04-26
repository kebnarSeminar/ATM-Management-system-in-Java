
package bankmanagement.system;

import java.sql.*;

import javax.swing.*;


public class MiniStatement extends JFrame {
    String pinNumber;
    
public MiniStatement(String pinNumber){
this.pinNumber=pinNumber;
setLayout(null);
JLabel l1=new JLabel("ETHIOPIAN BANK");
l1.setBounds(150,60,400,30);
add(l1);
JLabel l2=new JLabel();
l2.setBounds(150, 150, 400, 40);
add(l2);
JLabel l3=new JLabel();
l3.setBounds(150, 200, 400, 40);
add(l3);

try{
Conn co=new Conn();
String query="SELECT * FROM `deposited` WHERE Pin='"+pinNumber+"'";
ResultSet r=co.st.executeQuery(query);
while(r.next()){
l3.setText(l3.getText()+"<html>"+r.getString("Date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+r.getString("Type"));
}

}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}



try{  
Conn con=new Conn();
String sql="SELECT * FROM `login` WHERE PinNo='"+pinNumber+"'";
ResultSet rs=con.st.executeQuery(sql);
while(rs.next()){
l2.setText("Card Number:"+rs.getString("CardNo").substring(0,4)+"XXXXXXXX"+rs.getString("CardNo").substring(12,16));

}



}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}




setSize(600,600);
setVisible(true);
setLocation(300,250);

}



public static void main(String[] args){
new MiniStatement("");

}
}
