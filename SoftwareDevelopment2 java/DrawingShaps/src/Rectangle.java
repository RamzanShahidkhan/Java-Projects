import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private int width = 40;
	private int height = 30;

	public Rectangle(Point clickPoint) {
		super(clickPoint);
	}

	@Override
	public void draw(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(getVertexPoint().getX(),
				getVertexPoint().getY(), width, height);
	}
}
