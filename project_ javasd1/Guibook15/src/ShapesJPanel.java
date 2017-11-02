import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapesJPanel  extends JPanel{
	//draw shape with java 2d API
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); //call super class paint component
		//this.setBackground(Color.white);
		Graphics2D g2d= (Graphics2D) g; //cast G to Graphics2D
		g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100, Color.YELLOW,true));
		g2d.fill(new Ellipse2D.Double(5,30,60,100));
		//draw 2D rectangle in red
		g2d.setPaint(Color.red);
		g2d.setStroke(new BasicStroke(10.0f));
		g2d.draw(new Rectangle2D.Double(80,30,60,100));
		// draw 2D rounded rectangle with  buffer background
		BufferedImage buff=new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
		//obtain Graphics2D from bufferImage and draw on it
		Graphics2D gg= buff.createGraphics();
		gg.setColor(Color.YELLOW);
		gg.fillRect(0, 0,  10, 10);
		gg.setColor(Color.BLACK);
		gg.drawRect(1, 1, 6, 6);
		gg.setColor(Color.BLUE);
		gg.fillRect(1, 1, 3, 3);
		gg.setColor(Color.RED);
		gg.fillRect(4, 4, 3, 3);
		//paint bufferimage on to the Frame
		g2d.setPaint(new TexturePaint(buff, new Rectangle(10,10)));
		//g2d.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
		g2d.fill(new RoundRectangle2D.Double(175, 30, 75, 100, 50, 50));
		
		//draw 2D pie shape in white
		g2d.setPaint(Color.orange);
		g2d.setStroke(new BasicStroke(10.0f));
		g2d.draw(new Arc2D.Double(260, 30, 75, 100, 0, 270, Arc2D.PIE));
		
		//draw 2D line in green and yellow
		g2d.setPaint(Color.green);
		g2d.draw( new Line2D.Double(410, 30, 350, 150));
		
		//draw 2D line using stroke 
		float[] dashes= {10};
		g2d.setPaint(Color.BLACK);
	  g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,10,dashes,0));
		g2d.draw(new Line2D.Double(340, 30, 400, 150));
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		JFrame f=new JFrame(" 2D shapes");
		ShapesJPanel panel=new ShapesJPanel();
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);

	}

}
