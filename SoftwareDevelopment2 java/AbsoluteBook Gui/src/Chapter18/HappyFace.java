package Chapter18;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class HappyFace  extends JFrame
{
	public static final int ww=400;
	public static final int wh=400;
	
	public static final int fd=200;
	public static final int xf=100;
	public static final int yf=100;
	
	public static final int ew=20;
	public static final int eh=10;
	public static final int xre=xf+55;
	public static final int yre=yf+60;
	public static final int xle=xf+130;
	public static final int yle=yf+60;
	
	public static final int mw=100;
	public static final int mh=50;
	public static final int xm=xf+50;
	public static final int ym=yf+100;
	public static final int msa=180;
	public static final int mea=180;
	
	public static void main(String[] args) 
	{
		HappyFace d=new HappyFace();
		d.setVisible(true);
	}
	public HappyFace()
	{
		super("first graphics demo");
		setSize(ww,wh);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawOval(xf, yf, fd, fd);
//		g.drawLine(xre, yre, xre+ew, yre);
//		g.drawLine(xle, yle, xle+ew, yle);
		g.fillOval(xre, yre, ew, eh);
		g.fillOval(xle, yle, ew, eh);
		//draw mouth
		//g.drawLine(xm, ym, xm+mw, ym);
		g.drawArc(xm, ym, mw, mh, msa, mea);
	}
}
