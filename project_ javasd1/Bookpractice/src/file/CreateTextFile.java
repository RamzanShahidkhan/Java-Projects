package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private Formatter output; //object used to output text to file
	
	public void OpenFile()
	{
		try
		{
			output=new Formatter("client.txt");
		}
		catch(SecurityException security)
		{
			System.err.println("you don't have write acces to this file");
			
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			 System.err.println("Error opening or creating file");
			 System.exit(1);
		}
	}
	public void addRecord()
	{
		AccountRecord record=new AccountRecord();
		Scanner input=new Scanner(System.in);
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
				 "To terminate input, type the end-of-file indicator ",
				 "when you are prompted to enter input.",
				 "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				 "On Windows type <ctrl> z then press Enter" );
		System.out.printf("%s\n%s", "enter account no >0, fName, Lanme, and"," balance");
		
		while(input.hasNext())
		{
			try
			{
				record.setAccount(input.nextInt());
				record.setfName(input.next());
				record.setlName(input.next());
				record.setBalance(input.nextDouble());
			
			if(record.getAccount() > 0)
			{
				output.format("%d %s  %s  %.2f", record.getAccount(),record.getfName()
						,record.getlName(),record.getBalance());
			}
			else 
			{
				System.out.println("account no must be greater than 0");
				
			}
		  }
			catch(FormatterClosedException closed)
			{
				System.err.println("Error writing to file");
				return;
			}
			catch(NoSuchElementException element)
			{
				System.err.println("invalid input: try again");
				input.nextLine();
			}
			System.out.printf(" %s  %s %s","enter account no again","fName, lastNmae, balance","?");
			
		}
	}
	public void closeFile()
	{
		if(output!=null)
			output.close();
	}
	public static void main(String [] args)
	{
		CreateTextFile file=new CreateTextFile();
		file.OpenFile();
		file.addRecord();
		file.closeFile();
		
	}

}
