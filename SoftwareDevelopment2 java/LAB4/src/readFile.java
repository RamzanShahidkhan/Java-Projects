import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;

public class readFile {
	public static void main(String[] args) {
		
		File f=new File("Test.txt");
		File out=new File("src/Outputfile");
		Scanner sc=null;
		FileWriter fw=null;
		String data = "";
		try {
			int counter=0;
			 sc=new Scanner(f);
			 fw=new FileWriter(out);
			 while(sc.hasNextLine())
				{    
				   String s=sc.nextLine();
					   data+=s;
					counter++;
				}
			 String[] array = data.split(" "); 
			 for(int i=0; i<array.length; i++){
				 System.out.println(array[i]);
			 }
			 
//		        for (String val : array) {    
//		            frequency(array, val);
//		            System.out.println("Frequency of " + val + " " + freq);
//		        }
			 System.out.println("total words are="+counter);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
         catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
