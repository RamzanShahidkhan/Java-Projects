package CheckboxStart;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayouyFrame extends JFrame implements ActionListener{
	private JButton[] buttons;
	private static final String[] names={"one","two","three","four","five","six"};
	private boolean toggle=true;
	private Container container;
	private GridLayout grid1;
	private GridLayout grid2;

	public GridLayouyFrame()
	{
		super("GridLayout Demo");
		grid1=new GridLayout(2,3,8,8);
		grid2=new GridLayout(2,3);
		container=getContentPane();
		setLayout(grid1);
		buttons=new JButton[names.length];
		for(int c=0; c< names.length; c++)
		{
			buttons[c]=new JButton(names[c]);
			buttons[c].addActionListener(this);
			add(buttons[c]);	
		}
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(toggle)
			container.setLayout(grid2);
		else
			container.setLayout(grid1);
		toggle=!toggle;
		container.validate();	
	}
	public static void main(String[] args) {
		GridLayouyFrame f=new GridLayouyFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);

	}
}
