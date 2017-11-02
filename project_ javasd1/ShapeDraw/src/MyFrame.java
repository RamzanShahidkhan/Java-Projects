import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("Basic Shape Drawing");
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);

		MyShapeButton circleButton = new MyShapeButton("circle.png");
		MyShapeButton rectangleButton = new MyShapeButton("rectangle.png");
		MyShapeButton triangleButton = new MyShapeButton("triangle.png");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(circleButton);
		buttonGroup.add(rectangleButton);
		buttonGroup.add(triangleButton);

		toolBar.add(circleButton);
		toolBar.add(rectangleButton);
		toolBar.add(triangleButton);
		add(toolBar, BorderLayout.NORTH);

		MyPanel drawingPanel = new MyPanel();
		drawingPanel.setBackground(Color.YELLOW);
		drawingPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Point clickPoint = new Point(e.getX(), e.getY());
				Shape shape = null;
				if(circleButton.isSelected())
					shape = new Circle(clickPoint);
				if(rectangleButton.isSelected())
					shape = new Rectangle(clickPoint);
				if(triangleButton.isSelected())
					shape = new Triangle(clickPoint);
				if(shape!=null){
					drawingPanel.addShape(shape);
					drawingPanel.repaint();
				}
			}
		});

		add(drawingPanel);

		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
