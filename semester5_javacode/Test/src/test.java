import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	@Before
	public void befor()
	{
		System.out.println("before test ::::");
	}
	@Test
	public void testConcat(){
        MyUnit myUnit = new MyUnit();
        
        String result= myUnit.concatenate("one", "two");
         assertEquals("onetwo", result);
         System.out.println("testing....");
	}

 @Test
   public void testConcat1(){
         System.out.println("testing22....");
   }
 @Test
 public void testConcat3(){
       System.out.println("testing33....");
 }

	@After
	public void after()
	{
		System.out.println("after dashing");
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
