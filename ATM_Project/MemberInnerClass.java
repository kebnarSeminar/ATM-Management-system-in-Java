
package bankmanagement.system;


public class MemberInnerClass {
   private int data=99;
   class Inner1{
   void inner1(){
   
   System.out.println("inner1");
   }
   
   }
   class Inner2{
   
   void inner2(){
   System.out.println("inner2");
   
   
   
   }
   }
    
    
    
    
    public static void main(String[]args){
    MemberInnerClass obj=new MemberInnerClass();
    MemberInnerClass.Inner1 in1=obj.new Inner1();
    MemberInnerClass.Inner2 in2=obj.new Inner2();
    in1.inner1();
    in2.inner2();
    
    }
}
