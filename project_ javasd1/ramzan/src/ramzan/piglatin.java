package ramzan;

import java.util.Scanner;

public class piglatin {
 public static void main(String [] args)
 {
	 Scanner input=new Scanner(System.in);
	 String s=input.nextLine();
	 //System.out.println("length is :%d\n"+ s.length());
	 String[] tokens= s.split( " " );
	 
	 for(int i=0; i<=tokens.length-1; i++)
	 {
       System.out.print(tokens[i].substring(1));
	   System.out.println( s.charAt(i)+"ay" );
		
	   // System.out.println( tokens[i] );
	 }
	 
	 
 }
}