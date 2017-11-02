import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferInputDemo {

	public static void main(String[] args) {
		BufferedReader inbuff=null;
		
		try 
		{
			inbuff=new BufferedReader(new FileReader("buff.txt"));
			String line=inbuff.readLine();
			/*
			char next = 0;
			int c=0;
			while(line!= null)
			{  c++;
				System.out.println(c+" = "+line);
				line=inbuff.readLine();
				// next= (char)(inbuff.read());
				
			}*/
			System.out.println("1st line read from the file is ");
			System.out.println(line);
			line=inbuff.readLine();
			System.out.println("2nd line read from the file is ");
			System.out.println(line);
			
			//System.out.println(next);
			inbuff.close();	
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("error in finding file");
		} 
		catch (IOException e)
		{ 
			System.out.println("error from reading file from the file");
			
		}
		

	}

}
