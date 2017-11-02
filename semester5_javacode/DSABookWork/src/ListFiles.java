import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length ==0)
			System.out.println("No Files specified");
		for(String fileName : args)
			listFile(fileName);
	}
	
	public static void listFile(String fileName)
	{
		Scanner fileIn= null;
		System.out.println("FILE: "+ fileName);
		
		try {
			fileIn = new Scanner(new FileReader(fileName));
			while(fileIn.hasNextLine())
			{
				String oneLine =fileIn.nextLine();
				System.out.println(oneLine);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		finally {
			//close the stream
			if(fileIn!=null)
				fileIn.close();
		}
	}

}
