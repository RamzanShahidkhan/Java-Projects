
public class Circle {
	private double r;
	private String color ="red";
	//private double area;
	private String toString;
	public Circle()
	{
	
	}
	public Circle(int r)
	{
		this.r=r;
		
	}
	public void setradius(double r)
	{
		this.r=r;
	}
	public double getr()
	{
		return r;
	}
	
	
	public double getArea()
	{
		return Math.PI*(r*r);
	}
	public String toString()
	{
		return color +getArea()+" "+ r;
		
	}
	
	
	

}
