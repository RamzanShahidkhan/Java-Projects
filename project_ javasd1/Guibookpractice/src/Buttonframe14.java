import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Buttonframe14 extends JFrame 
{
	private JButton plain;
	private JButton fancy;
	public Buttonframe14()
	{
		super("Testing buttons");
		setLayout(new FlowLayout());
		Icon bug1=new ImageIcon(("bug1.jpg"));
		Icon bug2=new ImageIcon("bug2.jpg");
		plain= new JButton("plain");
		add(plain);
	    //Icon bug2=new ImageIcon(getClass().getResource("bug2.jpg"));	
		System.out.println("height bug2 is "+ bug2.getIconHeight());
		System.out.println("width bug2 is " + bug2.getIconWidth());
		fancy=new JButton("Fancy",bug2);
		fancy.setRolloverIcon(bug1);
		add(fancy);
		ButtonHandler handler=new ButtonHandler();
		fancy.addActionListener(handler);
		plain.addActionListener(handler);	
	}
	private class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(Buttonframe14.this,
					String.format("you pressed:%s", e.getActionCommand()));		
		}
	}
	public static void main(String [] args)
	{
		Buttonframe14 f=new Buttonframe14();
		f.setSize(500,500);;
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
