package CheckboxStart;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailFrame extends JFrame {
	private String detail;
	private JLabel statusBar;
	
	public MouseDetailFrame()
	{
		super("Mouse clicks and buttons:");
		statusBar=new JLabel("clicks the mouse");
		add(statusBar,BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler());
	}
	private class MouseClickHandler extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			int xPos=e.getX();
			int yPos=e.getY();
			detail=String.format("clicked %d time(s) ", e.getClickCount());
			if(e.isMetaDown()) // right mouse button
				detail+="with right mouse button:";
			else if(e.isAltDown()) // middle mouse button
				detail+="with centre mouse button";
			else  //left mouse button
				detail+="with left mouse button";
			
			statusBar.setText(detail);
		}
		
	}
	

	public static void main(String[] args) {
		MouseDetailFrame det=new MouseDetailFrame();
		det.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		det.setSize(400,300);
		det.setVisible(true);
		

	}

}
