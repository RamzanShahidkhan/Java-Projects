import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCheck {
	

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try
		{   
			System.out.println("enter file path!");
		     String f=sc.nextLine();
		     File name= new File(f);
		     
		}
		catch(FileNotFoundException e)
		{
			
		}
		

	}

}
