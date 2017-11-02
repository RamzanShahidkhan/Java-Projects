import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryOutputdemo {

	public static void main(String[] args) {
		ObjectOutputStream obs=null;
		
		try {
			obs=new ObjectOutputStream(new FileOutputStream("num.txt"));
			int i;
			for( i=0; i<5; i++)
			{
				obs.writeInt(i);
				
			}
			obs.writeChar((int)'A');
			System.out.println("number written on the file");
			obs.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("file not found");
			
		} catch (IOException e)
		{
			System.out.println("problem with fileoutput");
		}

	}

}
