import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MetricJPanel extends JPanel {
	//display fontMatrics
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // call's superclass paintComponent
		g.setFont(new Font("Serif",Font.BOLD,12));
		FontMetrics metrics=g.getFontMetrics();
		g.drawString("current font "+g.getFont(),20 , 30);
		g.drawString("Ascent  "+metrics.getAscent(), 20,45);
		g.drawString("Descent "+ metrics.getDescent(), 20, 60);
		g.drawString("Height "+metrics.getHeight(), 20, 75);
		g.drawString("Leading "+metrics.getLeading(), 20, 90);
		
		Font font=new Font("Serif",Font.ITALIC,12);
		metrics=g.getFontMetrics(font);
		g.setFont(font);
		g.drawString("current font "+g.getFont(),20 , 130);
		g.drawString("Ascent  "+metrics.getAscent(), 20,150);
		g.drawString("Descent "+ metrics.getDescent(), 20, 170);
		g.drawString("Height "+metrics.getHeight(), 20, 185);
		g.drawString("Leading "+metrics.getLeading(), 20, 200);
		
		
		
		
		
	}

	public static void main(String[] args) {
		JFrame frame=new JFrame("Metrics font:");
		MetricJPanel panel=new MetricJPanel();
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setVisible(true);
		

	}

}
