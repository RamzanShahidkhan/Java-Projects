
public class Triangle extends Shape{

	private double base;
	private double height;
	
	public Triangle(double b, double h){
		base =b;
		height = h;
	}
	public Triangle(double b){
		base = b;
		height = b;
	}
	@Override
	public double getArea() {
		return (base*height)/2;
	}
	@Override
	public double getPerimeter() {
		return Math.sqrt((base*base)+(height*height))+base+height;
	}
	
	
}

//public String toString(){
//	return side+" ";
//	  
//  }
  
  

