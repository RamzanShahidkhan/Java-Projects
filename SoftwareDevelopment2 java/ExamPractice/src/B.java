
public class B extends A {
  public void draw() {
    System.out.println("BB3");
  }
  public void draw2() {
    System.out.println("BB4");
  }
  
  public static void main(String arg []) {
      //B b = (B) new A(); // compiles with the cast,
	  A a=new A();
	  B b=new B();
	  a.draw();
	  a.draw1();
	  b.draw1();
	  b.draw();
	 
	  b.draw2();
	  //
	  //a.draw();
	  //casting
	  System.out.println("after casting");
	  a=(A)b;
	  a.draw();
	  b.draw2();
	  System.out.println("downcasting");
	  b =(B)a;
	  b.draw();
	  b.draw2();
	  
	 
	
			  
                         // but runtime exception - java.lang.ClassCastException
  }
}