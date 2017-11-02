import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ArcsJPanel extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//start at 0 and sweeps at 360
		g.setColor(Color.RED);
		g.drawRect(15, 35, 80, 80);
		g.setColor(Color.BLACK);
		g.drawArc(15, 35, 80, 80, 0, 360);
		//starts at 0 and sweep at 110
		g.setColor(Color.RED);
		g.drawRect(100, 35, 80,80);
		g.setColor(Color.black);
		g.drawArc(100, 35, 80, 80, 0, 110);
		//starts at 0 and sweeps at -270
		g.setColor(Color.RED);
		g.drawRect(185, 35, 80, 80);
		g.setColor(Color.BLACK);
		g.drawArc(185, 35, 80, 80, 0, -270);
		//start at 0 and sweep at 360
		g.fillArc(15, 120,80, 40, 0, 360);
		//start at 270 and sweep at -90
		g.fillArc(100, 120, 80, 40, 270, -90);
		//start at 0 and sweep at 270
		g.fillArc(185, 120, 80,40, 0, 270);
	}
	

	public static void main(String[] args) {
		JFrame f=new JFrame(" DrawArcs...");
		ArcsJPanel panel=new ArcsJPanel();
		f.add(panel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}

}
