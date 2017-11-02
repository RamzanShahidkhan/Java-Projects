import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HasnextLineDemo {

	public static void main(String[] args) {
		Scanner instream=null;
		PrintWriter outstream=null;
		
		try {
			instream=new Scanner(new FileInputStream("original.txt"));
			outstream=new PrintWriter(new FileOutputStream("numbered.txt"));
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}
		String line=null;
		int c=0;
		while(instream.hasNextLine())
		{
			line=instream.nextLine();
			c++;
			outstream.println(c+"   " +line);
			
		}
		//outstream.println(c+"   " +line);  // for me 
		instream.close();
		outstream.close();

	}

}
