import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.omg.PortableServer.ServantRetentionPolicyValue;

public class FlowLayoutFrame extends JFrame{
	private JButton left;
	private JButton center;
	private JButton right;
	private FlowLayout layout;
	private Container container;
	
	public FlowLayoutFrame()
	{
	  super("Flow layout demo");
	  layout=new FlowLayout();
	  container=getContentPane();
	  setLayout(layout);
	  left=new JButton("Left");
	  add(left);
	  left.addActionListener(
			  new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
					
				}
			  }
			  
			  
			  
			  );
	  center=new JButton("Center");
	  add(center);
	  center.addActionListener(
			  new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.CENTER);
					layout.layoutContainer(container);
					
				}
			  }  
			  );
	  right=new JButton(" right");
	  add(right);
	  right.addActionListener(
			  new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
					
				}
			  }  
			  );
	  
	 
	}
	

	public static void main(String[] args) {
		FlowLayoutFrame flow=new FlowLayoutFrame();
		flow.setSize(300,75);
		flow.setVisible(true);
		flow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
