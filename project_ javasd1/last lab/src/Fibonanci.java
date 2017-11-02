import java.util.Scanner;

public class Fibonanci {
	private static int num;
	private int sum=0;
	private int f1=0;
	private int f2=1;
	public Fibonanci()
	{ 
	}
	public int fibonanci()
	{
		if(num==f1)
			return 0;
		else if(num==f2)
			return 1;
		else
		{
			for(int i=2; i<=num; i++)
			{
			      sum=f1+f2;
			      f1=f2;
			      f2=sum;
			}
		}
		return sum;
		
	}


	public static void main(String[] args) {
		Fibonanci F=new Fibonanci();
		Scanner input=new Scanner(System.in);
		System.out.println("how many numbers: ");
		 num=input.nextInt();
		 int i=0; 
		 System.out.println("fibonancci numbers are= "+F.fibonanci());
		
		 
		

	}

}
