import java.util.InputMismatchException;
import java.util.Scanner;

public class Generic {
	public static int quotient(int numerator,int denomirator)
	{
		return numerator/ denomirator;
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		boolean loop=true;
		do{

			try{	
				System.out.println("enter 1st number");
				int numerator=input.nextInt();
				System.out.println("enter 2nd number");
				int denomirator=input.nextInt();
				int result =quotient(numerator,denomirator);
				System.out.printf("result: %d /%d = %d",numerator,denomirator,result);
				loop=false;
			}
			catch (InputMismatchException e) {
				System.out.printf("Eexception\n %s\n", e);
				System.out.println("enter integer lpz");
			}
			catch(Exception e)
			{
				System.err.printf("\nException is\n %s ",e);
				System.out.println("Zero is invalid enter integer");
			}
			input.nextLine();
			
		}
		while(loop);
	}

}
