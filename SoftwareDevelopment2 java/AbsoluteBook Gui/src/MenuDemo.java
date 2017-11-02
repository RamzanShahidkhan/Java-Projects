import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuDemo extends JFrame implements ActionListener{
	private JPanel bP;
	private JPanel wP;
	private JPanel gP;
	
	public MenuDemo()
	{
		super("Panel demo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,3));
		
		bP=new JPanel();
		bP.setBackground(Color.LIGHT_GRAY);
		add(bP);
		
		wP=new JPanel();
		wP.setBackground(Color.LIGHT_GRAY);
	    add(wP);
	
		gP=new JPanel();
		gP.setBackground(Color.lightGray);
		add(gP);
		
		JMenu colorMenu=new JMenu("Add colors");
		
		JMenuItem bluechoice=new JMenuItem("Blue");
		bluechoice.addActionListener(this);
		colorMenu.add(bluechoice);
		
		JMenuItem wchoice=new JMenuItem("White");
		wchoice.addActionListener(this);
		colorMenu.add(wchoice);
		
		JMenuItem gchoice=new JMenuItem("Gray");
		gchoice.addActionListener(this);
		colorMenu.add(gchoice);
		
		JMenuBar bar=new JMenuBar();
		bar.add(colorMenu);
		setJMenuBar(bar);
		//add(bar,BorderLayout.NORTH);
	
	}

	public static void main(String[] args) {
		MenuDemo m=new MenuDemo();
		m.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttS=e.getActionCommand();
		if(buttS.equals("Blue"))
			bP.setBackground(Color.BLUE);
		else if(buttS.equals("White"))
			wP.setBackground(Color.white);
		else if(buttS.equals("Gray"))
			gP.setBackground(Color.GRAY);
		else
			System.out.println("unexpected error.jija");
		
		
	}

}
