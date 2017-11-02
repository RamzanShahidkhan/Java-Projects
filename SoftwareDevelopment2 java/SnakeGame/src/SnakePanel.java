import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakePanel extends JFrame implements KeyListener {
	private int width=400;
	private int height=400;
	private JPanel sPanel;
	private JPanel bbPanel;
	private JButton button;
	private Rectangle rect;
	
	public SnakePanel()
	{
		super("SnakeDemo Game");
		setLayout(new BorderLayout());
//		getContentPane().setBackground(Color.ORANGE);
		sPanel=new JPanel();
		sPanel.setBackground(Color.yellow);
		add(sPanel,BorderLayout.CENTER);
		
		bbPanel=new JPanel();
		bbPanel.setLayout(new FlowLayout());
		button=new JButton("Start");
		bbPanel.add(button);
		add(bbPanel,BorderLayout.SOUTH);
		rect = new Rectangle(100, 100,20,20);
		
		//add(button,BorderLayout.SOUTH);
		sPanel.addKeyListener(this);
		sPanel.setFocusable(true);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		//super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(rect);
		
	}
	public void fill()
	{
		Graphics g=sPanel.getGraphics();
		
		//Graphics g=sPanel.getGraphics();
		//g.setColor(Color.blue);
	   g.fillOval(80, 800, 20, 20);
		
		
	}

//	public static void main(String[] args) 
//	{
//		SnakeFrame s=new SnakeFrame();
//	     
//	    
//	}
	
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			rect.setLocation(rect.x-3, rect.y);
			//fill();
			System.out.println("left arrow pressed");
			
		}
		else if(e.getKeyCode()==38)
		{
			System.out.println("up key pressed");
		}
		else if(e.getKeyCode()==39)
		{
			System.out.println("right key pressed");
		}
		else if(e.getKeyCode()==40)
		{
			System.out.println("down key pressed");
		}
		//System.out.println("key pressed");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		System.out.println("key realesd yar");
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		if(e.getKeyChar()==37)
		{
			System.out.println("left key press in type");
		}
	}
   
    public static void main(String[] args) 
	{
    	//KeyPanel p=new KeyPanel();
		//SnakeFrame s=new SnakeFrame();
    	SnakePanel p=new SnakePanel();
	}
	
}
