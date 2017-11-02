import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shape2JPanel extends JPanel {
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Random random=new Random();
		int[]  xPoints={55,67,109,73,83,55,27,37,1,43};
		int[] yPoints={0,36,36,54,96,72,96,54,36,36};
		Graphics2D  gg= (Graphics2D) g;
		GeneralPath path=new GeneralPath();
		path.moveTo(xPoints[0], yPoints[0]);
		for(int c=1; c< xPoints.length; c++ )
			path.lineTo(xPoints[c], yPoints[c]);
		path.closePath(); // close the shape
		gg.translate(150, 150); //translate the origin to 150  150
		//round around origin and draw star in random color
		for(int c=1; c<= 20; c++)
		{
			gg.rotate(Math.PI/10);
		
		//set random color
		gg.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
		gg.fill(path);
		}
	}

	public static void main(String[] args) {
		JFrame f=new JFrame(" Drawing 2D shape");
		Shape2JPanel p=  new Shape2JPanel();
		f.add(p);
		f.setBackground(Color.WHITE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,400);
		f.setVisible(true);
		
		

	}

}
