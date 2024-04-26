
package bankmanagement.system;

import javax.swing.JOptionPane;


 class MyException1 extends Exception {
    
   public MyException1(String str){
    
    super(str);
    
    }
}
public class MyException{
    public static void main(String[]args){

    try{

throw new MyException1("kebnar exception");
}
  catch(MyException1 ude ){
  JOptionPane.showMessageDialog(null,"exception handled:"+ude.getMessage());
  
  
  }  
    

}}
