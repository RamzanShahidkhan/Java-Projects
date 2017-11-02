package CheckboxStart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import org.w3c.dom.events.MouseEvent;

public class MouseTrackFrame extends JFrame {
	private JPanel mousePanel;
	private JLabel statusBar;
	//mouse Track constructor sets up GUI and register mouse event handler
	public MouseTrackFrame()
	{
		super("Demonstrating Mouse Events:");
		mousePanel =new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel,BorderLayout.CENTER); //add panel to JFrame 
		statusBar =new JLabel("Mouse outside JPanel");
		add(statusBar, BorderLayout.SOUTH); // add label to JFrame
		MouseHandler handler=new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
		
		
	}
	private class MouseHandler implements MouseListener, MouseMotionListener
	{ // method of mouse listener
		@Override
		public void mouseClicked(MouseEvent e)
		{
			statusBar.setText(String.format("Clicked at[%d, %d]", e.getX(),e.getY()));
		}
		public void mousePressed(MouseEvent event)
		{
			statusBar.setText(String.format("Pressed at[%d, %d]", event.getX(),event.getY()));
		}
		public void mouseReleased(MouseEvent event)
		{
			statusBar.setText(String.format("Mouse Released at[%d, %d]", event.getX(),event.getY()));
			mousePanel.setBackground(Color.RED);
		}
		@Override
		public void mouseEntered(MouseEvent event)
		{
			statusBar.setText(String.format(" Mouse Entered at[%d, %d]", event.getX(),event.getY()));
			mousePanel.setBackground(Color.green);
		}
		
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {
			// TODO Auto-generated method stub
			statusBar.setText("Mouse outside the panel:");
			mousePanel.setBackground(Color.gray);
			
		}  // up to this
		// method od motionListener
		@Override
		// when user drag mouse with press button
		public void mouseDragged(MouseEvent e) {
			statusBar.setText(String.format("Dragged at[%d, %d]", e.getX(),e.getY()));
			mousePanel.setBackground(Color.YELLOW);
		}
		//handle event when user move mouse
		@Override
		public void mouseMoved(MouseEvent e) {
			statusBar.setText(String.format("Moved  at[%d, %d]", e.getX(),e.getY()));
			//mousePanel.setBackground(Color.magenta);
			
		}
			
	}
	public static void main (String [] arg)
	{
		MouseTrackFrame mouse=new MouseTrackFrame();
		mouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//mouse.setBackground(Color.BLUE);
		mouse.setSize(500,300);
		mouse.setVisible(true);
		
	}

}
