import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	private int radius = 20;

	public Circle(Point clickPoint) {
		super(clickPoint);
	}

	@Override
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(getVertexPoint().getX()-radius,
				getVertexPoint().getY()-radius, radius*2, radius*2);
	}
}
