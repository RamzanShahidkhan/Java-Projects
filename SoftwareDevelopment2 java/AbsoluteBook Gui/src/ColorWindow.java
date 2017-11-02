import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorWindow extends JFrame {
	
	public ColorWindow(Color thecolor){
		super("colorwindow");
			setSize(300,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(thecolor);
		 // setVisible(true);
			JLabel l=new JLabel("close window button work");
			add(l);
	}
	public ColorWindow()
	{
		this(Color.blue);
	}

	public static void main(String[] args) {
		ColorWindow w=new ColorWindow();
		w.setVisible(true);
		ColorWindow w2=new ColorWindow(Color.gray);
		w2.setVisible(true);
				
		

	}

}
