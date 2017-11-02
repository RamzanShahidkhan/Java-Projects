
public class UsingException {
	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("method throwException");
			throw new Exception(); //generate exception
		}
		catch(Exception exception)
		{
			System.err.println("Exception handled in method throwEception");
			throw exception;   //rethrow for exception for further processing
		}
		finally
		{
			System.err.println("finally executed in the method throwException");
		}
		
	}
	public static void doesNotThrowException()
	{
		try
		{
			System.out.println("Method doesnotthrowException");
		}
		catch(Exception exception)
		{
			System.err.println(exception);
		}
		finally
		{
			System.err.println("Finally executed in doesnotthrowException");
			
		}
		System.out.println("end of method doesnotthrowexception");
	}

	public static void main(String[] args) {
		try
		{
			throwException();
		}
		catch(Exception exception)
		{
			System.err.println("exception handled in main");
		}
		doesNotThrowException();

	}

}
