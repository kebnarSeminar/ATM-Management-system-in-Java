
package bankmanagement.system;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Transactions  extends JFrame implements ActionListener {
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
     String pinNumber;
   public Transactions( String pinNumber){
    this.pinNumber=pinNumber;
        setTitle("this is transaction page");
        setLayout(null);
       im1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jfif"));
       i1=im1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        im2=new ImageIcon(i1);
        image=new JLabel(im2);
        image.setBounds(0,0,900,900);
        add(image);
        l1=new JLabel("please select your tansaction");
        l1.setBounds(300,265,700,35);
        l1.setForeground(Color.black);
        l1.setFont(new Font("System",Font.BOLD,16));
        image.add(l1);
        
        b1=new JButton("Deposit");
        b1.setBounds(270,510,100,20);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("System",Font.BOLD,10));
        image.add(b1);
        b2=new JButton("FastCash");
        b2.setBounds(265,540,105,20);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        b2.setFont(new Font("System",Font.BOLD,10));
        image.add(b2);
        b3=new JButton("PinChange");
        b3.setBounds(260,570,110,20);
        b3.addActionListener(this);
        b3.setForeground(Color.black);
        b3.setFont(new Font("System",Font.BOLD,10));
        image.add(b3);
        b4=new JButton("Withdrawl");
        b4.setBounds(405,512,110,20);
        b4.addActionListener(this);
        b4.setForeground(Color.black);
        b4.setFont(new Font("System",Font.BOLD,10));
        image.add(b4);
        b7=new JButton("MiniStatement");
        b7.setBounds(405,542,110,20);
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        b7.setFont(new Font("System",Font.BOLD,10));
        image.add(b7);
         b5=new JButton("BalanceEnquiry");
        b5.setBounds(405,570,110,20);
        b5.setForeground(Color.black);
        b5.addActionListener(this);
        b5.setFont(new Font("System",Font.BOLD,8));
        image.add(b5);
        b6=new JButton("Exit");
        b6.setBounds(430,595,80,20);
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        b6.setFont(new Font("System",Font.BOLD,20));
        image.add(b6);
        setSize(900,900);
    setVisible(true);
    setLocation(300,0);
    }
  public void actionPerformed(ActionEvent ev){
      Random random=new Random();
    String cardNumber=""+Math.abs((random.nextLong()%90000000L))+5040936000000000L;
   
if(ev.getSource()==b6){
System.exit(0);
}
else if(ev.getSource()==b7){
 setVisible(false);
 new MiniStatement(pinNumber).setVisible(true);
    
}
else if(ev.getSource()==b1){
//setVisible(false);
new Deposit(pinNumber).setVisible(true);
}
else if(ev.getSource()==b4){
setVisible(false);
new Withdrawl(pinNumber).setVisible(true);
}
else if(ev.getSource()==b2){
setVisible(false);
new FastCash(pinNumber).setVisible(true);
}
else if(ev.getSource()==b3)
{
    setVisible(false);
    new PinChange(pinNumber).setVisible(true);
    
}
else if(ev.getSource()==b5){
setVisible(false);
new BalanceEnquiry(pinNumber).setVisible(true);
}

  }

public static void main (String[] args){
new Transactions("");

}
}
