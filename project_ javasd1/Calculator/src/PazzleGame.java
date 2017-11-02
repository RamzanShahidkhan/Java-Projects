import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PazzleGame implements ActionListener {
	 private String [] []button;
	 private JButton[][] bar=new JButton[3][3];;
	 private JPanel panel= new JPanel();;
	 public PazzleGame()
	{
		JFrame F = new JFrame("Calculatorrr");
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		String []s={"1","2","3","4","5","6","7","8"," "};
		int indx=new Random().nextInt(s.length);
		String random=(s[indx]);
		String[][] button = null;
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
			   button[i][j]="6";	
			}
		}
		
		
		for(int i=0; i<bar.length;i++)
		{
			for(int j=0; j<bar.length; j++)
			{
			   bar[i][j]= new JButton(button[i][j]);
			   buttonPanel.add(bar[i][j]);
			   bar[i][j].addActionListener(this);	
			}
		}
		//bar[0][0].setEnabled(false);
		//panel.add(buttonPanel);
		F.add(buttonPanel);
		F.setSize(400,400);
		F.setVisible(true);
		//F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{ 
		PazzleGame pazz=new PazzleGame();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{ 
		JButton source=(JButton)e.getSource();
		//Object source=e.getSource();
		for (int i=0; i<bar.length; i++)
		{
			for(int j=0; j<bar.length; j++)
			{
				if(bar[0][j].getText()=="")
				{ 
							if(source==bar[1][j])
							{   
								bar[0][j].setText(bar[1][j].getText());
								bar[1][j].setText("");
							}
					
				}
				if(bar[1][j].getText()=="")
				{  
							if(source==bar[0][j])
							{
							  bar[1][j].setText(bar[0][j].getText());
							  bar[0][j].setText("");
							}
							else if(source==bar[2][j])
							{
								  bar[1][j].setText(bar[2][j].getText());
								  bar[2][j].setText("");
							} 
				}
				if(bar[2][j].getText()=="")
				{
							if(source==bar[1][j])
							{
							  bar[2][j].setText(bar[1][j].getText());
							  bar[1][j].setText("");
							}
				}
//				if(bar[i][0].getText()=="")
//				{
//					if(bar[i][0]==source)
//					 {
//					   bar[0][j].setText(bar[0][j].getText());
//					   bar[0][j].setText("");
//					 }
//				}
			}
		}
		
		
		 
		
	}	
}
