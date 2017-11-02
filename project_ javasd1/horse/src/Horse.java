

public class Horse {
	protected String  color;
	protected double spmile;
	protected double  xposition=0.0;
	protected double yposition=0.0;
	public Horse()
	{
		this.color="Black";
		this.spmile=0;
//		this.xposition=0;
//		this.yposition=0;
	}
	public void move(String direction, int minute)
	{
		if(direction.equals("Right") || direction.equals("Left"))
		{  
			xposition+=spmile*minute/60;
			
		}
		else if(direction.equals("Up") || direction.equals("Down"))
		{
			yposition+=spmile*minute/60;
			
		}
	}
	
	public double getY()

	{
		return yposition;
	}
	public double getX()

	{
		return xposition;
	}

}
