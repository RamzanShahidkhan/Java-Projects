
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MineSweeper   extends JFrame implements ActionListener{
	private JPanel p;
	private JButton button[][];
	private int mineArray[][]=new int[4][4];
	
	private Random random;
	public MineSweeper()
	{
		super("MineSweeper Game ");
		p=new JPanel();
		random=new Random();
		//int n=random.nextInt(4);
		button=new JButton[4][4];
		p.setLayout(new GridLayout(4,4));
		int d=0;
		try
		{
		do
		{
			int a=random.nextInt(4);
			int b=random.nextInt(4);
		    mineArray[a][b]=-1;
		    //button[a][b].setText(mineArray.toString());
		    System.out.println("a is "+a );
		    System.out.println("b is "+b);
		    System.out.println("ddd = " +mineArray[a][b]);
		    d++;
		}while(d<4);
		}
		catch (Exception e) {
			System.out.println("expetion occur");
		}
		
				//button[a][b].setText(mineArray.toString());
		
		
		for(int i=0; i<button.length; i++)
		{
				for(int j=0; j<button.length; j++)
				{
				    button[i][j]=new JButton("");
				    button[i][j].setBackground(Color.LIGHT_GRAY);
				    button[i][j].setText(mineArray.toString());
				    p.add(button[i][j]); 
				}
		}	
		
		add(p);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jj=(JButton)e.getSource();
		String s=jj.getText();
		if(s.equals(-1))
		{
			System.exit(0);
			System.out.println("Game over");
		}
		else if(s.equals(""))
		{
			
		}
	}
	public static void main(String[] args) {
		MineSweeper m=new MineSweeper();
		//m.setVisible(true);
	}
}
