import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProject {
	private static String directoryPath;
	private static File f=null;
	private static FileWriter  fw=null;
	private static PrintWriter pw=null;
	private static BufferedWriter bw=null;
        
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
//		String path="[^0-9]:[\\[a-z[0-9]]] ";
//		Pattern p=Pattern.compile(path);
//		Matcher m=p.matcher(directoryPath);
		do
		{    
			System.out.println("enter directory Path it's a filePath");
		     directoryPath=sc.nextLine();	
		     f=new File(directoryPath);
		}
		while(!(f.isDirectory()));
		if(f.isHidden())
		{
			System.out.println("yes");
		}
		try 
		{
			//fw=new FileWriter(new File("content.txt"));
			//pw=new PrintWriter(new FileOutputStream("content.txt"));
			bw=new BufferedWriter(new FileWriter("content.txt"));
		} 
		catch (IOException e)
		{
			System.out.println("problem in writing on file");
		}
		   String[] nodes=f.list();
		   //File node= new File(nodes);
		  
		   
		   
		   System.out.println("Content are: ");
		   System.out.println(f.getPath());
		   bw.write("content are :");
		   bw.newLine();
		   bw.write(f.getPath());
		   bw.newLine();
		   bw.write("\tName "+"\t\t\t\t\t\t"+ "hidden "+"\t\t\t\t\t" + "Size( in kb) ");
		   bw.newLine();
			for(String s:nodes)
			{     
				bw.newLine();
				bw.write(s); 
				
//				bw.toString();
								
				System.out.println(s);
			}
		 
			bw.close();
	}
}
