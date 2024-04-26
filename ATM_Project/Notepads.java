
package bankmanagement.system;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Notepads extends JFrame implements ActionListener {
    JFrame f;
 
    Date date;
    JMenuBar mb;
    JMenu file,edit,format,view,help,color;
    JMenuItem nNew,newWindow,open, save,saveAs,pageSetup,print,exit,cut,
            copy,paste,replace,selectall,viewhelp,sendFeedBack,aboutNotepad,
            undo,delete,zoomin,zoomout,defaultsize,time,source,font,bgColor,fgColor;
    JTextArea ta;
    public Notepads(){
    f=new JFrame();
    f.setTitle("NotePad");
    date=new Date();
    ta=new JTextArea();
    ta.setBounds(5,30,460,460);
    ta.setBackground(Color.magenta);
    ta.setForeground(Color.BLACK);
    ta.setFont(new Font("Raleway",Font.BOLD,15));
    ta.setLayout(new FlowLayout());
    f.add(new JScrollPane(ta));
    f.add(ta);
    mb=new JMenuBar();
    mb.setBounds(5,5,400,40);
    file=new JMenu("File");
    edit =new JMenu("Edit");
    format=new JMenu("Format");
    view=new JMenu("View");
    color=new JMenu("Color");
    help=new JMenu("Help");    
    
    
   bgColor=new JMenuItem("ChangeBackgroundColor");
   fgColor=new JMenuItem("ChangeForeGroundColor");
    nNew=new JMenuItem("New");
    newWindow=new JMenuItem("New Window");
    open=new JMenuItem("Open");
    save=new JMenuItem("save");
    saveAs=new JMenuItem("saveAs");
    pageSetup=new JMenuItem("pageSetup");
    print=new JMenuItem("print");
    exit=new JMenuItem("exit");
    cut=new JMenuItem("cut");
    copy=new JMenuItem("copy");
    paste=new JMenuItem("paste");
    replace=new JMenuItem("replace");
    selectall=new JMenuItem("selectall");
    viewhelp=new JMenuItem("viewhelp");
    sendFeedBack=new JMenuItem("sendFeedBack");
    aboutNotepad=new JMenuItem("AboutNotepad");
    undo=new JMenuItem("undo");
    delete=new JMenuItem("delete");
    zoomin=new JMenuItem("zoom In");
    zoomout=new JMenuItem("zoom Out");
    defaultsize=new JMenuItem("Default Size");
    time=new JMenuItem("Time/Date");
    font=new JMenuItem("Font");
    source=new JMenuItem("SourceCode");
   
    file.add(nNew);
    file.add(newWindow);
    file.add(open);
    file.add(save);
    file.add(saveAs);
    file.add(pageSetup);
    file.add(print);
    file.add(exit);
    
    edit.add(undo);
    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(replace);
    edit.add(selectall);
    edit.add(delete);
   
    view.add(time);
    view.add(zoomin);
    view.add(zoomout);
    view.add(defaultsize);
    
    color.add(bgColor);
    color.add(fgColor);
  
    format.add(source);
    format.add(font);    
    
    bgColor.addActionListener(this); 
    fgColor.addActionListener(this); 
    selectall.addActionListener(this); 
    nNew.addActionListener(this);  
    newWindow.addActionListener(this);  
    open.addActionListener(this);  
    save.addActionListener(this); 
    cut.addActionListener(this);  
    copy.addActionListener(this);  
    paste.addActionListener(this);   
    pageSetup.addActionListener(this);  
    print.addActionListener(this);  
    exit.addActionListener(this);  
    viewhelp.addActionListener(this); 
    replace.addActionListener(this);  
    sendFeedBack.addActionListener(this);  
    aboutNotepad.addActionListener(this);  
    delete.addActionListener(this);  
    zoomout.addActionListener(this);
    zoomin.addActionListener(this); 
    defaultsize.addActionListener(this);
    time.addActionListener(this);  
    font.addActionListener(this);  
    source.addActionListener(this);  
  
    
    help.add(viewhelp);
    help.add(sendFeedBack);
    help.add(aboutNotepad);
    mb.add(file);
    mb.add(edit);
    mb.add(color);
    mb.add(format);
    mb.add(view);
    mb.add(help);
    f.add(mb);
    
    f. setLayout(null);
    f.setSize(500,500);
    f.setLocation(320,200);
    f.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e) {  
if(e.getSource()==cut){  
ta.cut();  }
else if(e.getSource()==paste){  
ta.paste();  }
else if(e.getSource()==copy){  
ta.copy();  }
else if(e.getSource()==selectall){
ta.selectAll();  }
else if(e.getSource()==nNew){ 
    int b=JOptionPane.showConfirmDialog(null,"do you want to open new file?","select",JOptionPane.YES_NO_OPTION);
    if(b==0){
    ta.setText("");}
  }
else if(e.getSource()==newWindow){
    setVisible(true);
 new Notepads().setVisible(true);}
else if(e.getSource()==open){  
openFile();
}
else if(e.getSource()==save){  

}
else if(e.getSource()==zoomout){  
f.setSize(220,220);
}
else if(e.getSource()==pageSetup){  
 
}
else if(e.getSource()==print){
    try{
        ta.print();
    }
    catch(Exception ev){
    JOptionPane.showMessageDialog(null,ev);
    }
}
else if(e.getSource()==exit){  
int a= JOptionPane.showConfirmDialog(null,"do you really want to exit?","select",JOptionPane.YES_NO_CANCEL_OPTION);
if(a==0){
System.exit(0);
}
}
else if(e.getSource()==defaultsize){
    f.setSize(500,500);

}
else if(e.getSource()==replace){
    ta.setText("");
 ta.replaceSelection(ta.getText());
}
else if(e.getSource()==delete){  

}
else if(e.getSource()==time){
 SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss aa");
  String times=sdf.format(Calendar.getInstance().getTime());
  ta.setForeground(Color.blue);
ta.setText(times.toString()+"\n"+date);
}
else if(e.getSource()==zoomin){  
f.setSize(700, 700);
}
else if(e.getSource()==bgColor){  
   Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c); 
}
else if(e.getSource()==font)  {
    try{
Font font = Font.createFont(Font.TRUETYPE_FONT, new File("MyFont.otf"));
font  = font.deriveFont(Font.BOLD, 40);}
    catch(Exception er){
    JOptionPane.showMessageDialog(null, er);
    }
}
else if(e.getSource()==fgColor)  {
 Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
}
else if(e.getSource()==source)  {
    
  new SourceGetter().setVisible(true);
        }  

else if(e.getSource()==aboutNotepad)  {
ta.paste();  }
    }
  
 void openFile(){  
JFileChooser fc=new JFileChooser();  
int i=fc.showOpenDialog(this);  
          
if(i==JFileChooser.APPROVE_OPTION){  
File f=fc.getSelectedFile();  
String filepath=f.getPath();  
              
displayContent(filepath);  
              
}  
          
}  
  
void displayContent(String fpath){  
try{  
BufferedReader br=new BufferedReader(new FileReader(fpath));  
String s1="",s2="";  
              
while((s1=br.readLine())!=null){  
s2+=s1+"\n";  
}  
ta.setText(s2);  
br.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  
    
    
    public static void main(String[]args){
    new Notepads();
    }
}
