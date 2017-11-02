
import java.io.File;
import java.util.Scanner;

public class Directory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file ");
		File f=new File(sc.nextLine());
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isAbsolute());
		System.out.println();
		System.out.println(f.getAbsolutePath());
		String[] nodes=f.list();
		for(String s:nodes)
		{
			System.out.println(s);
		}

	}

}
