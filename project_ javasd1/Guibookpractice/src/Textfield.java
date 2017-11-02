import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Textfield extends JFrame {
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private JPasswordField passwordfield;
	public Textfield()
	{
		super("JTextfield and JPasswordfield");
		setLayout (new FlowLayout());
		textfield1= new JTextField(10);
		add(textfield1);
		textfield2=new JTextField("Enter text here");
		add(textfield2);
		textfield3= new JTextField("uneditabletext field", 21);
		textfield3.setEditable(false);
		add(textfield3);
		passwordfield =new JPasswordField("hidden text");
		add(passwordfield);
		TextFieldHandler handler=new TextFieldHandler();
		textfield1.addActionListener(handler);
		textfield2.addActionListener(handler);
		textfield3.addActionListener(handler);
	}
	private class TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String string="";
			if(event.getSource()==textfield1)
			string =String.format("textfield1: %s",event.getActionCommand());
			else if(event.getSource()==textfield2)
				string=String.format("textfiled2: %s",event.getActionCommand());
			else if(event.getSource()==textfield3)
				string=String.format("textfiled3: %s",event.getActionCommand());
			else if(event.getSource()==passwordfield)
				string =String.format("passwordfield: %s",event.getActionCommand());
			JOptionPane.showMessageDialog(null, string);
			
		}
	}

}
