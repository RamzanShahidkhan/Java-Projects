package CheckboxStart;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Checkbox extends JFrame {
	private JTextField textField;
	private JCheckBox bold;
	private JCheckBox italic;
	public Checkbox()
	{
		super("JTextBox text");
		setLayout(new FlowLayout());
		textField =new JTextField("M R shahid Khan Niazi",25);
		textField.setFont( new Font ("Serif",Font.PLAIN,16));
		add(textField);
		bold =new JCheckBox("Bold");
		italic=new JCheckBox("italic");
		add(bold);
		add(italic);
		CheckBoxHandler handler =new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		
	}
	public  class  CheckBoxHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
		  Font font =null;
		  if(bold.isSelected() && italic.isSelected())
			  font=new Font("serif",Font.BOLD +Font.ITALIC,22);
		  else if(bold.isSelected())
			  font=new Font("serif",Font.BOLD,22);
		  else if(italic.isSelected())
			  font =new Font("serif", Font.ITALIC,22);
		  else
			  font =new Font ("serif", Font.PLAIN,22);
		  textField.setFont(font);
		  
	 }
		
		
	}
	

}
