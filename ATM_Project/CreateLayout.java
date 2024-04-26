
package bankmanagement.system;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CreateLayout extends JFrame implements ActionListener {
    private JButton lb;
    private JButton cb;
    private JButton rb;
    JPanel panel1;
    private FlowLayout layout;
    public CreateLayout(){
    super("Cretaing FlowLayout");
    layout=new FlowLayout();
    setLayout(layout);
    lb=new JButton("LEFT");
    add(lb);
    lb.addActionListener(this);
    cb=new JButton("CENTER");
    add(cb);
    cb.addActionListener(this);
    rb=new JButton("RIGHT");
    add(rb);
    rb.addActionListener(this);
    panel1=new JPanel();
    panel1.setBorder(new TitledBorder("panel1"));
    panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
    panel1.add(lb);
    panel1.add(cb);
    panel1.add(rb);
    JTabbedPane pane= new JTabbedPane();
    pane.addTab("panel1",panel1);
    add(pane);
    setSize(250,250);
    setVisible(true);
    setLocation(320,200);
    
    }
public void actionPerformed(ActionEvent ev){
if(ev.getSource()==lb){
layout.setAlignment(FlowLayout.LEFT);

}
else if(ev.getSource()==cb){
layout.setAlignment(FlowLayout.CENTER);
}
else if(ev.getSource()==rb){
layout.setAlignment(FlowLayout.RIGHT);
}
}

public static void main(String[] args){
new CreateLayout();
}
}
