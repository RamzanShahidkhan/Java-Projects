import java.util.Scanner;

public class compare {
 public static void main (String [] args)
 {
	 Scanner input =new Scanner(System.in);
	System.out.printf("Enter first string:\n");
	 String s1=input.nextLine();
	//String s1="hello";
	
	 System.out.printf("Enter 2nd string:\n");
	 String s2=input.nextLine();
	
	 if(s1.regionMatches(0, s2, 0, 5))
		 System.out.println("first 5 character of s1 and s2 match");
	
	 else
		 System.out.println("first 5 character of s1 and s2 do not match"+"\n");
	//regionMatches (ignore case)
	 if(s1.regionMatches(true,0, s2, 0, 5))
		 System.out.println("first 5 character of s1 and s2 match with case ignore");
	
	 else
		 System.out.println("first 5 character of s1 and s2 do not match ");
	
 }
}
