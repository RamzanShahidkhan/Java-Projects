import java.io.File;
import java.util.Scanner;

public class FindFile {
	public static String searchForFile(File dir,String target)
	{
		String result="";
		if(!dir.isDirectory())
			return "path is not directory";
		
		for(File folderItem:dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				result=searchForFile(folderItem, target);
				//return the result if it's not empty
				if(!result.equals(""))
					return result;
			}
			//if it's file check fot matches
			else
			{
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		//if we got here nothing was found
		
		return " ";
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file path");
		String in=sc.nextLine();
		File rootfolder=new File(in);
		String result=searchForFile(rootfolder, "content.txt");
		if(!result.equals(""))
			System.out.println(result);
		else
			System.out.println("file not found dear");

	}

}
