
public class Circle extends Shape {
	private double radius;
	public Circle()
	{
	}
	public Circle(double r)
	{
		radius=r;	
	}
	public double getArea()
	{
		return Math.PI*(radius*radius);
	}
	public double getPerimeter()
	{
		return Math.PI*2*radius ;
	}
//	public String toString()
//	{
//		return   radius+",,"+"\n"+" "+getPerimeter()+"\n"+getArea();
//	}
	

}
