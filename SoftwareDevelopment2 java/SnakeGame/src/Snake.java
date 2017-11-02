import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake extends JFrame 
{
	protected int width=400;
	protected int height=400;
	
	private JButton button;
	public Snake()
	{   
		super("SnakeDemo Game");
		
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.blue);
		Mypanel mp=new Mypanel();
		mp.setBackground(Color.GREEN);
		setContentPane(mp);

		button=new JButton("Start");
		//add(button,BorderLayout.SOUTH);

		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private class CircleDraw extends Thread
	{
		public void run()
		{
			//fillSnak();
		}
	}
	public static void main(String [] args)
	{
		Snake s=new Snake();
	}

	
}
