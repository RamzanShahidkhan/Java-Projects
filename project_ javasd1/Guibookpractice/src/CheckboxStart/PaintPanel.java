package CheckboxStart;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int pointCount=0; // count number of points
	
	private Point[] points=new Point[1000];
	public PaintPanel()
	{
		addMouseMotionListener(
				new MouseMotionAdapter()
				{
					public void mouseDragged(MouseEvent event)
					{
						if(pointCount<points.length)
						{
							points[pointCount]=event.getPoint();  //find point
							++pointCount;
							repaint(); //repaint JFrame
							
						}
					}
				}
				);
	}
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); //clear drawing area
		for(int i=0; i<pointCount; i++)
		{
			g.fillOval(points[i].x, points[i].y, 14,14);
		}
		
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Simple drawing paint");
		PaintPanel panel=new PaintPanel();
		f.add(panel, BorderLayout.CENTER);
		f.add(new JLabel("Drag the mouse to draw:"),BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);

	}

}
