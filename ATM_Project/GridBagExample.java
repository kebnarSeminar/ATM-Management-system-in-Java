
package bankmanagement.system;

import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class GridBagExample extends JFrame{  
   
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;
    
    
    
        public GridBagExample() { 
            Button b1=new Button("button1");
            Button b2=new Button("button2");
            Button b3=new Button("button3");
            Button b4=new Button("button4");
            Button b5=new Button("button5");
            Button b6=new Button("button6");
            Button b7=new Button("button7");
            Button b8=new Button("button8");
            Button b9=new Button("button9");
            Button bb1=new Button("buttonA");
            Button bb2=new Button("buttonB");
            Button bb3=new Button("buttonC");
            Button bb4=new Button("buttonD");
            Button bb5=new Button("buttonE");
            Button bb6=new Button("buttonF");
            Button bb7=new Button("buttonG");
            Button bb8=new Button("buttonH");
            Button bb9=new Button("buttonI");
      
            
            
    GridBagLayout grid = new GridBagLayout();  
    GridBagConstraints gbc = new GridBagConstraints();  
    setLayout(grid);  
    setTitle("GridBag Layout Example");  
    GridBagLayout layout = new GridBagLayout();  
   // this.setLayout(layout);  
    //gbc.fill = GridBagConstraints.VERTICAL; 

    gbc.gridx = 1;  
    gbc.gridy = 1;
    gbc.weightx=3;
    gbc.weighty=3;
    add(b1, gbc);
    
    gbc.gridx = 2;  
    gbc.gridy = 2;
     gbc.weightx=3;
    gbc.weighty=3;
    add(b2, gbc);  
    
   // gbc.fill = GridBagConstraints.VERTICAL;  
   
    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.weightx=3;
    gbc.weighty=3;
    add(b3, gbc);
    
    // gbc.fill = GridBagConstraints.VERTICAL;  
    
    gbc.gridx = 4;
    gbc.gridy = 4;
    gbc.weightx=3;
    gbc.weighty=3;
    add(b4, gbc);
    
    gbc.gridx = 5;  
    gbc.gridy = 5;
    gbc.weightx=3;
    gbc.weighty=3;
    add(b5,gbc);
    
    gbc.gridx=1;
    gbc.gridy=5;
    gbc.weightx=3;
    gbc.weighty=3;
    add(b6,gbc);
    
    
    
            setSize(300, 300);  
            setPreferredSize(getSize());  
            setVisible(true); 
            setLocation(320,200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
      
        }  
 
         public static void main(String[] args) {  
             GridBagExample a = new GridBagExample();  
        }  
        
}  