
package bankmanagement.system;


public class LocalInnerClass {
   private int data=60;
   void display(){
   class Inner{
   void msg(){
   System.out.println("hell hello"); 
   }
   void ball(int p){
   
   System .out.println("ball ball"+p);
   }
   }
   Inner in=new Inner();
   in.msg();
   in.ball(9);
   
   }
   void date(){
   class dater{
   
   void good(){
   System.out.println("good");
   
   }
   }
   dater dat=new dater();
   dat.good();
   
   }
   
   
   
   public static void main(String[]args){
   
   LocalInnerClass obj=new LocalInnerClass();
   obj.display();
   obj.date();
   
   }
}
