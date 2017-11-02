import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDemo extends JFrame implements ActionListener{
	private JPanel bP;
	private JPanel wP;
	private JPanel gP;
	
	public PanelDemo()
	{
		super("Panel demo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel bigP=new JPanel();
		
		bigP.setLayout(new GridLayout(1,3));
		
		bP=new JPanel();
		bP.setBackground(Color.LIGHT_GRAY);
		bigP.add(bP);
		
		wP=new JPanel();
		wP.setBackground(Color.LIGHT_GRAY);
		bigP.add(wP);
		
		gP=new JPanel();
		gP.setBackground(Color.lightGray);
		bigP.add(gP);
		
		add(bigP,BorderLayout.CENTER);
		
		JPanel buttonP=new JPanel();
		buttonP.setBackground(Color.gray);
		buttonP.setLayout(new FlowLayout());
		
		JButton bButt=new JButton("Blue");
		bButt.setBackground(Color.BLUE);
		bButt.addActionListener(this);
		buttonP.add(bButt);
		
		JButton wButt=new JButton("White");
		wButt.setBackground(Color.white);
		wButt.addActionListener(this);
		buttonP.add(wButt);
		
		JButton gButt=new JButton("Gary");
		gButt.setBackground(Color.lightGray);
		//gButt.setPreferredSize(new Dimension(124,124));
		gButt.addActionListener(this);
		buttonP.add(gButt);
		
		add(buttonP,BorderLayout.SOUTH);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String buttS=e.getActionCommand();
		if(buttS.equals("Blue"))
			bP.setBackground(Color.BLUE);
		else if(buttS.equals("White"))
			wP.setBackground(Color.white);
		else if(buttS.equals("Gary"))
			gP.setBackground(Color.GRAY);
		else
			System.out.println("unexpected error");
		
		
	}

	public static void main(String[] args) {
	    PanelDemo d=new PanelDemo();
	    d.setVisible(true);
    
	}


	

}
