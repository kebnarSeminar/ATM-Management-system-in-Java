
package bankmanagement.system;
import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
class picpuzzle2 extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;  
Icon star;  
ImageIcon ic0=new ImageIcon(ClassLoader.getSystemResource("icons/cat.jfif"));  
ImageIcon ic10=new ImageIcon(ClassLoader.getSystemResource("icons/cat1.jfif"));  
ImageIcon ic20=new ImageIcon(ClassLoader.getSystemResource("icons/cat2.jfif"));  
ImageIcon sampleicon1=new ImageIcon(ClassLoader.getSystemResource("icons/cat3.jfif"));  
ImageIcon sampleicon2=new ImageIcon(ClassLoader.getSystemResource("icons/cat4.jfif"));  
ImageIcon sampleicon3=new ImageIcon(ClassLoader.getSystemResource("icons/cat5.jfif"));  
ImageIcon ic1=new ImageIcon(ClassLoader.getSystemResource("icons/dog.jfif"));  
ImageIcon ic2=new ImageIcon(ClassLoader.getSystemResource("icons/dog1.jfif"));  
ImageIcon ic3=new ImageIcon(ClassLoader.getSystemResource("icons/dog2.jfif"));  
ImageIcon ic4=new ImageIcon(ClassLoader.getSystemResource("icons/dog3.jfif"));  
ImageIcon ic5=new ImageIcon(ClassLoader.getSystemResource("icons/dog4.jfif"));  
ImageIcon ic6=new ImageIcon(ClassLoader.getSystemResource("icons/dog5.jfif"));  
ImageIcon ic7=new ImageIcon(ClassLoader.getSystemResource("icons/dog6.jfif"));  
ImageIcon ic8=new ImageIcon(ClassLoader.getSystemResource("icons/dog7.jfif"));  
ImageIcon ic9=new ImageIcon(ClassLoader.getSystemResource("icons/dog8.jfif"));  
  
ImageIcon ic11=new ImageIcon(ClassLoader.getSystemResource("icons/rab.jfif"));  
ImageIcon ic12=new ImageIcon(ClassLoader.getSystemResource("icons/rab1.jfif"));  
ImageIcon ic13=new ImageIcon(ClassLoader.getSystemResource("icons/rab3.jfif"));  
ImageIcon ic14=new ImageIcon(ClassLoader.getSystemResource("icons/rab3.jfif"));  
ImageIcon ic15=new ImageIcon(ClassLoader.getSystemResource("icons/rab4.jfif"));  
ImageIcon ic16=new ImageIcon(ClassLoader.getSystemResource("icons/rab5.jfif"));  
ImageIcon ic17=new ImageIcon(ClassLoader.getSystemResource("icons/rab6.jfif"));  
ImageIcon ic18=new ImageIcon(ClassLoader.getSystemResource("icons/rab7.jfif"));  
ImageIcon ic19=new ImageIcon(ClassLoader.getSystemResource("icons/rab8.jfif"));  
  
ImageIcon ic21=new ImageIcon(ClassLoader.getSystemResource("icons/rab9.jfif"));  
ImageIcon ic22=new ImageIcon(ClassLoader.getSystemResource("icons/rab.jfif"));  
ImageIcon ic23=new ImageIcon(ClassLoader.getSystemResource("icons/rab1.jfif"));  
ImageIcon ic24=new ImageIcon(ClassLoader.getSystemResource("icons/rab3.jfif"));  
ImageIcon ic25=new ImageIcon(ClassLoader.getSystemResource("icons/rab3.jfif"));  
ImageIcon ic26=new ImageIcon(ClassLoader.getSystemResource("icons/rab4.jfif"));  
ImageIcon ic27=new ImageIcon(ClassLoader.getSystemResource("icons/rab5.jfif"));  
ImageIcon ic28=new ImageIcon(ClassLoader.getSystemResource("icons/rab6.jfif"));  
ImageIcon ic29=new ImageIcon(ClassLoader.getSystemResource("icons/rab7.jfif"));  
  
