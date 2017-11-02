import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryInputDemo {

	public static void main(String[] args) {
		ObjectInputStream inob=null;
		try {
			inob=new ObjectInputStream(new FileInputStream("numbers"));
			System.out.println("reading from file:");
			int n1=inob.readInt();
			int n2=inob.readInt();
			System.out.println("number read from file:");
			System.out.println(n1);
			System.out.println(n2);
		} 
		catch (FileNotFoundException e) {
			System.out.println("cannot find file numbers.dat");
		} 
		catch (IOException e) {
			System.out.println("problem from reading from file");
		}
          System.out.println("end of programme");
	}

}
