
package bankmanagement.system;
import java.awt.event.*;  
import javax.swing.*;  
public class WordCharacter extends JFrame implements ActionListener{  
JTextArea ta;  
JButton b1,b2,b3;
WordCharacter(){  
    super("Word Character Counter - JavaTpoint");  
    ta=new JTextArea();  
    ta.setBounds(50,50,300,200);  
      
    b1=new JButton("Word");  
    b1.setBounds(50,300,100,30);  
      
    b2=new JButton("Character");  
    b2.setBounds(180,300,100,30);
    b3=new JButton("Lines");
    b3.setBounds(300,300,100, 30);
      
    b1.addActionListener(this);  
    b2.addActionListener(this);
    b3.addActionListener(this);
    add(b1);add(b2);add(b3);add(ta);  
    setSize(500,400);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String text=ta.getText();  
    if(e.getSource()==b1){
        if(!text.equals("")){
        String[] words=text.split("\\s");  
        JOptionPane.showMessageDialog(this,"Total words: "+words.length);}
        else{
        JOptionPane.showMessageDialog(this,"no word has been written yet");
        }
    }  
    if(e.getSource()==b2){  
        JOptionPane.showMessageDialog(this,"Total Characters with space: "+text.length());  
    }
    if(e.getSource()==b3)
    { if(!text.equals("")){
        String[] lines=text.split("\n");
    JOptionPane.showMessageDialog(this,"Total Number of line"+lines.length);}
     else{
        JOptionPane.showMessageDialog(this,"no word has been written yet");
        }
    
    }
}  
public static void main(String[] args) {  
    new WordCharacter();  
}  
}  