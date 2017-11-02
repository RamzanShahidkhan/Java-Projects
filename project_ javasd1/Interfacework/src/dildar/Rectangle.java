package  dildar;
public class Rectangle implements Shape{

	private double length;
	private double width;

	public Rectangle(double l) {
		length = l;
		width = l;
	}

	public Rectangle(double l, double w){
		length = l;
		width = w;
	}

	public double area(){
		return Math.round((length*width)*100)/100.0;
	}

	public double perimeter(){
		return Math.round(((length+width)*2)*100)/100.0;
	}

	public String toString(){
		return "Rectangle,"+ length + "," + width +"," + perimeter() + "," + area();
	}
}
