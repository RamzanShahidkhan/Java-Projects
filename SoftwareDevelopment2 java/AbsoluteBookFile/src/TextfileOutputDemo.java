import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextfileOutputDemo {

	public static void main(String[] args) {
		PrintWriter pw=null;
		
		try {
			pw=new PrintWriter(new FileOutputStream("stuff.txt",true));
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("error opening the file");
			System.exit(0);
			//e.printStackTrace();
		}
		System.out.println("writing to file");
		pw.println("the quick brown");
		pw.println("dildar kabutar");
		//pw.printf(wrwrr, uuuuu);
		pw.close();
		System.out.println("End of programe");
		
				

	}

}
