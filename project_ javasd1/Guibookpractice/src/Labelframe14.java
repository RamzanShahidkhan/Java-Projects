import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;

public class Labelframe14 extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	public Labelframe14 ()
	{
		super("Testing label1");
		setLayout(new FlowLayout ());
		label1 =new JLabel("label 1 with text");
		label1.setToolTipText("This is label 1");
		add(label1);
		Icon bug =new ImageIcon( getClass().getResource("bug1.jpg")) ;
		label2 =new JLabel ("label2 with text and icom",bug,SwingConstants.LEFT);
		label2.setToolTipText("This is label 2");
		add(label2);
		label3=new JLabel();
		label3.setText("label with icon and text at bottam");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label 3");
		add(label3);
	}
	
	
	

}
