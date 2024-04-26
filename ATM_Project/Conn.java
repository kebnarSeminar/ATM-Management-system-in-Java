package bankmanagement.system;

import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;



public class Conn {
 Statement st;
  Connection con;
   public Conn(){
  try{
  Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank management system","root","");
   st=con.createStatement();
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
  }
  
  } 
  
  
  public static void main (String[] args){
  new Conn();//calling the connection method conn
  
  
  
  
  }
}
