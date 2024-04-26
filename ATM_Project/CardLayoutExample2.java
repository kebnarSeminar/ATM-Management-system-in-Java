
package bankmanagement.system;

import java.awt.*;    
import java.awt.event.*;    
    
import javax.swing.*;    
    
public class CardLayoutExample2 extends JFrame implements ActionListener{    
CardLayout card;    
JButton b1,b2,b3,b4,b5,b6,b7;
JPanel panel1;
JPanel panel2;
Container c;    
    CardLayoutExample2(){    
            
        c=getContentPane();    
        card=new CardLayout(40,30);    
//create CardLayout object with 40 hor space and 30 ver space    
        c.setLayout(card);    
            b4=new JButton("button4");
            b5=new JButton("button5");
            b6=new JButton("button6");
       
        b1=new JButton("Apple");
        b1.setBounds(100,50,100,30);
        b2=new JButton("Boy");
        b2.setBounds(100,50,100,30);
        b3=new JButton("Cat");
        b3.setBounds(100,50,100,30);
        b1.addActionListener(this);    
        b2.addActionListener(this);    
        b3.addActionListener(this);    
                
        c.add(b1);c.add(b2);c.add(b3);    
                            
    }    
    public void actionPerformed(ActionEvent e) {    
    card.next(c);    
    }    
    
    public static void main(String[] args) {    
        CardLayoutExample2 cl=new CardLayoutExample2();    
        cl.setSize(400,400);    
        cl.setVisible(true);    
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    }    
}    