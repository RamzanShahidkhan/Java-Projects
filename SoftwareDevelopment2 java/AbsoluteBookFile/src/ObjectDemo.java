import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDemo {

	public static void main(String[] args) {
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("datafile"));
			
			SomeClass oneOb=new SomeClass(2,'B');
			SomeClass anotherOb=new SomeClass(42,'Z');
			out.writeObject(oneOb);
			out.writeObject(anotherOb);
			out.close();
			System.out.println("data send to file");
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("problem with file output");
		}
		System.out.println("now reopen file ");
		try {
			ObjectInputStream input=new ObjectInputStream(new FileInputStream("datafile"));
			
			SomeClass  readOne=(SomeClass)input.readObject();
			SomeClass  readOther=(SomeClass)input.readObject();
			
			System.out.println(readOne);
			System.out.println(readOther);
			input.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
