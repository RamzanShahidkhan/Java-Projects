
public class RethrowException {
	
	public static void someMethod() throws Exception
	{  
		try
		{
		  someMethod2();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in someMethod()");
			throw e;  //re_throw exception
		}
	}
	public static void someMethod2()
	{
		try
		{
			System.out.println("methodthrow exception");
			throw new Exception();
		}
		catch(Exception exception)
		{
			System.err.printf("exceptionthrown is", exception);
		}
	}

	public static void main(String[] args) {
		try
		{
			someMethod();
		}
		catch(Exception ee)
		{
			System.out.println("Exceptoon handled in main");
			System.out.printf("\n\n%s", ee.getMessage());
			ee.printStackTrace();
			System.out.println(ee.getStackTrace());
			
		}
		

	}

}
