
package bankmanagement.system;

class StaticInnerClass{  
  static int data=30;  
  static class Inner1{  
   void msg(){System.out.println("data is "+data);}  
  }  
  static class Inner2{
  void doit(){
  
  System.out.println("doit"+data);
  
  }
  
  }
  public static void main(String args[]){  
  StaticInnerClass.Inner1 obj1=new StaticInnerClass.Inner1();
  StaticInnerClass.Inner2 obj2=new StaticInnerClass.Inner2(); 
  obj1.msg();
  obj2.doit();
  }  
}  