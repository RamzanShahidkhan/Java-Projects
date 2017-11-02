package  dildar;
public class Circle implements Shape{

	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public double area(){
		return Math.round((Math.PI*radius*radius)*100)/100.0;
	}

	public double perimeter(){
		return Math.round((2*Math.PI*radius)*100)/100.0;
	}

	public String toString(){
		return "Circle,"+ radius + ",-," + perimeter() + "," + area();
	}
}
