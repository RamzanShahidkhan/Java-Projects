import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.Popup;

public class PopFrame extends JFrame {
	private JRadioButtonMenuItem[] items;
	private final Color[] colorValues={Color.blue, Color.yellow, Color.red};
	private JPopupMenu popupMenu;
	
	public PopFrame()
	{
		super("Using JPOpup Menu");
		ItemHandler Handler=new ItemHandler();
		String [] colors={"Blue","Yellow","Red"};
		ButtonGroup colorGroup=new ButtonGroup();
		popupMenu=new JPopupMenu();
		items=new JRadioButtonMenuItem[colors.length];
		
		for(int c=0; c<items.length; c++)
		{
			items[c]=new JRadioButtonMenuItem(colors[c]);
			popupMenu.add(items[c]); //add item to pop up menu
			colorGroup.add(items[c]); //add item to button group
			items[c].addActionListener(Handler);
		}
		setBackground(Color.WHITE);
		
		addMouseListener(
				new MouseAdapter() 
				{
					public void mousePressed(MouseEvent e)
					{
						checkForTriggerEvent(e);
						System.out.println("mouse pressed");
					}
					public void mouseReleased(MouseEvent e)
					{
						checkForTriggerEvent(e);
						System.out.println("mouse relesed");
					}
					private void checkForTriggerEvent(MouseEvent e)
					{
						if(e.isPopupTrigger())
							popupMenu.show(e.getComponent(), e.getX() ,e.getY());
					}
					
				}
				);
	}
	private class ItemHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for(int i=0; i<items.length ;i++)
			{
				if(e.getSource()==items[i])
				{
					getContentPane().setBackground(colorValues[i]);
					return;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		PopFrame p=new PopFrame();
		p.setSize(300,400);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
	}

}
