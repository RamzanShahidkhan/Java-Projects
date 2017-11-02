import java.util.Scanner;

public class TestArea {
	
public static void main(String [] args)
{
	Scanner input= new Scanner(System.in);
	System.out.println("how many shapes");
	    int  n=input.nextInt();
	    
	for  (int i=0; i<n; i++)
	{
		  System.out.println("put character");   
			if (input.next().charAt(0)=='c')
			{ 
				System.out.println("put radius =");
				int radius=input.nextInt();
				Circle a=new Circle(radius);
			 System.out.println("circle area is "+a.getArea());
			}
			System.out.println(" again put character for s");   
			 if (input.next().charAt(0)=='s')
			{
				System.out.println(" length =");
				int length=input.nextInt();
				Square s=new Square(length);
			 System.out.println("Square area is"+s.getArea());
			}
		    System.out.println(" again put character for t");   
		     if (input.next().charAt(0)=='t')
		    {
		    	System.out.println(" base=");
		    	n=input.nextInt();
		    	System.out.println("height");
		    	n=input.nextInt();
		    	Triangle t=new Triangle(n, n);
		    	System.out.println(t.getArea());
		    }
	}
}
}