picpuzzle2(){  
  
super("pic puzzle");  
  setLayout(null);
b1=new JButton(ic1);  
b1.setBounds(10,80,100,100);  
b2=new JButton(ic2);  
b2.setBounds(110,80,100,100);  
b3=new JButton(ic3);  
b3.setBounds(210,80,100,100);  
b4=new JButton(ic4);  
b4.setBounds(10,180,100,100);  
b5=new JButton(ic5);  
b5.setBounds(110,180,100,100);  
b6=new JButton(ic6);  
b6.setBounds(210,180,100,100);  
b7=new JButton(ic7);  
b7.setBounds(10,280,100,100);  
b8=new JButton(ic8);  
b8.setBounds(110,280,100,100);  
b9=new JButton(ic9);  
b9.setBounds(210,280,100,100); 

sample=new JButton(sampleicon1);  
sample.setBounds(380,100,200,200);  
  
JLabel l1=new JLabel("Sample:");  
l1.setBounds(330,200,70,20);  
JLabel l2=new JLabel("NOTE:icon has power to swap with neighbour icon=");  
l2.setBounds(5,15,500,20);  
JLabel l3=new JLabel("click sample picture to next puzzle");  
l3.setBounds(380,320,200,20);  
l3.setForeground(Color.red);  
  
starB=new JButton(ic0);  
starB.setBounds(330,5,50,50);  
star=b9.getIcon();  
  
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);  
add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);  
b1.addActionListener(this); b2.addActionListener(this);  
 b3.addActionListener(this); b4.addActionListener(this);   
b5.addActionListener(this); b6.addActionListener(this);  
 b7.addActionListener(this); b8.addActionListener(this);  
 b9.addActionListener(this);   
  
sample.addActionListener(this);  
setLayout(null);  
setSize(600,500);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e){  
if(e.getSource()==b1){  
    Icon s1=b1.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b1.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b1.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b2){  
    Icon s1=b2.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b2.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b2.setIcon(star);  
                   }  
         else if(b3.getIcon()==star){  
                    b3.setIcon(s1);  
                    b2.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b3){  
    Icon s1=b3.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b3.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b3.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b4){  
    Icon s1=b4.getIcon();  
      if(b1.getIcon()==star){  
        b1.setIcon(s1);  
        b4.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
         else if(b7.getIcon()==star){  
                    b7.setIcon(s1);  
                    b4.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b5){  
    Icon s1=b5.getIcon();  
      if(b2.getIcon()==star){  
        b2.setIcon(s1);  
        b5.setIcon(star);  
      } else if(b4.getIcon()==star){  
                    b4.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
         else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
          else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b5.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==b6){  
    Icon s1=b6.getIcon();  
      if(b3.getIcon()==star){  
        b3.setIcon(s1);  
        b6.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b6.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b6.setIcon(star);  
                   }  
}//end of if  
  
if(e.getSource()==b7){  
    Icon s1=b7.getIcon();  
      if(b4.getIcon()==star){  
        b4.setIcon(s1);  
        b7.setIcon(star);  
      } else if(b8.getIcon()==star){  
                    b8.setIcon(s1);  
                    b7.setIcon(star);  
                   }  
 }//end of if  
  
   if(e.getSource()==b8){  
    Icon s1=b8.getIcon();  
      if(b7.getIcon()==star){  
        b7.setIcon(s1);  
        b8.setIcon(star);  
      } else if(b5.getIcon()==star){  
                    b5.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
         else if(b9.getIcon()==star){  
                    b9.setIcon(s1);  
                    b8.setIcon(star);  
                   }  
  
  }//end of if  
  
 if(e.getSource()==b9){  
    Icon s1=b9.getIcon();  
      if(b8.getIcon()==star){  
        b8.setIcon(s1);  
        b9.setIcon(star);  
      } else if(b6.getIcon()==star){  
                    b6.setIcon(s1);  
                    b9.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==sample){  
Icon s1=sample.getIcon();  
 if(s1==sampleicon3){  
sample.setIcon(sampleicon1);  
b1.setIcon(ic1);  
b2.setIcon(ic2);  
b3.setIcon(ic3);  
b4.setIcon(ic4);  
b5.setIcon(ic5);  
b6.setIcon(ic6);  
b7.setIcon(ic7);  
b8.setIcon(ic8);  
b9.setIcon(ic9);  
star=b9.getIcon();  
starB.setIcon(ic0);  
}//eof if  
else if(s1==sampleicon1){  
sample.setIcon(sampleicon2);  
b1.setIcon(ic11);  
b2.setIcon(ic12);  
b3.setIcon(ic13);  
b4.setIcon(ic14);  
b5.setIcon(ic15);  
b6.setIcon(ic16);  
b7.setIcon(ic17);  
b8.setIcon(ic18);  
b9.setIcon(ic19);  
star=b6.getIcon();  
starB.setIcon(ic10);  
}//eof else  
else{  
sample.setIcon(sampleicon3);  
b1.setIcon(ic21);  
b2.setIcon(ic22);  
b3.setIcon(ic23);  
b4.setIcon(ic24);  
b5.setIcon(ic25);  
b6.setIcon(ic26);  
b7.setIcon(ic27);  
b8.setIcon(ic28);  
b9.setIcon(ic29);  
star=b6.getIcon();  
starB.setIcon(ic20);  
}//eof else  
  
}  
}//end of actionPerformed  
  
public static void main(String args[]){  
new picpuzzle2();  
}//end of main  
}//end of class  