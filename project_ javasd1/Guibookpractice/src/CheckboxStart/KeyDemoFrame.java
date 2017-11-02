package CheckboxStart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	private String line1="";
	private String line2="";
	private String line3="";
	private JTextArea textArea;
	
	public KeyDemoFrame()
	{
		super("Demonstrating keystroke Event");
		textArea =new JTextArea(10, 15);
		textArea.setText("press any key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		textArea.setBackground(Color.yellow);
		
		add(textArea);
		
		addKeyListener(this); //allow frame to press key
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		line1=String.format("key pressed: %s", KeyEvent.getKeyText(e.getKeyCode()));
		setLine2and3(e);	
	}
	public void keyReleased(KeyEvent e)
	{
		line1=String.format("key released: %s",KeyEvent.getKeyText(e.getKeyCode()));
		setLine2and3(e);
	}
	public void keyTyped(KeyEvent e)
	{
		line1=String.format("key Typed: %s",e.getKeyChar());
		setLine2and3(e);
	}
	//set second and third line of output
	private void setLine2and3(KeyEvent e)
	{
		line2=String.format("This key is %s an action key:", ( e.isActionKey()? "":"not"));
		String temp=KeyEvent.getKeyModifiersText(e.getModifiers());
		
		line3=String.format("Modifier key is pressed: %s",(temp.equals("")?"none": temp));//output modifier
		textArea.setText(String.format("%s\n%s\n%s\n", line1,line2,line3));
	}
	
	public static void main(String[] args)
	{
		KeyDemoFrame f=new KeyDemoFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,300);
		f.setVisible(true);
		

	}
}
