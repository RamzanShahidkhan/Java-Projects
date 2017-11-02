package Recursion;

import java.math.BigInteger;

public class FibonacciCalculator {
	private static BigInteger Two=BigInteger.valueOf(2);
	public static BigInteger fibonacc(BigInteger number)
	{
		if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
			return number;
		else
			return fibonacc(number.subtract(BigInteger.ONE)).add(fibonacc(number.subtract(Two)));
	}

	public static void main(String[] args) {
		for(int c=0; c<=20; c++)
		{
			System.out.printf("Fibonacc of %d is: %d\n",c,fibonacc(BigInteger.valueOf(c)));
		}

	}

}
