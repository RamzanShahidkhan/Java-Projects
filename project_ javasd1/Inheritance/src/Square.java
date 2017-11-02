
public class Square extends Rectangle {
	private double side;

	public Square(){
		width=side;
		length=side;
	}
  public Square(double side)
  {
	  length=side;
//	  setWidth(side);
//	  setLength(side);
  }
  public Square(double side,String color,boolean filled){
	  setColor(color);
	  setFilled(filled);
	  length=side;
	  
  }
  public void setSide( double side){
	  this.side=side;
  }
  public double getSide()
  {
	return side;
	  
  }
  @Override
  public void setWidth(double side)
  {
	  setWidth(side);
  }
  public void setLength(double side){
	  setLength(side);
  }
  public String toString(){
	return side+" ";
	  
  }
  
  
}
