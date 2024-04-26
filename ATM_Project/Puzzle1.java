
package bankmanagement.system;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Puzzle1 extends JFrame implements ActionListener {
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
 
 Puzzle1(){
     setLayout(null);
 JLabel l1=new JLabel("LEVEL 1:");
    l1.setForeground(Color.red);
    l1.setBackground(Color.green);
    l1.setBounds(100, 50,100,40);
    add(l1);
    b1=new Button("10");  
    b1.setBounds(50,100,40,40);  
    b2=new Button("11");  
    b2.setBounds(100,100,40,40);  
    b3=new Button("12");  
    b3.setBounds(150,100,40,40);  
    b4=new Button("13");  
    b4.setBounds(50,150,40,40);  
    b5=new Button("14");  
    b5.setBounds(100,150,40,40);  
    b6=new Button("15");  
    b6.setBounds(150,150,40,40);  
    b7=new Button("16");  
    b7.setBounds(50,200,40,40);  
    b8=new Button("");  
    b8.setBounds(100,200,40,40);  
    b9=new Button("17");  
    b9.setBounds(150,200,40,40); 
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);  
      
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); 
 
 setSize(300,300);
 setLocation(320,200);
 setVisible(true);
 
 
 }
 
 public void ActionPerformed(ActionEvent ev){
 
 }
 
 
 public static void main(String [] arsg){
 new Puzzle1();
 
 
 }

    @Override
    public void actionPerformed(ActionEvent ev) {
     if(ev.getSource()==b1){
  String label1=b1.getLabel();
  if(b2.getLabel().equals("")){
        b2.setLabel(label1);
        b1.setLabel("");
  }
  if(b4.getLabel().equals("")){
  b4.setLabel(label1);
  b1.setLabel("");
  }
  
  }
  if(ev.getSource()==b2){
  String label1=b2.getLabel();
  if(b1.getLabel().equals("")){
  b1.setLabel(label1);
  b2.setLabel("");
  }
  if(b5.getLabel().equals("")){
  b5.setLabel(label1);
  b2.setLabel("");
  }
  if(b3.getLabel().equals("")){
  b3.setLabel(label1);
  b2.setLabel("");
  
  }
  }
  if(ev.getSource()==b3){
  String label=b3.getLabel();
  if(b2.getLabel().equals("")){
  b2.setLabel(label);
  b3.setLabel("");
  }
  if(b6.getLabel().equals("")){
  b6.setLabel(label);
  b3.setLabel("");
  }
  
  }
  if(ev.getSource()==b4){
  String label=b4.getLabel();
  if(b1.getLabel().equals("")){
  b1.setLabel(label);
  b4.setLabel("");
  }
  if(b7.getLabel().equals("")){
  b7.setLabel(label);
  b4.setLabel("");
  }
  if(b5.getLabel().equals("")){
  b5.setLabel(label);
  b4.setLabel("");
  }
  }
  if(ev.getSource()==b5){
String label=b5.getLabel();
if(b4.getLabel().equals("")){
b4.setLabel(label);
b5.setLabel("");
}
 if(b2.getLabel().equals("")){
 b2.setLabel(label);
 b5.setLabel("");
 } 
 if(b6.getLabel().equals("")){
 b6.setLabel(label);
b5.setLabel("");
 }
 if(b8.getLabel().equals("")){
 b8.setLabel(label);
 b5.setLabel("");
 }
  }
  if(ev.getSource()==b6){
  String label=b6.getLabel();
  if(b3.getLabel().equals("")){
  b3.setLabel(label);
  b6.setLabel("");
  }
  if(b9.getLabel().equals("")){
  b9.setLabel(label);
  b6.setLabel("");
  }
  }
  if(ev.getSource()==b7){
  String label=b7.getLabel();
  if(b4.getLabel().equals("")){
  b4.setLabel(label);
  b7.setLabel("");
  }
  if(b8.getLabel().equals("")){
  b8.setLabel(label);
  b7.setLabel("");
  }
  }
  if(ev.getSource()==b8){
  String label=b8.getLabel();
  if(b7.getLabel().equals("")){
  b7.setLabel(label);
  b8.setLabel("");  
  }
  if(b9.getLabel().equals("")){
  b9.setLabel(label);
  b8.setLabel("");  
  
  }}
  if(ev.getSource()==b9){
  String label=b9.getLabel();
  if(b8.getLabel().equals("")){
  b8.setLabel(label);
  b9.setLabel("");  
  }
  if(b6.getLabel().equals("")){
  b6.setLabel(label);
  b9.setLabel("");  
  }
  
  }
  if(b1.getLabel().equals("10")&&b2.getLabel().equals("11")&&b3.getLabel()    
            .equals("12")&&b4.getLabel().equals("13")&&b5.getLabel().equals("14")    
            &&b6.getLabel().equals("15")&&b7.getLabel().equals("16")&&b8.getLabel()    
            .equals("17")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");    
    }    
 
    }
}
