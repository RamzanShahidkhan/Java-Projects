package vogella;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
                MyClass.class,
               // MyClassAdd.class 
                })


public class AllTests {
	@Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
            MyClass tester = new MyClass(); // MyClass is tested
           // MyClassAdd addtest = new MyClassAdd(); // MyClass is tested
            System.out.println("testing multiply class first");
            // assert statements
            assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
            
            System.out.println("testing multiply class");
            System.out.println("testing add ");
           // assertEquals("2+2 must be 4", 4,addtest.add(2, 2) );
            
    }
	

}