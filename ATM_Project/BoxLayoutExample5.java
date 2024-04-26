
package bankmanagement.system;

// import statementss  
import java.awt.*;    
import javax.swing.*;    
    
public class BoxLayoutExample5 extends Frame   
{    
Button buttons[];    
   
// constructor of the class   
public BoxLayoutExample5()   
{    
JFrame f = new JFrame();  
buttons = new Button[5];  
  
// Creating a Box whose alignment is horizontal  
Box horizontalBox = Box.createHorizontalBox();  
  
// ContentPane returns a container  
Container contentPane = f.getContentPane();  
  
for (int i = 0; i < 5; i++)   
{    
  buttons[i] = new Button ("Button " + (i + 1));   
    
  // adding the buttons to the box so that it can be displayed  
  horizontalBox.add(buttons[i]);    
}    
  
// adding the box and the borderlayout to the content pane  
contentPane.add(horizontalBox, BorderLayout.NORTH);  
  
// now, the rendered components are displayed vertically.
// it is because the box is aligned horizontally  
f.setLayout (new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));  
     
f.setSize(400, 400);    
f.setVisible(true);    
}    
    
// main method  
public static void main(String argvs[])  
{    
// creating an object of the class BoxLayoutExample5  
BoxLayoutExample5 obj = new BoxLayoutExample5();  
}    
}   