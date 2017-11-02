import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingDemo {
	private static final int x=300;
	private static final int y=300;

    
   
	public static void main(String[] args)
	 {
		JFrame fWindow=new JFrame();
		fWindow.getContentPane().setBackground(Color.blue);
		fWindow.setSize(x,y);
		fWindow.setTitle("jani");
		fWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JButton but=new JButton("Click to end programe");
		EndingListner low=new EndingListner();
		but.addActionListener(low);
		fWindow.add(but);
		
		
		fWindow.setVisible(true);
		
	 
	 }

}
