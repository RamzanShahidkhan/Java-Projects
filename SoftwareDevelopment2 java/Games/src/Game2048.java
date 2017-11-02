import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game2048 extends JFrame{
	private JPanel p;
	private JButton button[];
	private Random random;
	public Game2048()
	{
		super("2048 Game ");
		
		p=new JPanel();
		random=new Random();
		int n=random.nextInt(2);
		
		button=new JButton[16];
		
		p.setLayout(new GridLayout(4,4));
		
		for(int i=0; i<button.length; i++)
		{
		    button[i]=new JButton("");
		    button[i].setBackground(Color.LIGHT_GRAY);
 //		    for(int j=0; j<button.length; j++)
//			{
//				if(n==0)
//				{
//					button[j]=new JButton(""+2);
//				}
//				else if(n==1)
//				{
//					button[j]=new JButton(""+4);
//				}
//			}
		    
		    p.add(button[i]);    
		}
		
		add(p);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Game2048 m=new Game2048();
		

	}

}
