

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {
	private int diameter=10;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(10, 10, diameter, diameter);
	}
	public void setDiameter(int newD)
	{
		diameter= (newD>=0 ? newD:10);
		repaint();
	}
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}


}
