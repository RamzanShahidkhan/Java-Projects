import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lines {
	public static void main(String[] args) {
		Scanner sc=null;
		File f=new File("file1.txt");
		 
		try {
			sc=new Scanner(f);
			int counter=0;
			while(sc.hasNextLine())
			{ 
				String s=sc.nextLine();
				System.out.println(s);
				counter++;
				
			}
			System.out.println(counter);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
