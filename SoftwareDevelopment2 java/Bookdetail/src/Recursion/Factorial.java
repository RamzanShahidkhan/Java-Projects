package Recursion;
import java.util.Scanner;

public class Factorial {
	private static int i=1,s=1;
	public static int fact(int num)
	{
		if(num<=1)
			return 1;
		else
			return num*fact(num-1);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");
		int num=input.nextInt();
		fact(num);
		System.out.println("sum is " +fact(num));
		for(int i=0; i<=num; i++)
		{
			System.out.printf(" %d! = %d\n",i,fact(i));
		}
		
		
//		for(int i=num; i>=1; i--)
//		{
//			sum=sum*i;
//		}
//		System.out.println("sum is " +sum);

	}

}
