import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame {
	
	public JTabbedPaneFrame()
	{
		super("JTabbedPane Demo");
		JTabbedPane tab=new JTabbedPane();
		JLabel l1=new JLabel("Panel one",SwingConstants.CENTER);
		JPanel p1=new JPanel();
		p1.add(l1);
		tab.addTab("Tab one",null, p1,"First Panel");
		
		JLabel l2=new JLabel("panel two",SwingConstants.CENTER);
		JPanel p2=new JPanel();
		p2.setBackground(Color.green);
		p2.add(l2);
		tab.addTab("tab two",null,p2, "Second Panel");
		
		JLabel l3=new JLabel("Panel three");
		JPanel p3=new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add(new JButton("North"),BorderLayout.NORTH);
		p3.add(new JButton("West"),BorderLayout.WEST);
		p3.add(new JButton("East"),BorderLayout.EAST);
		p3.add(new JButton("South"),BorderLayout.SOUTH);
		//p3.add(l3);
		p3.add(l3,BorderLayout.CENTER);
		tab.addTab("Tab three", null,p3,"third panle");
		
		add(tab);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
	    JTabbedPaneFrame f=new JTabbedPaneFrame();
	    
	    
     
	}

}