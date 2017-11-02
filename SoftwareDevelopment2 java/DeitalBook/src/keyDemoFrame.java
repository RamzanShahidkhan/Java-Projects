import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class keyDemoFrame extends JFrame implements KeyListener{
	private String line1="";
	private String line2="";
	private String line3="";
    private JTextArea textArea;
    
    public keyDemoFrame()
    {
    	super("KeyDemoframe");
    	textArea=new JTextArea(10,5);
    	textArea.setText("press any key");
    	textArea.setEnabled(false);
    	textArea.setDisabledTextColor(Color.BLACK);
    	add(textArea);
    	
    	addKeyListener(this); //allow frame to process key events
    	setSize(300,400);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
    }
	
	@Override
	public void keyPressed(KeyEvent e) {
		line1=String.format("keypressed ", KeyEvent.getKeyText(e.getKeyCode()));
		setLines2andLines3(e) ; // set output line2 and line3	
		System.out.println("key press");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		line1=String.format("Key released : %s",KeyEvent.getKeyText(e.getKeyCode()) );
		setLines2andLines3(e);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		line1=String.format("Key Typed : %s ", e.getKeyChar());
		setLines2andLines3(e);
	}
	
	public static void main(String[] args) {
		keyDemoFrame f=new keyDemoFrame();
	}
	
	private void setLines2andLines3(KeyEvent e)
	{
		line2=String.format("This key is %s an action key ",(e.isActionKey() ? "": "not"));
		
		String temp=e.getKeyModifiersText(e.getModifiers());
		
		line3=String.format("Modifier keys pressed: %s ",(temp.equals("") ? "none":temp) );
		textArea.setText(String.format("%s\n%s\n%s\n",line1,line2,line3));
	}
}
