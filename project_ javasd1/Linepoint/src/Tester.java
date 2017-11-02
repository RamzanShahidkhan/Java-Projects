
public class Tester {

	public static void main(String[] args) {

//		Below, I create three line objects, using each of constructors
//		defined in the Line class. Can you figure out which two points
//		are associated with each line object, and what are their coordinates?
		Point p1 = new Point();
		Point p2 = new Point();
		Line line1 = new Line(p1, p2);

		Line line2 = new Line();

		Line line3 = new Line(2,3,4,5);

//		see the cascaded method calls below, and try to understand what happens
		line3.getP2().getX();
		line2.setP1(new Point(-2, 6));
		line1.getP1().setX(3);
	}
}