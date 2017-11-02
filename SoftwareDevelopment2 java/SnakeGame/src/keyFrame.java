import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class keyFrame extends SnakeFrame implements KeyListener
{
	public keyFrame() 
	{
		super();
		addKeyListener(this);

	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode()==37)
		{
			//fill();
			System.out.println("left arrow pressed");
			repaint();
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
//		if(e.getKeyChar()==37)
//		{
//			System.out.println("left key press in type");
//		}
		
		
	}
   
    public static void main(String[] args) 
	{
    	///keyFrame k=new keyFrame();
		//SnakeFrame s=new SnakeFrame();
	}


}
