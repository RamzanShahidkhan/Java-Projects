import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutDemo extends JFrame {
	public GridLayoutDemo(int r, int c)
	{
		super("gridlayout demo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(r,c));
		JLabel l1=new JLabel("first");
		add(l1);
		JLabel l2=new JLabel("second ");
		add(l2);
		JLabel l3=new JLabel("third");
		add(l3);
		JLabel l4=new JLabel("fourth ");
		add(l4);
		JLabel l5=new JLabel("fifth");
		add(l5);
		JLabel l6=new JLabel("sixth");
		add(l6);
		
	}

	

	public static void main(String[] args) {
	  GridLayoutDemo g=new GridLayoutDemo(2,3);	
	  g.setVisible(true);
	
	}
}
