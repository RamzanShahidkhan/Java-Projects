import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectionDemo {

	public static void main(String[] args) {
		PrintStream errStream=null;
		
		try {
			errStream=new PrintStream(new FileOutputStream("error.txt"));
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("error opening file");
			System.exit(0);
			
		}
		System.setErr(errStream);
		System.err.println("hello from system.err");
		System.out.println("hello from system.out");
		System.err.println("hello again from system.err");
		errStream.close();

	}

}
