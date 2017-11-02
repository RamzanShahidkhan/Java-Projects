package Chapter3;

import java.math.BigInteger;

public class BigRational {
	private BigInteger num; // only this can be neg
	private BigInteger den; // never negative
	public static final BigRational ZERO=new BigRational();
	public static final BigRational ONE = new BigRational("1");
	
	public BigRational()
	{
		this(BigInteger.ZERO);
	}
	public BigRational(BigInteger n)
	{
		this(n, BigInteger.ONE);
	}
	public BigRational(BigInteger n, BigInteger d)
	{
		num=n;
		den=d;
		check00(); fixSigns();
		reduce();
		
	}
	public BigRational(String str)
	{
		if (str.length() == 0)
			throw new IllegalArgumentException("Zero length string");
		// check for '/'
		int slashIndex = str.indexOf('/');
		if(slashIndex == -1)
		{
			num = new BigInteger(str.trim());
			den= BigInteger.ONE; // no denominator.. use 1
		}
		else
		{
			num = new BigInteger(str.substring(0,slashIndex).trim());
			den = new BigInteger(str.substring(slashIndex+1).trim());
			check00(); fixSigns(); reduce();
		}
	}
	private void check00()
	{
		
	}
	private void fixSigns()
	{
		
	}
	private void reduce()
	{
		
	}
	public BigRational abs()
	{
		return new BigRational(num.abs(),den);
	}
	public BigRational negate()
	{
		return new BigRational(num.negate(), den);
	}
	

}
