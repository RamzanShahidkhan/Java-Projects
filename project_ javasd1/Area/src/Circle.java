
public class Circle {
	private int radius=4;
	public Circle(int radius)
	{
		this.radius=radius;
	}
  public int getRadius()
  {
	  return radius;
  }
  public double getArea()
  {
	  return Math.PI*Math.pow(radius, 2);
  }

}
