import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UsingFile {

	public static void main(String[] args) {
		//System.out.print("sddd");
		PrintWriter pw=null;
		BufferedWriter bw=null;
		FileWriter fw=null;
		File f=new File("Testingfile");
		try {
			fw=new FileWriter(f,true);
			bw=new BufferedWriter(new FileWriter(f));
			pw=new PrintWriter(new FileOutputStream(f,true));		
//			pw.print("lkj"+23);
//			pw.print("6565656");
//			pw.print("jkshgjkkgjhk");
			//pw.close();
			fw.append("ki");
			//pw.print(56);
			//pw.append("ty");
			
			pw.flush();
//			System.out.println(System.in.read());
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Scanner sc=null;
		
		try
		{
			sc=new Scanner(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(sc.nextLine());
		
//		pw.print("\n ttttttttttttt");
//		pw.flush();
//		System.out.println(sc.hasNextLine());
//		System.out.println(sc.nextLine());
		

	}

}
