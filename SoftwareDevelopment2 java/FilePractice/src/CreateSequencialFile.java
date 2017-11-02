import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

	public class CreateSequencialFile {
		private ObjectOutputStream output; // object used to output text to file
		
		public void  openFile()
		{
			try {
				output=new ObjectOutputStream(new FileOutputStream("client.ser"));
			} 
			
			catch (IOException e)
			{
				System.err.println("error opening file");
				//e.printStackTrace();
			}
		}
		public void addrecord()
		{
			//AccountRecord record=new AccountRecord();
			AccountRecordSerializable record; // object to be written to file
			 int account = 0; // account number for record object
			 String fName; // first name for record object
			 String lName; // last name for record object
			 double balance; // balance for record object
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
					 account = input.nextInt(); // read account number
					 fName = input.next(); // read first name
					 lName = input.next(); // read last name
					 balance = input.nextDouble(); // read balance
					 if(account>0)
					 {
						 record=new AccountRecordSerializable(account, fName, lName, balance);
						 output.writeObject(record);
						 
					 }
					 else
					 {
						 System.out.println("account num must be >0");
					 }
				 
					 
				 }
				 catch(IOException io)
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
				 try{
				 if(output!=null)
					 output.close();
				 }
				 catch(IOException io)
				 {
					 System.err.println("Error closing file ");
					 System.exit(1);
				 }
					 
			 }
			
		
		public static void main(String[] args)
		{
			{
				 CreateSequencialFile application = new CreateSequencialFile();
				
				 application.openFile();
				 application.addrecord();
				 application.closeFile();
			} // end main
			
		}

	}



