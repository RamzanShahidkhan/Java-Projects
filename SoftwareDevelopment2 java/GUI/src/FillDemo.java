import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FillDemo extends JFrame implements ActionListener{
	private int width=400;
	private int height=400;
	private static int full_width=300;
	private static int full_height=100;
	private static int c_size=20;
	private static int pause=110;
	
	private JButton button;
	private JPanel drawPanel;
	private JPanel bP;
	
	
	public FillDemo()
	{   
		super("Fill demo");
		
		setLayout(new BorderLayout());
		getContentPane().setBackground(Color.CYAN);
		drawPanel=new JPanel();
		
		drawPanel.setBackground(Color.yellow);
		add(drawPanel ,BorderLayout.CENTER);
		
		
		bP=new JPanel();
		bP.setLayout(new FlowLayout());
		button=new JButton("Start");
		button.addActionListener(this);
		bP.add(button);
		add(bP,BorderLayout.SOUTH);
		
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		 Packer pThread=new Packer();
		 pThread.start();
		 
	}
	private class Packer extends Thread
	{
		public void run()
		{
			fill();
		}
	}
	public void fill()
	{
		Graphics g=drawPanel.getGraphics();
		for(int y=0; y<full_height; y=y+(2*c_size))
			for(int x=0; x<full_width; x=x+c_size)
				g.fillOval(x, y, c_size, c_size);
		          doNothing(pause);
	}
	
	public void doNothing(int ms)
	{
		try
		{
			Thread.sleep(ms);
			
		} 
		catch (InterruptedException e) 
		{
			System.out.println("unexpected error");
			System.exit(0);
		}	
	}
	public static void main(String [] arg)
	{
		FillDemo f=new FillDemo();
	}
}