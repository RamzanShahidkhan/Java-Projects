import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileClassDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=null;
		String fileName=null;
		System.out.println("I wil store a line of texxt");
		System.out.println("Enter the line of text:");
		line=sc.nextLine();
		System.out.println("enter a file name to hold the line");
		fileName=sc.nextLine();
		File fob=new File(fileName);
		while(fob.exists())
		{
			System.out.println("There is already a file" +fileName);
			System.out.println("enter a different file name");
			fileName=sc.nextLine();
			fob=new File(fileName);
			
		}
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(new FileOutputStream(fileName));
		}
		catch (FileNotFoundException e) {
			System.out.println("error opening the file" +fileName);
			System.exit(0);
		}
		System.out.println("writing\""+ line +"\"");
		System.out.println("To the file "+fileName);
		pw.println(line);
		pw.close();
		System.out.println("writing completed");
		
	}

}
