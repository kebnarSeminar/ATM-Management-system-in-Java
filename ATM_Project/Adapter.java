
package bankmanagement.system;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import  javax.swing.*;
public class Adapter extends JFrame implements MouseListener {
    private String details;
    private JLabel statusbar;
    JPanel panel1;
public Adapter(){
super("more on Adapter");
statusbar=new JLabel("default");
add(statusbar,BorderLayout.SOUTH);
panel1=new JPanel();


setSize(400,400);
setVisible(true);
setLocation(320,200);

}
public void mouseClicked(MouseEvent ev){

details=String.format("you clicked%d",ev.getClickCount());
if(ev.isMetaDown()){
details+="with right mouse button";
}
else if(ev.isAltDown()){
details+="with center mouse button";
}
else{
details+="without left mouse button";
}
statusbar.setText("default"+details);
}


public static void main(String[]args){
    new Adapter();
    
    
    
}

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
