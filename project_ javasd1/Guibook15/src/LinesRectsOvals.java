import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinesRectsOvals extends JPanel {
	public void paintComponent(Graphics g)
	{   
		super.paintComponent(g);
		this.setBackground(Color.yellow);
		g.setColor(Color.red);
		g.drawLine(20, 20, 300, 20);
		
		g.setColor(Color.BLUE);
		g.drawRect(20, 40, 150, 50);
		g.fillRect(20, 100, 150, 50);
		
		//g.setColor(new Color(34,56,78));
		g.setColor(Color.BLACK);
		g.fillRoundRect(20, 160, 150, 50, 50, 50);
		g.drawRoundRect(20, 220, 150, 50, 50, 50);
		
		g.setColor(Color.green);
		g.draw3DRect(240,40 , 180, 50, true);
		g.fill3DRect(240, 100, 180,50, true);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(240, 160, 120, 50);
		g.fillOval(240, 220, 120, 50);
		
//		g.setColor(new Color(0,7,189));
//		g.drawRect(20, 30, 100, 20);
	}
	public static void  main(String[] args)
	{
		
		JFrame frame=new JFrame();
		LinesRectsOvals line=new LinesRectsOvals();
		//line.setBackground(Color.CYAN);
		frame.add(line);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		frame.setVisible(true);
		
	}

}
