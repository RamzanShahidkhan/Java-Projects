import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter two number and place space between them");
		System.out.println("extra plank space is ok");
		String inputline=keyboard.nextLine();
		String delimiter=",";
		StringTokenizer numfactory=new StringTokenizer(inputline,delimiter);
		String s1=null;
		String s2=null;
		if(numfactory.countTokens()>=2)
		{
			s1=numfactory.nextToken();
			s2=numfactory.nextToken();
			
		}
		else 
		{
			System.out.println("fatal error");
			System.exit(0);
			
		}
		double n1=Double.parseDouble(s1);
		double n2=Double.parseDouble(s2);
		System.out.println("you input");
		System.out.println( n1 +" and"+ n2);

	}

}
