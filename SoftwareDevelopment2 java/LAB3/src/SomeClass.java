import java.util.Scanner;

public class SomeClass {
	Scanner sc=new Scanner(System.in);
	
	public SomeClass() {
		
		try{
			//int s = 4/0;
			throw new ArithmeticException("im gg");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// TODO Auto-generated constructor stub
		//throw new ArithmeticException("im gg");
	}
	
	public static void main(String [] args)
	{
		try
		{
			SomeClass s=new SomeClass();
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
		}
	}
	

}
