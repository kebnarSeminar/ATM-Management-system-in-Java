
package bankmanagement.system;

import java.awt.*;    
import javax.swing.*;    
public class BorderLayoutExample  
{     
JFrame f;    
// constructor  
BorderLayoutExample()  
{  
    // creating a Frame   
    f = new JFrame();    
    // create buttons  
    JButton btn1 = new JButton("NORTH");    
    JButton btn2 = new JButton("SOUTH");    
    JButton btn3 = new JButton("EAST");   
    JButton btn4 = new JButton("WEST");    
    JButton btn5 = new JButton("CENTER");  
     // creating an object of the BorderLayout class using   
     // the parameterized constructor where the horizontal gap is 20   
     // and vertical gap is 15. The gap will be evident when buttons are placed   
     // in the frame  
    f.setLayout(new BorderLayout(10, 35));  
    f.add(btn1, BorderLayout.NORTH);    
    f.add(btn2, BorderLayout.SOUTH);    
    f.add(btn3, BorderLayout.EAST);    
    f.add(btn4, BorderLayout.WEST);    
    f.add(btn5, BorderLayout.CENTER);    
    f.setSize(300,300);    
    f.setVisible(true);    
}    
// main method  
public static void main(String argvs[])   
{    
    new BorderLayoutExample();    
}    
}    