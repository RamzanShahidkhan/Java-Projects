
public class Circle extends Shape {
	private double radius=1.0;
	public Circle()
	{
	}
	public Circle(double r)
	{
		radius=r;
	}
	public Circle(double r,String color,boolean filled)
	{
		
		super(color,filled);
		
		radius = r;
	}
	public void setradius(double r)
	{
		radius=r;
	}
	public double getradius()
	{
		return radius;
	}
	public double getArea()
	{
		return Math.PI*(radius*radius);
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius ;
	}
	public String toString()
	{
		return   radius+" "+"\n"+getArea()+"\n"+" "+getPerimeter();
	}
	

}
