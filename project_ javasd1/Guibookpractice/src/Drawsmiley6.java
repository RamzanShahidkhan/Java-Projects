import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Drawsmiley6 extends JPanel{
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200,200);
		
		g.setColor(Color.black);
		g.fillOval(55, 65, 30,30);
		g.fillOval(135, 65, 30, 30);
		//mouth
		//g.setColor(Color.blue);
		g.fillOval(50, 110, 120, 65);
		//touch up the mouth into a smile
     	g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
		
		
	}
		public static void main(String [] args)
		{
			Drawsmiley6 panel=new Drawsmiley6();
			JFrame app=new JFrame();
			app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			app.add(panel);
			app.setSize(260, 260);
			app.setVisible(true);
			
			
			
		}
	

}
