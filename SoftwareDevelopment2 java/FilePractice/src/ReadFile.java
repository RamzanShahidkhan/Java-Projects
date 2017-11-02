import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
	
    private Scanner input; // object used to output text to file
	
	public void  OpenFile()
	{
		try {
			input=new Scanner(new File("src/clients.txt"));
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("error opening file");
			System.exit(1);
			//e.printStackTrace();
		}
	}
	public void readrecord()
	{
		AccountRecord record=new AccountRecord();
		System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
			             "First Name", "Last Name", "Balance" );
		 while(input.hasNext())
		 {
			 try
			 {
				 record.setAccount(input.nextInt());
				 record.setfName(input.nextLine());
				 record.setlNmae(input.nextLine());
				 record.setBalance(input.nextDouble());
				// display record contents
				 System.out.printf( "%-10d%-12s%-12s%10.2f\n",
				 record.getAccount(), record.getfName(),
				 record.getlNmae(), record.getBalance() );
				 //input.close(); 
			 }
			 
			 catch (NoSuchElementException ex) 
			 {
				System.out.println("file improperly formed");
				input.close();
				System.exit(1);
			}
			 catch ( IllegalStateException stateException )
			 {
			   System.err.println( "Error reading from file." );
			   System.exit( 1 );
			  } // end catch
			 
		 }
	}
		 public void closeFile()
		 {
			 if(input!=null)
				input.close();
		 }
	public static void main(String[] args) {
		{
			 ReadFile rf=new ReadFile();
			
			 rf.OpenFile();
			 rf.readrecord();
			 rf.closeFile();
			 } // end main	
	}
}
