import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolygonJPanel extends JPanel {
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		// draw polygon with polygon's object 
		int[]  xValues={20,40,50,30,20,15};
		int[]  yValues={50,50,60,80,80,60};
		Polygon polygon=new Polygon(xValues, yValues, 6);
		g.drawPolygon(polygon);
		// draw polygon with arrays
		int [] xValues2={70,90,100,80,70,65,60};
		int[] yValues2={100,100,110,110,130,110,90};
		g.drawPolyline(xValues2, yValues2, 7);
	//fill polygon with arrays
		int[] x3={120,140,150,190};
		int[] y3={40,70,80,60};
		g.fillPolygon(x3, y3, 4);
		// with polygon object  
		Polygon poly2=new Polygon();
		poly2.addPoint(165, 135);
		poly2.addPoint(175,160);
		poly2.addPoint(270,200);
		poly2.addPoint(200,220);
        poly2.addPoint(130, 180);
         g.fillPolygon(poly2);
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Draw Ploygon;;");
		PolygonJPanel panel=new PolygonJPanel();
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);
		

	}

}
