
public class Shape {
	private String color="red";
	private boolean filled=true;
	public Shape()
	{
		//color="green";
		//filled=true;
	}
	public Shape (String g,boolean filled)
	{
		color=g;
		this.filled=filled;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public boolean getFilled()
	{
		return filled;
		
	}
	public String toString()
	{
		return color+" "+ filled;
		
	}

}
