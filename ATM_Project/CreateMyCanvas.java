
package bankmanagement.system;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CreateMyCanvas extends Canvas {
    public void paint(Graphics g){
    g.drawString("Hello",40,40);  
        setBackground(Color.green);  
        g.fillRect(130, 30,100, 80);
        g.drawRect(30,250,50,50);
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40); 
    }
    
    
    
    public static void main(String[] args ){
    CreateMyCanvas m=new CreateMyCanvas(); 
        JFrame f=new JFrame(); 
        f.add(m);  
        f.setSize(400,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(320, 200);
        //f.setLayout(null);  
        f.setVisible(true);  
    
    
    }
}
