import java.util.Scanner;

public class reverse4 {
public static void main (String[]args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String s=input.nextLine();
	
	String[] tokens=s.split(" ");
	for(int i=tokens.length-1; i>=0; i-- )
	{
	   System.out.println(tokens[i]);
	}
	//System.out.println(tokens[2]);
	
	//System.out.println(tokens[1]);
	//System.out.println(tokens[0]);
	
	
	
}

}
