package dildar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DPSWindow {
	
	public void readFile() throws FileNotFoundException
	{
		Scanner reader=new Scanner(new File("scheduleInput.txt"));
		
		while(reader.hasNext())
		{
			
		}
	}
	
	public void writeFile() 
	{
		PrintWriter writer;
		try {
			writer = new PrintWriter(new File("windowOutput.csv"));
			writer.println("House No,Price,1Jan,1Feb,1Mar,1Apr,1May,1Jun,1July,round1");
			System.out.println("show data in windowOutput file");
			
			for(int i=12; i<= 1000; i++)
			{
				writer.println(toString().valueOf(i));
			}
			writer.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("error in writing on file");
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		DPSWindow dp=new DPSWindow();
		dp.writeFile();

	}

}
