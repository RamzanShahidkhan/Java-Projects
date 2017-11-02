
public class ExceptionMethod {
	
	

	public static void main(String[] args) {
		try
		{
			method1();
		}
		catch(Exception ex)
		{
			System.err.printf("megssage: %s\n\n",ex.getMessage());
			ex.printStackTrace();
			StackTraceElement [] traceElements=ex.getStackTrace();
			System.out.println("\n StackTrace from getstackTrace");
			System.out.println("Class\t\tfile \t\tLine\t\tMethod");
			for(StackTraceElement el:traceElements)
			{
				System.out.printf("%s\t" ,el.getClassName());
				System.out.printf("%s\t" ,el.getFileName());
				System.out.printf("%s\t" ,el.getLineNumber());
				System.out.printf("%s\n" ,el.getMethodName());
			}
		}
		

	}
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		method3();
	}
	
	public static void method3() throws Exception
	{
		throw new Exception("exception thrown in method3");
	}

}
