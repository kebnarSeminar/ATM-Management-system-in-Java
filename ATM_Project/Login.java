// CODE FOR LOGIN// 
package bankmanagement.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.*;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;


/*class Task1 extends TimerTask{
public void run(){
new SignUp("");
new SignUp2("");
new Deposit("");
new FastCash("");
new BalanceEnquiry("");
new MiniStatement("");
new PinChange("");
new Transactions("");
new Withdrawl("");
}

}
*/

 
public class Login extends JFrame implements ActionListener,Runnable{//ActionListener is an interface
    JButton clear,up,login;
    JTextField cardText;
    JPasswordField pinText;
  String pinNumber;
  ImageIcon im1;
  Image i1;
   ImageIcon i3;
   JLabel label;
    JLabel l1;
     JLabel l2;
     JLabel l3;
    SimpleDateFormat sdf;
    String time;
    
public Login(String pinNumber){
    this.pinNumber=pinNumber;
    setTitle("AUTOMATED TELLER MACHINE");
    setLayout(new FlowLayout());
    l2=new JLabel("");
    l2.setBackground(Color.white);
    l2.setForeground(Color.red);
    l2.setBounds(250, 80, 400, 40);
    l2.setFont(new Font("system",Font.BOLD,40));
    add(l2);
    l3=new JLabel("");
    l3.setBackground(Color.white);
    l3.setForeground(Color.red);
    l3.setBounds(200, 120, 600, 40);
    l3.setFont(new Font("system",Font.BOLD,30));
    add(l3);
   
 
   im1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    i1=im1.getImage().getScaledInstance(800, 480,Image.SCALE_DEFAULT);
     i3=new ImageIcon(i1);
    label=new JLabel(i3);
    label.setBounds(0,0,800,480);
   add(label);
   ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("icons/jems.jpg"));
    Image im=ic.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(im);
    l1=new JLabel(i3);
    l1.setBounds(70,10,100,100);
   label.add(l1);
   JLabel text= new JLabel("WELCOME TO MY ATM APP");
   text.setFont(new Font("Raleway",Font.BOLD,30));
   text.setBounds(200, 40, 400, 40);//(fromleft,fromtop,...,...)
   label.add(text);
   JLabel cNo=new JLabel("CARD NO:");
   cNo.setFont(new Font("osward",Font.BOLD,28));
   cNo.setForeground(Color.WHITE);
   cNo.setBounds(120,170,400,40);
   label.add(cNo);
   cardText=new JTextField("828745650409....");
   cardText.setBounds(260,180,250,30);
   cardText.setFont(new Font("osward",Font.BOLD,14));
   label.add(cardText);
   JLabel pin=new JLabel("PIN:");
   pin.setFont(new Font("osward",Font.BOLD,28));
    pin.setForeground(Color.WHITE);
   pin.setBounds(205,220,400,40);
   label.add(pin);
    pinText=new JPasswordField();
   pinText.setBounds(260,225,250,30);
   label.add(pinText);
  login=new JButton("SIGN IN");
  login.setBounds(260,270,80,30);
  login.setBackground(Color.BLACK);
  login.setForeground(Color.WHITE);
  login.addActionListener(this);
 login.setFont(new Font("osward",Font.BOLD,10));
  label.add(login);
   clear=new JButton("CLEAR");
  clear.setBounds(380,270,80,30);
  clear.setBackground(Color.BLACK);
  clear.setForeground(Color.WHITE);
  clear.addActionListener(this);
 clear.setFont(new Font("osward",Font.BOLD,10));
  label.add(clear);
   up=new JButton("SIGN UP");
 up.setBounds(280,320,150,30);
  up.setBackground(Color.BLACK);
  up.setForeground(Color.WHITE);
    up.addActionListener(this);
 up.setFont(new Font("osward",Font.BOLD,10));
  label.add(up);
   getContentPane().setBackground(Color.white);
setSize(800,480);
setVisible(true);
setLocation(350,200);

 Thread th=new Thread(){
    public void run(){
        while(true){
     sdf=new SimpleDateFormat("hh:mm:ss aa");
    time=sdf.format(Calendar.getInstance().getTime());
    l2.setText(time);
     java.util.Date date=new java.util.Date();
     l3.setText(date.toString());
       try{
       Thread.sleep(1000);
       } 
        catch(InterruptedException e){
        
        JOptionPane.showMessageDialog(null, e);
        }
        
        
        }
    }
    
    
    
    }; th.start();
}
public void actionPerformed(ActionEvent ac){
if(ac.getSource()==clear){//clear is not the button value just it is our button name
pinText.setText("");
cardText.setText("");
}
else if(ac.getSource()==login){//login isb= not the button value just it is our button name 
Conn connects=new Conn();
String cardNumber=cardText.getText();
String pinNumber=pinText.getText();
String sql="SELECT * FROM `login` WHERE CardNo='"+cardNumber+"'and PinNo='"+pinNumber+"'";

try{
ResultSet rs=connects.st.executeQuery(sql);
if(rs.next()){
setVisible(false);
new Transactions(pinNumber).setVisible(true);}
else{
        JOptionPane.showMessageDialog(null, "incorrect pin or cardNo");
        }

}
catch(Exception e){
JOptionPane.showMessageDialog(null, e);}
}
else if(ac.getSource()==up){//up isb= not the button value just it is our button name
    int a = JOptionPane.showConfirmDialog(null,"do you wann go signup page?","select",JOptionPane.YES_NO_OPTION);
    if(a==0){
 setVisible(false);
new SignUp(pinNumber).setVisible(true);
    }
 else{
 setVisible(true);
}
}

}
    public static void main(String[] args)throws InterruptedException {
      new Login("");
      /*Timer timer=new Timer();
      TimerTask login=new Task1();
      timer.schedule(login,3000);
      Date date=new Date(System.currentTimeMillis());
      //JOptionPane.showMessageDialog(null,"signup is gonna open"+"  "+date);
      //timer.schedule(login, 5000);
      Thread.sleep(4000);
      //JOptionPane.showMessageDialog(null,"signup2 is gonna open"+"  "+date);
      timer.cancel();
      //JOptionPane.showMessageDialog(null,"reached the end page"+"   "+date);*/
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
