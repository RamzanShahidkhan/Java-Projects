import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements KeyListener {
	private static int full_height=380;
	private static int full_width=380;
	private Rectangle rect;
	
	public Mypanel() 
	{
		rect=new Rectangle(100,100,60,20);
		this.addKeyListener(this);
		this.setFocusable(true);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(Color.RED);
		g2.fill(rect);
		//g.fillOval(100, 130, 20, 20);
		//repaint();
	}
	public void keyPressed(KeyEvent e) 
	{
		System.out.println("Key Pressed");
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			//fillSnak();
			
			System.out.println("left arrow pressed");
			rect.setLocation(rect.x-3, rect.y);
			System.out.println(rect.getX() + " "+ rect.getY());
			//repaint();
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			System.out.println("up key pressed");
			rect.setLocation(rect.x, rect.y-3);
			System.out.println(rect.getX() + " "+ rect.getY());
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			System.out.println("right key pressed");
			rect.setLocation(rect.x+3, rect.y);
			System.out.println(rect.getX() + " "+ rect.getY());
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			System.out.println("down key pressed");
			rect.setLocation(rect.x, rect.y+3);
			System.out.println(rect.getX() + " "+ rect.getY());
		}
		this.repaint();
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
}
