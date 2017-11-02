import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {
	
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(new Color(255,0,0));
		g.fillRect(15, 25, 100, 20);
		g.drawString("Current RGB: "+ g.getColor(), 130, 40);
		//g.drawRect(15, 50, 100, 20);   // empty rectangle
		//g.clearRect(15, 25,100, 30); // remove the existing rectangle
		
		//set new drawing colors using float
		g.setColor(new Color(.50f,.75f,.0f));
		g.fillRect(15, 50, 100, 20);
		g.drawString("Current RGB: "+ g.getColor(), 130, 65);
		
		//set new drawing colors using static colors object
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("Current RGB: "+ g.getColor(), 130, 90);
		// display individual RGB values
		Color color=Color.MAGENTA;
		g.setColor(color);
		g.fillRect(15, 100, 100, 20);
		g.drawString("current RGB: "+color.getRed()+","+color.getGreen()+","+color.getBlue(),130,115);
	}
	public static void main(String [] args)
	{
		JFrame frame=new JFrame("Using  Colors..");
		ColorJPanel panel=new ColorJPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(500,380);
		frame.setVisible(true);
	}

	
}
