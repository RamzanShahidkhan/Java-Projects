import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpeciesRecord {

	public static void main(String[] args) {
		FileWriter pw=null;
		
		try
		{
			pw=new FileWriter( "src/specie.txt");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("file is not find jni");
			System.exit(0);
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Species onerecord=new Species("ramzan",27,0.02);
		try {
			pw.write(onerecord.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		//pw.write(onerecord);
		System.out.println("programe end");
		System.out.println(onerecord.toString());
		try {
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
