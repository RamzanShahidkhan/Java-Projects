import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArrayIODemo {

	public static void main(String[] args) {
		SomeClass [] a=new SomeClass[2];
		a[0]=new SomeClass(12,'H');
		a[1]=new SomeClass(45,'G');
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("arrayfile"));
			out.writeObject(a);
			out.close();
			System.out.println("data send from array to file");
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("problem with file output");
		}
		System.out.println("now reopen file ");
		SomeClass[] b=null;
		try {
			ObjectInputStream input=new ObjectInputStream(new FileInputStream("arrayfile"));
			b=(SomeClass[])input.readObject();
			input.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("cannot find datafile");
			//e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Problem with file input");
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Problem with file input");
			//e.printStackTrace();
		}
		System.out.println("The following elements were read fro the file");
		int i;
		for( i=0; i<b.length; i++)
			System.out.println(b[i]);
		System.out.println("endddd of program");
	}
}
