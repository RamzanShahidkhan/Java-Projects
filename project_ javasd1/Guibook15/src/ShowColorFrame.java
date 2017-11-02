import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShowColorFrame extends JFrame{
	private JButton changeButton;
	private  Color color=Color.LIGHT_GRAY;
	private JPanel colorPanel;
	
	public ShowColorFrame()
	{
		super("Using Jcolor chooser");
		colorPanel=new JPanel();
		colorPanel.setBackground(color);
		
		changeButton=new JButton("change color");
		changeButton.addActionListener(
				new ActionListener() 
				{	
					@Override
					public void actionPerformed(ActionEvent event) {
					color=JColorChooser.showDialog(ShowColorFrame.this, "choose a color", color);
						if(color==null)
						
							color=Color.yellow;
						colorPanel.setBackground(color);
						
					}
				}
				);
		add(colorPanel, BorderLayout.CENTER);
		add(changeButton,BorderLayout.SOUTH);
		setSize(400,400);
		setVisible(true);
		
	}
 public static void main(String[] args)
 {
	 ShowColorFrame app=new ShowColorFrame();
	 app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
