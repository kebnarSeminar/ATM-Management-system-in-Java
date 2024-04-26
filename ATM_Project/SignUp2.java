package bankmanagement.system;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.util.regex.*;

public class SignUp2 extends JFrame implements ActionListener{
  JRadioButton yes;
   JRadioButton no;
   JRadioButton non;
   JRadioButton ye;
  JComboBox rel;
  JComboBox educ;
   JComboBox categ;
   JComboBox occupa;
   JComboBox inca;
   ButtonGroup group;
   ButtonGroup groupp;
   JButton save;
   JButton clear;
 

 JTextField hadh;
 JTextField panc;
 
  JLabel personalDetails;
   JLabel  religion;
    JLabel category;
     JLabel inc;
      JLabel senior; 
        JLabel edu;
        JLabel qual;
        JLabel hadhar;
        JLabel pan;
         JLabel occup;
         JLabel jl;
         JLabel existingac;
         String pinNumber;
    SignUp2( String pinNumber){
        this.pinNumber=pinNumber;
        setLayout(null);
        setTitle("New Application Form:Page 2");
   
    
      personalDetails=new JLabel("page2:Personal Details");
    personalDetails.setFont(new Font("osward",Font.BOLD,22));
    personalDetails.setBounds(250,80,400,40);
    add(personalDetails);
    
    
    religion=new JLabel("Religion:");
    religion.setFont(new Font("osward",Font.BOLD,20));
    religion.setBounds(325,130,600,40);
    add(religion);
    String varRel[]={"hindiuzm","shintoizm","protestant","orthodox","musilm","other"};
     rel=new JComboBox(varRel);
    rel.setBounds(420,140,100,20);
    add(rel);
     
     
     category=new JLabel("Category:");
    category.setFont(new Font("osward",Font.BOLD,20));
    category.setBounds(320,160,600,40);
    add(category);
    String cate[]={"general","obc","ec","other"};
     categ=new JComboBox(cate);
    categ.setBounds(420,170,100,20);
    add(categ);
    
   inc=new JLabel("Income:");
    inc.setFont(new Font("osward",Font.BOLD,18));
    inc.setBounds(342,190,600,40);
    add(inc);
    String incom[]={"Null","<150000","<250000","<500000","<1000000","Upto 10,000000"};
    inca=new JComboBox(incom);
    inca.setBounds(420, 200, 100, 20);
    add(inca);
  
    
     edu=new JLabel("Educational");
    edu.setFont(new Font("osward",Font.BOLD,18));
    edu.setBounds(300,215,600,40);
    add(edu);
   qual=new JLabel("Qualification:");
    qual.setFont(new Font("osward",Font.BOLD,18));
    qual.setBounds(300,230,600,40);
    add(qual);
   String educate[]={"non graduate","graduate","postgraduate","doctrate","other"};
   educ=new JComboBox(educate);
    educ.setBounds(420,240,100,20);
    add(educ);
    
     occup=new JLabel("Occupation:");
    occup.setFont(new Font("osward",Font.BOLD,18));
    occup.setBounds(310,260,600,40);
    add(occup);
   
    String occ[]={"salaried","self employed","bussinessman","student","retired","other"};
    occupa=new JComboBox(occ);
    occupa.setBounds(420,270,100,20);
    add(occupa);
  
     pan=new JLabel("PAN Number:");
    pan.setFont(new Font("osward",Font.BOLD,18));
    pan.setBounds(300,290,600,40);
    add(pan);
      panc= new JTextField();
    panc.setFont(new Font("osward",Font.BOLD,20));
    panc.setBounds(430,300,150,20);
    add(panc);
    hadhar=new JLabel("Hadhar Number:");
    hadhar.setFont(new Font("osward",Font.BOLD,18));
    hadhar.setBounds(280,330,600,40);
    add(hadhar);
     hadh= new JTextField();
    hadh.setFont(new Font("osward",Font.BOLD,20));
    hadh.setBounds(430,340,150,20);
    add(hadh);
   
     senior=new JLabel("Senior Citizen:");
    senior.setFont(new Font("osward",Font.BOLD,18));
    senior.setBounds(300,360,600,40);
    add(senior);
     yes=new JRadioButton("YES");
    yes.setBounds(450,370,70,20);
     
    add(yes);
    no=new JRadioButton("NO");
    no.setBounds(550,370,60,20);
   
    add(no);
     group=new ButtonGroup();
    group.add(yes);
    group.add(no);
    
    existingac=new JLabel("Existing Account:");
    existingac.setFont(new Font("osward",Font.BOLD,18));
    existingac.setBounds(275,390,600,40);
    add(existingac);
     ye=new JRadioButton("YES");
    ye.setBounds(450,400,60,20);
     
    add(ye);
    non=new JRadioButton("NO");
    non.setBounds(550,400,70,20);
   
    add(non);
     groupp=new ButtonGroup();
    groupp.add(ye);
    groupp.add(non);
    
    save=new JButton("Save");
    save.setBounds(550, 450, 70, 30);
    save.addActionListener(this);
    add(save);
     clear=new JButton("Clear");
    clear.setBounds(650, 450, 70, 30);
    clear.addActionListener(this);
    add(clear);
    
     jl=new JLabel("");
     jl.setFont(new Font("osward",Font.BOLD,20));
    jl.setBounds(250,140,600,40);
    add(jl);
   
   
 getContentPane().setBackground(Color.white);
       
    setSize(850,600);
    setVisible(true);
    setLocation(350,200);}
    
    
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource()==clear){
        panc.setText("");
        hadh.setText("");}
        else if(ac.getSource()==save){
            Random random=new Random();
                   String cardNumber=""+Math.abs((random.nextLong()%90000000L))+5040936000000000L;
                   
    String relgn=(String)rel.getSelectedItem();
     String catgry=(String) categ.getSelectedItem();
     String incm=(String)inca.getSelectedItem();
      String eductn=(String)educ.getSelectedItem();
      String occuptn=(String)occupa.getSelectedItem();
      String pannumbr=panc.getText();
     String hadharnumbr=hadh.getText();
     String senior=null;
     if(yes.isSelected())
     {senior="yes";
     }else if(no.isSelected()){
     senior="no";
     }
     String existingaccnt=null;
             if(ye.isSelected()){
            existingaccnt="yes"; }
             else if(non.isSelected()){
             existingaccnt="no";
             }
             try{
  Conn connec=new Conn();
    String sql="INSERT INTO `signup2`(`religion`, `category`, `income`, `eduqualification`, `occupation`, `panNumber`, `hadharNumber`, `seniorCitizens`, `existingaccount`) VALUES ('"+relgn+"','"+catgry+"','"+incm+"','"+eductn+"','"+occuptn+"','"+pannumbr+"','"+hadharnumbr+"','"+senior+"','"+existingaccnt+"')";
    String query="INSERT INTO `login`(`CardNo`, `PinNo`) VALUES ('"+cardNumber+"','"+pinNumber+"')";
    
    connec.st.executeUpdate(sql);
    connec.st.executeUpdate(query);
    JOptionPane.showMessageDialog(null,"insertion successful");
    setVisible(false);
    new SignUp3(pinNumber).setVisible(true);
        
}
    catch(Exception e){
JOptionPane.showMessageDialog(null, e);}}}
    
   
public static void main(String[] args){
new SignUp2("");



}}