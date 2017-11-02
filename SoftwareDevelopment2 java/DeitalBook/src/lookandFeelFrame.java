import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class lookandFeelFrame extends JFrame {
	private UIManager.LookAndFeelInfo[] looks;
	private String[] lookNames;
	private JRadioButton[] radio;
	private ButtonGroup group;
	private JButton button;
	private JLabel label;
	private JComboBox comboBox;
	
	public lookandFeelFrame()
	{
		super("Look and FeelFrame Demo");
		looks=UIManager.getInstalledLookAndFeels();
		lookNames=new String[looks.length];
		
		for(int i=0; i<looks.length; i++)
		{
			lookNames[i]=looks[i].getName();
		}
		JPanel northPanel=new JPanel();
		northPanel.setLayout(new GridLayout(3,1,0,5));
		label=new JLabel("This is a "+lookNames[0] +"look and feel",SwingConstants.CENTER);
		northPanel.add(label);
		
		button=new JButton("JButton");
		northPanel.add(button);
		
		comboBox=new JComboBox(lookNames);
		northPanel.add(comboBox);
		
		radio=new JRadioButton[looks.length];
		
		JPanel southPanel=new JPanel();
		int rows=(int)Math.ceil(radio.length/3.0);
		southPanel.setLayout(new GridLayout(rows,3));
		
		group=new ButtonGroup();
		ItemHandler handler=new ItemHandler();
		for(int i=0; i<radio.length; i++)
		{
			radio[i]= new JRadioButton(lookNames[i]);
			radio[i].addItemListener(handler);
			group.add(radio[i]);
			southPanel.add(radio[i]);
		}
		add(northPanel,BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		radio[0].setSelected(true);
	}
	private void changeThelookandfeel(int value)
	{
		try {
			UIManager.setLookAndFeel(looks[value].getClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private class ItemHandler implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			for(int c=0; c<radio.length; c++)
			{
				if(radio[c].isSelected())
				{
					label.setText(String.format("This is a %s lookand feel", lookNames[c]));
					comboBox.setSelectedIndex(c);
					changeThelookandfeel(c);
					
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		lookandFeelFrame l=new lookandFeelFrame();
		l.setSize(300,400);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setVisible(true);

	}

}
