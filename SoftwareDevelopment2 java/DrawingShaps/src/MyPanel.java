import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	ArrayList<Shape> shapes = new ArrayList<>();

	public void addShape(Shape s){
		shapes.add(s);

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for(Shape s: shapes)
			s.draw(g); // polymorphic call
	}
}