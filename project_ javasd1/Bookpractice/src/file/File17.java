package file;

import java.io.File;
import java.util.Scanner;

public class File17 {
	 public static void main(String [] args)
	 {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter file or directory name");
		 analysePath(input.nextLine());
	 }
		 public static void analysePath(String path)
		 
		 {
			 File name=new File(path);
			 if(name.exists())
			 {
				 System.out.printf("%s%s\n",name.getName(),"exists",
						 (name.isFile()? "is a file":"is not a file"),
						 (name.isDirectory()?"is a directory":"is not a directory"),
						 (name.isAbsolute()?"is absolute path":"is not absolute path"),
						 "last modified:",name.lastModified(),"length:",name.length(),
						 "path:",name.getPath(),"absolut path:",name.getAbsolutePath(),
						 "Parent:",name.getParent());
				 if(name.isDirectory())
				 {
					 String[] directory= name.list();
					 System.out.println("\n\n Directory content:\n");
					 for(String directoryName:directory)
					 System.out.println(directoryName);
					 
				 }
			 }
			 else 
			 {
				 System.out.printf("%s %s",path,"does not exist");
			 }
		 }
	 

}
