import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pazzle implements ActionListener {
	 private String [] button;
	 private JButton[] bar;
	 private JPanel panel;
	 public Pazzle()
	{
		JFrame F = new JFrame("Calculatorrr");
		panel = new JPanel();
		//panel.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		 bar= new JButton[9];
     	 String[] button={"","8","9","4","5","6","1","2","3"};
		for(int i=0; i<bar.length;i++)
		{
			bar[i]= new JButton(button[i]);
			//bar[i].setEnabled(false);
			buttonPanel.add(bar[i]);
			bar[i].addActionListener(this);	
		}
		bar[0].setEnabled(false);
		//panel.add(buttonPanel);
		F.add(buttonPanel);
		F.setSize(400,400);
		F.setVisible(true);
		//F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{ 
		Pazzle pazz=new Pazzle();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{ 
		//JButton source=(JButton)e.getSource();
		Object source=e.getSource();
		for(int a=1; a<bar.length; a++)
		{
			
			 if(source==bar[a-1]  )
			 {
				bar[a].setEnabled(true);
	         	bar[a].setText(bar[a-1].getText());
				//bar[a].setText("");
				bar[a-1].setEnabled(false);
			 }
		 if(source==bar[a]  )
		 {
			bar[a-1].setEnabled(true);
       	bar[a-1].setText(bar[a].getText());
			//bar[a].setText("");
			bar[a].setEnabled(false);
		 }
		 
		}
	}	
}
