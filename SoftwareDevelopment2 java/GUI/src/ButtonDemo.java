import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame{
	private JButton button [];
	private JPanel jp;
	public ButtonDemo()
	{
		super("Some buttons");
		jp=new JPanel();
//		button=new JButton("1");
//		jp.add(button);
//		add(button);
		for(int i=0; i<4; i++)
		{
		    button[i]=new JButton(""+i);
		    jp.add(button[i]);
		    
		    
		}
		add(jp);
		
		
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		 ButtonDemo b=new ButtonDemo();

	}

}
