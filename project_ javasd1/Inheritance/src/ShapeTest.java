
public class ShapeTest {
	public static void main(String [] args)
	{
		Circle c=new Circle();
		Shape s=new Shape();
		Rectangle r=new Rectangle(2,4);
		Square sq=new Square();
		System.out.println("circle "+c);
		System.out.println("Shape " +s);
		System.out.println("Rectangle "+ r);
		System.out.println("Square " +sq);
		s=c;
		System.out.println("after poly"+s);
	}

}
