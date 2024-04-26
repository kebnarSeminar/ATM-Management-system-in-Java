
package bankmanagement.system;

import java.awt.*;    
import javax.swing.*;    
    
public class BoxLayoutExample2 extends Frame {    
 Button buttons[];    
    
 public BoxLayoutExample2() {    
   buttons = new Button [5];    
      
   for (int i = 0;i<5;i++) {    
      buttons[i] = new Button ("Button " + (i + 1));    
      // adding the buttons so that it can be displayed  
      add (buttons[i]);    
    }    
 // the buttons in the output will be aligned vertically   
setLayout (new BoxLayout(this, BoxLayout.X_AXIS));    
setSize(400,400);    
setVisible(true);    
}    
 // main method   
public static void main(String args[]){    
BoxLayoutExample2 b=new BoxLayoutExample2();    
}    
}    