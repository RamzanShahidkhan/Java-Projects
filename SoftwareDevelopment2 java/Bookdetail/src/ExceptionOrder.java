import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOrder {
	public static int quotient (int numerator ,int denominator)throws ArithmeticException
	{
		return numerator/denominator;
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		boolean continueloop=true;  
		do
		{
		try
		{
			
			System.out.println("enter 1st num");
			int numerator=input.nextInt();
			System.out.println("enter 2nd num");
			int denominator=input.nextInt();
			int result=quotient(numerator,denominator);
			System.out.printf ("Result: %d / %d  = %d ",numerator,denominator, result);
			continueloop=false;
		}
		catch(InputMismatchException e)
		{
			System.err.printf("exception: %s\n",e);
			input.nextLine();
			System.out.println("enter integer Plz try again\n");
		}
		catch(ArithmeticException e)
		{
			System.err.printf("\nEexception: %s\n", e);
			System.out.println("Zero is invalid num:plz try again");
		}
	   } 	
		while(continueloop);
	}
}
