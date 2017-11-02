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

public class SnakeFrame extends JFrame implements KeyListener{
	private int width=400;
	private int height=400;
	
	private JButton button;
	private JPanel drawPanel;
	private Rectangle rect;
	
	public SnakeFrame()
	{   
		super("SnakeDemo Game");
		Mypanel mp=new Mypanel();
		mp.setBackground(Color.lightGray);
		setContentPane(mp);
		
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.CYAN);
		
		drawPanel=new JPanel();
		drawPanel.setBackground(Color.green);
		add(drawPanel ,BorderLayout.CENTER);
		
		rect=new Rectangle(100,100,40,40);
		
		drawPanel.setFocusable(true);
		
		
		button=new JButton("Start");
		//add(button,BorderLayout.SOUTH);
		
		drawPanel.addKeyListener(this);
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
//	public void paint(Graphics g)
//	{
// //		super.paint(g);
//		Graphics2D g2=(Graphics2D)g;
//		g2.setColor(Color.ORANGE);
//		g2.fill(rect);
//		//g.fillRect(100, 100, 10, 10);	
//	}
	
	public void paintComponent(Graphics g)
	{    //super.paint
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(Color.ORANGE);
		g2.fill(rect);
		drawPanel.repaint();
	}
//	public void fillSnak()
//	{
//		Graphics g=drawPanel.getGraphics();
//		Graphics2D g2=(Graphics2D)g;
//		g2.setColor(Color.ORANGE);
//		rect=new Rectangle(100,100,40,40);
//		g2.fill(rect);
//		//g.setColor(Color.blue);
//		//g.fillOval(180, 180, 20, 20);
//	
//		//repaint();
//		
//	}
	public void keyPressed(KeyEvent e) 
	{
		System.out.println("Key Pressed");
		
		if(e.getKeyCode()==37)
		{
			//fillSnak();
			
			System.out.println("left arrow pressed");
			rect.setLocation(rect.x-3, rect.y);
			//repaint();
		}
		else if(e.getKeyCode()==38)
		{
			System.out.println("up key pressed");
			rect.setLocation(rect.x, rect.y-3);
		}
		else if(e.getKeyCode()==39)
		{
			System.out.println("right key pressed");
			rect.setLocation(rect.x+3, rect.y);
		}
		else if(e.getKeyCode()==40)
		{
			System.out.println("down key pressed");
			rect.setLocation(rect.x, rect.y+3);
		}
		
		drawPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		System.out.println("key realesd yar");
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
	
	}
   
    public static void main(String[] args) 
	{
    	//keyFrame k=new keyFrame();
		SnakeFrame s=new SnakeFrame();
	}

}
