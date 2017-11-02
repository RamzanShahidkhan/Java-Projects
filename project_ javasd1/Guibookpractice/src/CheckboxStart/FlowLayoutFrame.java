package CheckboxStart;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
	private JButton leftButton;
	private JButton rightButton;
	private JButton centerButton;
	private FlowLayout layout;
	private Container container;
	public FlowLayoutFrame()
	{
		super("FlowLayout Demo");
		layout=new FlowLayout();
		container=getContentPane();//get container to layout
		setLayout(layout);
		leftButton=new JButton("Left");
		add(leftButton);
		leftButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);
				//realign container component
				layout.layoutContainer(container);
				
			}
		});
		centerButton=new JButton("Center");
		add(centerButton);
		centerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);
				//realign container component
				layout.layoutContainer(container);
				
			}
		}
		);
		
		rightButton=new JButton("Right");
		add(rightButton);
		rightButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);
				//realign container component
				layout.layoutContainer(container);
				
			}
		});
		
		
	}
	

	public static void main(String[] args) {
		FlowLayoutFrame f=new FlowLayoutFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,300);
		f.setVisible(true);

	}

}
