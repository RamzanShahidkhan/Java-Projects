import java.awt.Graphics;
import java.util.ArrayList;

public class Line extends Shape {

	public Line(Point clickPoint) {
		super(clickPoint);
	}

	private ArrayList<Point> points = new ArrayList<Point>();

	public void draw(Graphics g){
		Point prevPoint = points.get(0);
		for(Point p: points){
			g.drawLine(prevPoint.getX(), prevPoint.getY(), p.getX(), p.getY());
			prevPoint = p;
		}
	}

}
