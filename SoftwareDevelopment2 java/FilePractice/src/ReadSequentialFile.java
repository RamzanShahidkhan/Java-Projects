import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSequentialFile {
	private ObjectInputStream input;
	
	public void  openFile()
	{
		try {
			input=new ObjectInputStream(new FileInputStream("client.ser"));
		} catch (IOException e) {
			System.err.println("erroe opening file");
			
		}
		
	}
	public void readRecord()
	{
		AccountRecordSerializable record;
		 System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
		 "First Name", "Last Name", "Balance" );
		 
		 while (true)
		 {
			 try {
				record = ( AccountRecordSerializable ) input.readObject();
			
			 System.out.printf( "%-10d%-12s%-12s%10.2f\n",
			 record.getAccount(), record.getfName(),
			 record.getlNmae(), record.getBalance() );
			 }
			 catch(EOFException eof)
			 {
				 return; //end of file reached
			 }
			 catch (ClassNotFoundException e)
			 {
					System.err.println("unable to create file");
					//e.printStackTrace();
			 }
			 catch (IOException io) 
			 {
				System.err.println("error during read from file");
			}
		 }
	}
	public void closeFile()
	{
		try
		{
			if(input!=null)
			{
				input.close();
			}
		}
		catch(IOException io)
		{
			System.err.println("error closing file");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		ReadSequentialFile f=new ReadSequentialFile();
		f.openFile();
		f.readRecord();
		f.closeFile();
	}

}
