import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BuffWriteDemo {

	public static void main(String[] args) {
		BufferedReader inbuff=null;
		PrintWriter pw=null;
		
		try {
			inbuff=new BufferedReader(new FileReader("original.txt"));
			pw=new PrintWriter(new FileOutputStream("numbered.txt"));
			String line=inbuff.readLine();
			int c=0;
			while(line!=null)
			{  
				c++;
				pw.println(c+"   " +line);
				line=inbuff.readLine();
				
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("error opening the file");
			System.exit(0);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error reading from file");
		}
		System.out.println("writing to file");
		//pw.printf(wrwrr, uuuuu);
		pw.close();
		
		
				

	}

}
