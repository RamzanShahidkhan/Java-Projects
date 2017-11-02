import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryInputDemo {

	public static void main(String[] args) {
		ObjectInputStream inob=null;
		try {
			//inob=new ObjectInputStream(new FileInputStream("num"));
			inob=new ObjectInputStream(new FileInputStream("bianryOutput.dat"));
			System.out.println("reading numbers in ninaryOutput.dat file");
			int number;
			try
			{
				while(true)
				{
					number=inob.readInt();
					System.out.println(number);	
				}
			}
			catch(EOFException e){
				System.out.println("No more numbers in the file");
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("cannot find file binaryouput.dat");
		} 
		catch (IOException e) {
			System.out.println("problem from reading or input from file");
		}
          System.out.println("end of programme");
	}

}
