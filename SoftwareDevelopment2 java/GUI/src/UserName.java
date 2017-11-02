import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class UserName extends JFrame{
	private JPanel panel;
	private JButton button;
	private JLabel label;
	
	
	public UserName()
	{
		JTabbedPane tab=new JTabbedPane();
		panel=new JPanel();
		button=new JButton("jani");
		label=new JLabel("you are awesome");
		//panel.add(button);
//		panel.setBackground(Color.green);
//		panel.add(label);
		tab.addTab("one", null);
		
		//tab.addTab(null, panel);
		add(tab);
		
		
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		UserName n=new UserName();

	}
	//JTabbedPane   for menue  options

}
