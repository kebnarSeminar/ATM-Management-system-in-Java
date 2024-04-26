
package bankmanagement.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class MyLayout extends JFrame implements ActionListener {
   
    public MyLayout(){
    setSize(500,500);
    setVisible(true);
    setLocation(320,200);
    
    
    
    
   
    JPanel mainPanel=new JPanel();
    mainPanel.setBackground(Color.blue);
    mainPanel.setBorder(new TitledBorder("PanelCaption"));
    mainPanel.setLayout(new GridLayout(3,2));
    
    JPanel ppanel1=new JPanel();
    ppanel1.setBorder(new TitledBorder("panel1"));
    ppanel1.setBackground(Color.orange);
    ppanel1.setLayout(new GridLayout(1,2));
    JList lists=new JList(new String[]{"item1","item2","item3","iten4","item5","item6","item8"});
    ppanel1.add(lists);
    
   JPanel radionButtonPanel=new JPanel();
   radionButtonPanel.setBackground(Color.red);
   radionButtonPanel.setBorder(new TitledBorder("radionButtonPanel"));
   JRadioButton  radioButton1=new JRadioButton("RadioButton1");
   radioButton1.setSelected(true);
   JRadioButton button2=new JRadioButton("button2");
   JRadioButton button3=new JRadioButton("button3");
   JRadioButton button4=new JRadioButton("inactiveRadioButton");
   button4.setEnabled(false);
   radionButtonPanel.setLayout(new BoxLayout(radionButtonPanel,BoxLayout.Y_AXIS));
   radionButtonPanel.add(radioButton1);
   radionButtonPanel.add(button2);
   radionButtonPanel.add(button3);
   radionButtonPanel.add(button4);

   
  JPanel ppanel2=new JPanel();
  ppanel2.setBorder(new TitledBorder("panel2"));
  ppanel2.setLayout(new BorderLayout());
  JButton view=new JButton("VIEW");
  ppanel2.add(view,BorderLayout.SOUTH);
  ppanel2.add(radionButtonPanel,BorderLayout.CENTER);
 // Panel1.add(view,BorderLayout.SOUTH);
  ppanel1.add(ppanel2);
  mainPanel.add(ppanel1);
  
  JTabbedPane tabbedPane=new JTabbedPane();
  tabbedPane.setBorder(new TitledBorder("tabbedPane"));
  
  
  JPanel tabPanel1=new JPanel();
  tabPanel1.setBorder(new TitledBorder("tabPanel1"));
  tabPanel1.setLayout(new BorderLayout());
  
  JPanel tabCheckBoxPanel=new JPanel();
  tabCheckBoxPanel.setBorder(new TitledBorder("tabCheckBoxPanel"));
  tabCheckBoxPanel.setLayout(new BoxLayout(tabCheckBoxPanel,BoxLayout.Y_AXIS));
  tabCheckBoxPanel.add(new JCheckBox("uncheckedBox"));
  JCheckBox cb=new JCheckBox("checkedBox");
  cb.setSelected(true);
  tabCheckBoxPanel.add(cb);
  
  tabPanel1.add(tabCheckBoxPanel,BorderLayout.CENTER);
  tabPanel1.add(new JSlider(0,100,70),BorderLayout.SOUTH);
  tabbedPane.addTab("selectedTab",tabPanel1);
   tabbedPane.addTab("otherTab",new JPanel());
   mainPanel.add(tabbedPane);
   
   JPanel ppanel3=new JPanel();
   ppanel3.setBackground(Color.MAGENTA);
   ppanel3.setBorder(new TitledBorder("panel3"));
   ppanel3.setLayout(new BoxLayout(ppanel3,BoxLayout.X_AXIS));
   ppanel3.add(new JTextField("textfield"));
   ppanel3.add(new JPasswordField("passwordfield"));
   JComboBox<String> comb=new JComboBox<String>(new String[]{"item1","item2","item3","item4","item5","item6"});
   ppanel3.add(comb);
  
  
  JPanel ppanel4=new JPanel();
  ppanel4.setBackground(Color.LIGHT_GRAY);
  ppanel4.setBorder(new TitledBorder("panel4"));
  ppanel4.setLayout(new BorderLayout());
  ppanel4.add(ppanel3,BorderLayout.NORTH);
  mainPanel.add(ppanel4);
  
  JPanel panel5=new JPanel();
  panel5.setBackground(Color.pink);
  panel5.setBorder(new TitledBorder("panel5"));
  panel5.setLayout(new BoxLayout(panel5,BoxLayout.Y_AXIS));
  JButton b5=new JButton("button5");
  JButton b6=new JButton("button6");
  JButton b7=new JButton("button7");
  JButton b8=new JButton("button8");
  panel5.add(b5);
  panel5.add(b6);
  panel5.add(b7);
  panel5.add(b8);
  mainPanel.add(panel5);
  
  
  
  
  
  JTabbedPane tpane=new JTabbedPane();
  tpane.add("selection",new JPanel());
  mainPanel.add(tpane);
  
  
  
  add(mainPanel);
    }
    
    
    
    
    
    public static void main(String [] args){
    new MyLayout();
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
