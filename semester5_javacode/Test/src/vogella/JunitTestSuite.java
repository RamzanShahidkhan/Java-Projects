package vogella;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JunitTestSuite {
   public static void main(String[] a) {
      // add the test's in the suite
      TestSuite suite = new TestSuite( MyClass.class, MyClassAdd.class );
      TestResult result = new TestResult();
      suite.run(result);
      System.out.println("Number of test cases = " + result.runCount());
   }
}