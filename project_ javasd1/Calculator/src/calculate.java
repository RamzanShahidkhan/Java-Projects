import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculate {
	public calculate()
	{
		JFrame jf=new JFrame("Front view of oven");
		JPanel jp =new JPanel();
		//jp.setLayout(new BorderLayout());
		jf.setLayout(new GridLayout(1,2));
		JButton jb=new JButton("Food to be placed Here");
		jp.add(jb);
		JPanel jp1 =new JPanel();
		jp1.setLayout(new BorderLayout());
		JTextField text =new JTextField("This is txt :");
		jp1.add(text,BorderLayout.NORTH);
		JButton[] JB = new JButton[12];
		JPanel jp3=new JPanel();
		jp3.setLayout(new GridLayout(4,3));
		String[] name= {"1","2","3","4","5","6","7","8","9","0","Start","Stop"};
		for(int i=0; i<JB.length;i++){
			JB[i]=new JButton(name[i]);
			jp3.add(JB[i]);	
		}
		jp1.add(jp3);
		//jf.add(jp);
		jf.add(jp1);
		
		
		
		
		
		
		jf.setSize(400,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		calculate c =new calculate();
		
		
	}
}
