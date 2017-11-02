import java.awt.Graphics;

public class Shape {

	private Point vertexPoint;

	public Shape(Point clickPoint){
		vertexPoint = clickPoint;
	}

	public Point getVertexPoint(){
		return vertexPoint;
	}

	public void draw(Graphics g){
		// empty definition
	}
}
