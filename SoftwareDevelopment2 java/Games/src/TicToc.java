import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicToc extends JFrame implements ActionListener {
	private JButton button[][];
	private JPanel p;
	private boolean  condition;
	
	public TicToc()
	{
		super("Tic toc game");
		button=new JButton[3][3];
		p=new JPanel();
		p.setLayout(new GridLayout(3,3));
		for(int i=0; i<button.length; i++)
		{
			for(int j=0; j<button.length; j++)
			{
			button[i][j]=new JButton();
			button[i][j].addActionListener(this);
			
			p.add(button[i][j]);
			}
		}
		
		add(p);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		TicToc t=new TicToc();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bb=(JButton)e.getSource();
		String s=bb.getText();
		
		System.out.println("jajajjaj");
		   //if(condition==true)
		   {
			for(int i=0; i<button.length;i++)
			{
				for(int j=0; j<button.length; j++)
				{
					if(bb.equals(button[i][j]))
					{
					  button[i][j].setText("/");
					  button[i][j].setEnabled(false);
					}
				}
			}
		   }
		}
		
	

}
