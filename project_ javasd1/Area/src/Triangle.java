
public class Triangle {
	private int Base;
	private int height;
	public Triangle(int Base, int height)
	{
		this.Base=Base;
		this.height=height;
	}
	public double getBase()
	{
		return Base;
	}
	public double getHeight()
	{
		return height;
	}
	public double getArea()
	{
		return (Base*height)/2;
	}

}
