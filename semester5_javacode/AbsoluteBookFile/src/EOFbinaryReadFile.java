import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EOFbinaryReadFile {
	public static void main(String [] arg){
	
	try 
	{
		ObjectInputStream inob=null;
		//inob=new ObjectInputStream(new FileInputStream("num"));
		inob=new ObjectInputStream(new FileInputStream("bianryOutput.dat"));
		System.out.println("reading from file:");
		int n1=inob.readInt();
		int n2=inob.readInt();
		int n3=inob.readInt();
		System.out.println("number read from file:");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	} 
	catch (FileNotFoundException ee) {
		System.out.println("cannot find file numbers.dat");
	} 
	catch (IOException e) {
		System.out.println("problem from reading from file");
	}
      System.out.println("end of programme");
	}
}
