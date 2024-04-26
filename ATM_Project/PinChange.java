
package bankmanagement.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener {
  JButton b1;
   JButton b2;
    JLabel l1;
     JLabel l2;
      JLabel l3;
       JPasswordField t1;
        JPasswordField t2;
    String pinNumber;
    public PinChange(String pinNumber){
        this.pinNumber=pinNumber;
  ImageIcon  im1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jfif"));
      Image i1=im1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon im2=new ImageIcon(i1);
       JLabel image=new JLabel(im2);
        image.setBounds(0,0,900,900);
        add(image);
    l1=new JLabel("Change Your Pin");
    l1.setBounds(300,255,700,35);
        l1.setForeground(Color.black);
        l1.setFont(new Font("System",Font.BOLD,16));
        image.add(l1);
        t1=new JPasswordField();
        t1.setBounds(380,460,100,20);
        t1.setForeground(Color.black);
        t1.setFont(new Font("System",Font.BOLD,16));
        image.add(t1);
        
        l2=new JLabel("New Pin:");
        l2.setBounds(310,460,700,20);
        l2.setForeground(Color.black);
        l2.setFont(new Font("System",Font.BOLD,16));
        image.add(l2);
        l3=new JLabel("Re-New Pin:");
        l3.setBounds(285,490,700,20);
        l3.setForeground(Color.black);
        l3.setFont(new Font("System",Font.BOLD,16));
        image.add(l3);
        t2=new JPasswordField();
        t2.setBounds(380,490,100,20);
        t2.setForeground(Color.black);
        t2.setFont(new Font("System",Font.BOLD,16));
        image.add(t2);
        b1=new JButton("Change");
        b1.setBounds(300,550,95,25);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setFont(new Font("System",Font.BOLD,16));
        image.add(b1);
        b2=new JButton("Back");
        b2.setBounds(410,550,95,25);
        b2.setForeground(Color.black);
       b2.addActionListener(this);
        b2.setFont(new Font("System",Font.BOLD,16));
        image.add(b2);
        
        
   setVisible(true);
   setSize(900,900);
   setLocation(300,0);
    }
     public void actionPerformed(ActionEvent ev){
       if(ev.getSource()==b1){
          try{
    String npin=t1.getText();
    String rpin=t2.getText();
    if(!npin.equals(rpin)){
    JOptionPane.showMessageDialog(null, "Entered pin does not match");
    return;
    }
    if(npin.equals("")){
    JOptionPane.showMessageDialog(null,"please enter pin ");
    return;
    }
    if(rpin.equals("")){
    JOptionPane.showMessageDialog(null,"please enter pin ");
    return;
    }
    Conn con=new Conn();
    String sql="UPDATE `login` SET PinNo='"+rpin+"'where PinNo='"+pinNumber+"'";
    con.st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"your pin changed successfully");
    setVisible(false);
       new Transactions(rpin).setVisible(true);
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }}
       else{
       setVisible(false);
       new Transactions(pinNumber).setVisible(true);
       }
    
    }
    public static void main(String[] args){
    new PinChange("");
    }
}
