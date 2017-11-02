import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutDemo  extends JFrame{
	
	 public BorderLayoutDemo() {
		super("Border Layout demo");
			setSize(300,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		 // setVisible(true);
			setLayout(new BorderLayout());
			//setLayout(new FlowLayout());  // if use flowLayout manager then don't add second arg in add method
			JLabel l=new JLabel("first");
			add(l ,BorderLayout.NORTH);
			JLabel l1=new JLabel("second ");
			add(l1,BorderLayout.SOUTH);
			JLabel l2=new JLabel("third");
			add(l2,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		BorderLayoutDemo d=new BorderLayoutDemo();
		d.setVisible(true);

	}

}
