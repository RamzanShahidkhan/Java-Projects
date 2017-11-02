import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class counter implements ActionListener {
	JButton b1;
	JButton b2;
	 JTextField t;
     public counter()
     {
    	 JFrame j=new JFrame(" AWT counter");
    	 j.setLayout(new FlowLayout());
    	 JPanel p=new JPanel();
    	 JPanel p1=new JPanel();
    	  t=new JTextField("2",10);
    	// p.setLayout(new BorderLayout());
    	  b1=new JButton("counter --");
    	  b2=new JButton("count ++");
    	 b1.addActionListener(this);
    	 b2.addActionListener(this);
    	 p1.add(b1);
    	 j.add(p1,BorderLayout.WEST); 
    	 p.add(t);
    	 j.add(p);
    	 p.add(b2);
    	 j.add(p,BorderLayout.EAST);
    	 
    	 
    	 j.setSize(400,200);
    	 j.setVisible(true);
    	 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
	public static void main(String [] args)
	{
		counter con=new counter();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source= (JButton)e.getSource();
		if(b2==source)
		{
			int n=Integer.parseInt(t.getText());
			t.setText(Integer.toString(n+2));
		}
		if(b1==source)
		{
			int n =Integer.parseInt(t.getText());
			t.setText(Integer.toString(n-1));
		}
		
	}
 }



