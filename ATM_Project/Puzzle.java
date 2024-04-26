
package bankmanagement.system;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;  
public class Puzzle extends Frame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;  
public Puzzle(){  
    super("Puzzle - JavaTpoint");
    JLabel l1=new JLabel("LEVEL 1:");
    l1.setForeground(Color.red);
    l1.setBackground(Color.green);
    l1.setBounds(100, 50,100,40);
    add(l1);
    b1=new JButton("1");  
    b1.setBounds(50,100,100,40);  
    b2=new JButton("2");  
    b2.setBounds(150,100,100,40);  
    b3=new JButton("3");  
    b3.setBounds(250,100,100,40);  
    b4=new JButton("4");  
    b4.setBounds(50,150,100,40);  
    b5=new JButton("5");  
    b5.setBounds(150,150,100,40);  
    b6=new JButton("6");  
    b6.setBounds(250,150,100,40);  
    b7=new JButton("7");  
    b7.setBounds(50,200,100,40);  
    b8=new JButton("");  
    b8.setBounds(150,200,100,40);  
    b9=new JButton("8");  
    b9.setBounds(250,200,100,40);  
      
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
    setLayout(null);
    setSize(300,300);
    setLocation(320,200);
    setVisible(true);

}  

public static void main(String[] args) {  
    new Puzzle();  
}  

    @Override
   public void actionPerformed(ActionEvent e){  
    if(e.getSource()==b1){    
        String label=b1.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b1.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b1.setLabel("");  
        }  
    }  
    
    
    if(e.getSource()==b2){  
        String label=b2.getLabel();  
        if(b1.getLabel().equals("")){  
            b1.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b2.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b2.setLabel("");  
        }  
    }  
    if(e.getSource()==b3){  
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
    if(e.getSource()==b4){  
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
    if(e.getSource()==b5){  
        String label=b5.getLabel();  
        if(b2.getLabel().equals("")){  
            b2.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b4.getLabel().equals("")){  
            b4.setLabel(label);  
            b5.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b5.setLabel("");  
        }  
    }  
    if(e.getSource()==b6){  
        String label=b6.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b3.getLabel().equals("")){  
            b3.setLabel(label);  
            b6.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b6.setLabel("");  
        }  
    }  
    if(e.getSource()==b7){  
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
    if(e.getSource()==b8){  
        String label=b8.getLabel();  
        if(b9.getLabel().equals("")){  
            b9.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b7.getLabel().equals("")){  
            b7.setLabel(label);  
            b8.setLabel("");  
        }  
        if(b5.getLabel().equals("")){  
            b5.setLabel(label);  
            b8.setLabel("");  
        }  
    }  
    if(e.getSource()==b9){  
        String label=b9.getLabel();  
        if(b6.getLabel().equals("")){  
            b6.setLabel(label);  
            b9.setLabel("");  
        }  
        if(b8.getLabel().equals("")){  
            b8.setLabel(label);  
            b9.setLabel("");  
        }  
    }  
      
    //congrats code  
    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
            .equals("8")&&b9.getLabel().equals("")){     
            JOptionPane.showMessageDialog(this,"Congratulations! You won.");
            setVisible(false);
            new Puzzle1().setVisible(true);
    }    
}  
}  