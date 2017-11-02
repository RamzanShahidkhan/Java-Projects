import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("Basic Shape Drawing");
		JMenuBar menuBar = new JMenuBar();
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);

		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);

		MyShapeButton circleButton = new MyShapeButton("Resources/circle.png");
		circleButton.setToolTipText("Draw a Circle");
		MyShapeButton rectangleButton = new MyShapeButton("Resources/rectangle.png");
		MyShapeButton triangleButton = new MyShapeButton("Resources/triangle.png");

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
			Shape shape = null;
			@Override
			public void mouseClicked(MouseEvent e) {
				Point clickPoint = new Point(e.getPoint().x, e.getPoint().y);
				if(circleButton.isSelected())
					shape = new Circle(clickPoint);
				if(triangleButton.isSelected())
					shape = new Triangle(clickPoint);
				if(rectangleButton.isSelected())
					shape = new Rectangle(clickPoint);
				drawingPanel.addShape(shape);
				drawingPanel.repaint();
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
