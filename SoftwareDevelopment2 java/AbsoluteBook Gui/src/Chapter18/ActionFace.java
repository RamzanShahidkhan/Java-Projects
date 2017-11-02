package Chapter18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionFace  extends JFrame
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
	
	private boolean wink;
	
	private class winkAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			wink=true;
			repaint();
			
		}
	}
	
	
	public static void main(String[] args) 
	{
		ActionFace d=new ActionFace();
		d.setVisible(true);
	}
	public ActionFace()
	{
		super("first graphics demo");
		setSize(ww,wh);
		setTitle("Hello there");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
		
		JButton wB=new JButton("click for a wink");
		wB.addActionListener(new winkAction());
		add(wB, BorderLayout.SOUTH);
		wink=false;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawOval(xf, yf, fd, fd);
//		g.drawLine(xre, yre, xre+ew, yre);
//		g.drawLine(xle, yle, xle+ew, yle);
		g.fillOval(xre, yre, ew, eh);
		//g.fillOval(xle, yle, ew, eh);
		//draw left eye
		if(wink)
		{
			g.drawLine(xle, yle, xle+ew, yle);
		
		}
		else
		{
			g.fillOval(xle, yle, ew, eh);
		}
		g.drawArc(xm, ym, mw, mh, msa, mea);
	}
	
 

}
