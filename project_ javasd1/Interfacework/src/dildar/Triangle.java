package  dildar;
public class Triangle implements Shape{

	private double base;
	private double height;

	public Triangle(double b) {
		base = b;
		height = b;
	}
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	public double area(){
		return Math.round(((base*height)/2)*100)/100.0;
	}

	public double perimeter(){
		return Math.round((Math.hypot(base, height)
				+ base + height)*100)/100.0;
	}

	public String toString(){
		return "Triangle,"+ base + "," + height +"," + perimeter() + "," + area();
	}
}