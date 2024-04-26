
package bankmanagement.system;

// import statements  
import java.awt.*;    
import javax.swing.*;    
    
public class BoxLayoutExample4 extends Frame   
{    
Button buttons[];    
// constructor of the class  
public BoxLayoutExample4()   
{    
JFrame f = new JFrame();  
JPanel pnl = new JPanel();  
buttons = new Button[5];  
GridBagConstraints constrntObj = new GridBagConstraints();  
    
constrntObj.fill = GridBagConstraints.VERTICAL;  
for (int i = 0; i < 5; i++)   
{    
  buttons[i] = new Button ("Button " + (i + 1));   
    
  // adding the buttons so that it can be displayed  
  add(buttons[i]);    
}    
  
// the components will be displayed just like the line is present on a page  
setLayout (new BoxLayout(this, BoxLayout.PAGE_AXIS)); 

JCheckBox cb=new JCheckBox("CheckBox1");
add(cb);
setSize(400, 400);    
setVisible(true);    
}    
    
// main method  
public static void main(String argvs[])  
{    
// creating an object of the class BoxLayoutExample4  
BoxLayoutExample4 obj = new BoxLayoutExample4();  
}    
}    