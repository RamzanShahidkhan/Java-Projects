import java.util.Scanner;

public class Sum{
	 private static int n;
	 private static int m;
    private static int sum;
   public static void main(String [] args)
     {
	   Scanner input=new Scanner(System.in);
	  
	   try
	    {
		   System.out.println("enter first num");
	       n=input.nextInt();
		   System.out.println("enter 2nd num");
	       m=input.nextInt();
	       sum=n+m;
		    System.out.println("sum is  " +sum);
	    }
	    
	   catch(Exception e)
	    {
		   System.out.println("hosla kar masari");
		   e.getStackTrace();
		   //System.exit(0);  
	    }
// 	     sum=n+m;
//	    System.out.println("sum is  " +sum);
	   input.nextLine();
     }
}
