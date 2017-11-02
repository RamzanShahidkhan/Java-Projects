import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Createtextfile {
	private Formatter output; // object used to output text to file
	
	public void  openFile()
	{
		try {
			output=new Formatter("clients.txt");
		} 
		catch(SecurityException s)
		{
			System.out.println("you dont have write acces to this file");
			System.exit(1);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("error opening file");
			System.exit(1);
			//e.printStackTrace();
		}
	}
	public void addrecord()
	{
		AccountRecord record=new AccountRecord();
		Scanner input=new Scanner(System.in);
		System.out.printf( "%s\n%s\n%s\n%s\n\n",
				 "To terminate input, type the end-of-file indicator ",
				 "when you are prompted to enter input.",
				 "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				 "On Windows type <ctrl> z then press Enter" );
		System.out.printf( "%s\n%s",
				 "Enter account number (> 0), first name, last name and balance.",
				 "? " );
		 while(input.hasNext())
		 {
			 try
			 {
				 record.setAccount(input.nextInt());
				 record.setfName(input.nextLine());
				 record.setlNmae(input.nextLine());
				 record.setBalance(input.nextDouble());
				 if(record.getAccount()>0)
				 {
					 System.out.printf("%d %s %s %.2f\n",record.getAccount(),record.getfName()
							 ,record.getlNmae(),record.getBalance());
				 }
				 else
				 {
					 System.out.println("account num must be >0");
				 }
			 
				 
			 }
			 catch(FormatterClosedException fce)
			 {
				 System.out.println("error writing to file");
				 return;
			 }
			 catch (NoSuchElementException ex) 
			 {
				System.out.println("invalid input,plz try again");
				input.nextLine();
			}
			 System.out.printf( "%s\n%s",
					 "Enter acc num (> 0), first name, last name and balance.",
					 "? " );
			 
		 }
	}
		 public void closeFile()
		 {
			 if(output!=null)
				 output.close();
		 }
		
	
	public static void main(String[] args) {
		{
			 Createtextfile application = new Createtextfile();
			
			 application.openFile();
			 application.addrecord();
			 application.closeFile();
			 } // end main
		
	}

}
