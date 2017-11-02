import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HasNextIntdemo {

	public static void main(String[] args) {
		Scanner instream=null;
		//PrintWriter outstream=null;
		
		try {
			instream=new Scanner(new FileInputStream("data.txt"));
			//outstream=new PrintWriter(new FileOutputStream("numbered.txt"));
		} 
		catch (FileNotFoundException e) {
			System.out.println("file data.txt was not found");
			System.out.println("of could not be opened");
			System.exit(0);
		}
		int next, sum=0;
		while(instream.hasNext())
		{
			next=instream.nextInt();
			sum=sum+next;
		}
		instream.close();
		System.out.println("the sum of numbers is ="+sum);

	}

}
