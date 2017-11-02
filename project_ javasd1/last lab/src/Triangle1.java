import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle1
{
 	private double base;
 	private double height;
 	private double hyp;
	public Triangle1(double b, double h,double hy) {
		base = b;
		height = h;
		hyp=hy;
	}
	public double Hypotenuse()
	{
		return (Math.hypot(base, height));
		
	}
	public double sum()
	{
		return base+height;
		
	}
	public String compete()
	{
		if(sum()>Hypotenuse())
		{
			System.out.println("sides reperesent right triangle");
		}
		else
			System.out.println("none triangle");
		return null;
	}
	@Override
	public String toString() {
		return "base"+","+"height"+","+"hypp" +","+base+","+height+","+hyp;
	}
	
 	
}