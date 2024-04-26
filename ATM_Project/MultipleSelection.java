
package bankmanagement.system;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MultipleSelection extends JFrame implements ActionListener {
    final JList leftList;
    private JList rightList;
    private JButton move;
    String[] foods={"mango","banana","orange","apple","bread","injera","biscuit","gums","others"};
    public MultipleSelection(){
    super("my multiple selection");
   setLayout(new FlowLayout());
   
    leftList=new JList(foods);
    leftList.setVisibleRowCount(3);
    leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(leftList));
    
    move=new JButton("MOVE-->>");
    add(move);
    rightList=new JList();
    rightList.setVisibleRowCount(3);
    rightList.setFixedCellWidth(100);
    rightList.setFixedCellHeight(15);
    rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(rightList));
    move.addActionListener(this);
  
    setVisible(true);
    setSize(500,500);
    setLocation(320,200);
    
    
    }
   public static void main(String []args){
   new MultipleSelection();
   } 

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==move){
        try{
    rightList.setListData(leftList.getSelectedValues());}
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }}
    }
    
}
