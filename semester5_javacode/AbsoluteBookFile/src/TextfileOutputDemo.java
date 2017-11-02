import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextfileOutputDemo {

	public static void main(String[] args) {
		PrintWriter pw=null;
		
		try {
			// true argument is used to append the new content with old 
			pw=new PrintWriter(new FileOutputStream("stuff.txt",true));		
		} 
		catch (FileNotFoundException e) {
			System.out.println("error opening the file");
			System.exit(0);
			//e.printStackTrace();
		}
		System.out.println("writing to file");
		pw.println("the quick brown lnmethod");
		pw.println("dildar kabutar without ln");
		pw.printf("with printf method");
		pw.println(123);
		pw.append("append sequence");
		pw.append('t');
		pw.println();
		pw.write("fffffffff write  ");
		pw.append('t');
		pw.close();
		
		System.out.println("End of programe");
	}
}
