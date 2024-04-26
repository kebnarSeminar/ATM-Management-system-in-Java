//Signup//


package bankmanagement.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.regex.*;
import  java.util.Timer;
import  java.util.TimerTask;

class Task2 extends TimerTask{
public void run(){
new  SignUp2("");

}



}

public class SignUp extends JFrame implements ActionListener{
 JButton next;
  JRadioButton male;
   JRadioButton female;
   JRadioButton married;
   JRadioButton unmarried;
   JRadioButton other;
  
   ButtonGroup group;
   ButtonGroup gr;
 long random;
 JDateChooser date;
 JTextField fnam;
 JTextField nam;
 JTextField addr;
 JTextField cit;
 JTextField em;
 JTextField pinc;
 JTextField stat;
  JLabel formno;
  JLabel personalDetails;
   JLabel  name;
    JLabel fname;
     JLabel db;
      JLabel gender;
       JLabel marital;
        JLabel address;
        JLabel city;
        JLabel email;
        JLabel pncode;
         JLabel state;
         JLabel jl;
         String pinNumber;
   public SignUp(String pinNumber){
       this.pinNumber=pinNumber;
        setLayout(null);
        setTitle("Application Form");
    Random ran=new Random();
   random=(Math.abs((ran.nextLong()%9000L)+1000L));
     formno=new JLabel("APPLICATION FORM NO:"+random);
    formno.setFont(new Font("Raleway",Font.BOLD,33));
    formno.setBounds(140,20,600,40);
    add(formno);
    
      personalDetails=new JLabel("page1:Personal Details");
    personalDetails.setFont(new Font("osward",Font.BOLD,22));
    personalDetails.setBounds(250,80,600,40);
    add(personalDetails);
    
    
    name=new JLabel("first name:");
    name.setFont(new Font("osward",Font.BOLD,20));
    name.setBounds(229,150,600,40);
    add(name);
     nam= new JTextField();
    nam.setFont(new Font("osward",Font.BOLD,20));
    nam.setBounds(330,155,200,20);
    add(nam);
    fname=new JLabel("fathers name:");
    fname.setFont(new Font("osward",Font.BOLD,20));
    fname.setBounds(200,175,600,40);
    add(fname);
    fnam= new JTextField();
    fnam.setFont(new Font("osward",Font.BOLD,20));
    fnam.setBounds(330,185,200,20);
    add(fnam);
   db=new JLabel("DateOfBirth:");
    db.setFont(new Font("osward",Font.BOLD,18));
    db.setBounds(220,200,600,40);
    add(db);
   date=new JDateChooser();
   date.setBounds(330,210,200,20);
   add(date);
 
     gender=new JLabel("Gender:");
    gender.setFont(new Font("osward",Font.BOLD,18));
    gender.setBounds(260,225,600,40);
    add(gender);
     male=new JRadioButton("Male");
    male.setBounds(350,235,60,20);
     
    add(male);
    female=new JRadioButton("Female");
    female.setBounds(450,235,70,20);
   
    add(female);
     group=new ButtonGroup();
    group.add(male);
    group.add(female);
    
    
     
    marital=new JLabel("Marital Status:");
    marital.setFont(new Font("osward",Font.BOLD,18));
    marital.setBounds(205,250,600,40);
    add(marital);
     married=new JRadioButton("Married");
    married.setBounds(350,260,80,30);
    
    add(married);
     unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(450,260,90,30);
    
    add(unmarried);
     other=new JRadioButton("other");
    other.setBounds(550,260,70,30);
     
    add(other);
    gr= new ButtonGroup();
    gr.add(married);
    gr.add(unmarried);
    gr.add(other);
    
     next=new JButton("Next");
    next.setBounds(650,400,80,30);
    next.setFont(new Font("osward",Font.BOLD,18));
    next.addActionListener(this);
    add(next);
    
     address=new JLabel("Address:");
    address.setFont(new Font("osward",Font.BOLD,18));
    address.setBounds(250,275,600,40);
    add(address);
    addr= new JTextField();
    addr.setFont(new Font("osward",Font.BOLD,20));
    addr.setBounds(330,290,200,20);
    add(addr);
    
   city=new JLabel("City:");
    city.setFont(new Font("osward",Font.BOLD,18));
    city.setBounds(290,300,600,40);
    add(city);
    
     cit= new JTextField();
    cit.setFont(new Font("osward",Font.BOLD,20));
    cit.setBounds(330,315,200,20);
    add(cit);
    
     state=new JLabel("State:");
    state.setFont(new Font("osward",Font.BOLD,18));
    state.setBounds(280,325,600,40);
    add(state);
    
   stat= new JTextField();
    stat.setFont(new Font("osward",Font.BOLD,20));
    stat.setBounds(330,340,200,20);
    add(stat);
     pncode=new JLabel("Pin Code:");
    pncode.setFont(new Font("osward",Font.BOLD,18));
    pncode.setBounds(248,350,600,40);
    add(pncode);
      pinc= new JTextField();
    pinc.setFont(new Font("osward",Font.BOLD,20));
    pinc.setBounds(332,360,200,20);
    add(pinc);
    email=new JLabel("Email:");
    email.setFont(new Font("osward",Font.BOLD,18));
    email.setBounds(270,370,600,40);
    add(email);
     em= new JTextField();
    em.setFont(new Font("osward",Font.BOLD,20));
    em.setBounds(330,385,200,20);
    add(em);
   
     jl=new JLabel("");
     jl.setFont(new Font("osward",Font.BOLD,20));
    jl.setBounds(250,140,600,40);
    add(jl);
   
   
 getContentPane().setBackground(Color.white);
       
    setSize(850,480);
    setVisible(true);
    setLocation(350,200);}
    
    
    public void actionPerformed(ActionEvent ac){
        
    String formno=""+random;
    String name=nam.getText();
    String fathername=fnam.getText();
    String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
    String gend =null;
    if(male.isSelected()){
    gend="male";
    }
    else if(female.isSelected()){
    gend="female";
    }
   String email=em.getText();
   String marital=null;
   if(married.isSelected()){
   marital="married";
   }
   else if(unmarried.isSelected()){
    marital="unmarried";}
   else if(other.isSelected()){
   marital="other";
   }
   String address =addr.getText();
   String city=cit.getText();
   String state= stat.getText();
   String pin=pinc.getText();
   try{
   if(name.equals("")){
   JOptionPane.showMessageDialog(null,"name is required");}
   else if(fathername.equals("")){
   JOptionPane.showMessageDialog(null,"father name is required");}
    else if(dob.equals("")){
   JOptionPane.showMessageDialog(null,"Date is required");}
    else if(gend.equals("")){
   JOptionPane.showMessageDialog(null,"gender is required");}
    else if(marital.equals("")){
   JOptionPane.showMessageDialog(null,"marital is required");}
    else if(address.equals("")){
   JOptionPane.showMessageDialog(null,"Address is required");}
    else if(city.equals("")){
   JOptionPane.showMessageDialog(null,"city is required");}
    else if(state.equals("")){
   JOptionPane.showMessageDialog(null,"state is required");}
    else if(pin.equals("")){
   JOptionPane.showMessageDialog(null,"pin code is required");}
    else if(email.equals("")){
   JOptionPane.showMessageDialog(null,"email code is required");}
    else{
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{1,50}[@]{1}[a-zA-Z]{3,10}.[a-z]{2,3}$");
       Matcher m=p.matcher(em.getText());
       if(m.matches()){   
    Conn connect=new Conn();
    String sql="INSERT INTO `bank`(`formno`, `name`, `fname`, `dateofbirth`, `gender`, `maritalstatus`, `address`, `city`, `state`, `pincode`, `email`) VALUES ('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gend+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"','"+email+"')";
    
    
    connect.st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"insertion successful");
    int a = JOptionPane.showConfirmDialog(null,"do you wann go signup2 page?","select",JOptionPane.YES_NO_OPTION);
    if(a==0){
  setVisible(false);
    new SignUp2(pinNumber).setVisible(true);
    }
 else{
new Login(pinNumber).setVisible(true);
}
   
    }
       else{
       JOptionPane.showMessageDialog(null,"invalid email address:\nplease use eg @gmail.com");}
    }
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(null,e);
   }
   
   
}
public static void main(String[] args){
new SignUp("");
Timer timer=new Timer();
TimerTask signup2=new Task2();


}}