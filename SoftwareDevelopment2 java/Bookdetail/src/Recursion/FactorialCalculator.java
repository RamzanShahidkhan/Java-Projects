package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
	private static int i=1,s=1;
	public static BigInteger factorial(BigInteger number)
	{
		if(number.compareTo(BigInteger.ONE ) <=0)
			return BigInteger.ONE;
		else
			return number.multiply(
					factorial(number.subtract(BigInteger.ONE)));
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
//		int num=input.nextInt();
//		factorial(num);
		//System.out.println("sum is " +fact(num));
		for(int i=0; i<=50; i++)
		{
			System.out.printf(" %d! = %d\n",i,factorial(BigInteger.valueOf(i)));
		}	
//		for(int i=num; i>=1; i--)
//		{
//			sum=sum*i;
//		}
//		System.out.println("sum is " +sum);

	}

}

	