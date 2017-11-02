import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	public static final int nod=30;
	private JTextField iof;
	private double result=0.0;
	
	public Calculator()
	{
		super("calculator demo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout());
		iof=new JTextField("enter number here . ",nod);
		iof.setBackground(Color.WHITE);
		p.add(iof);
		add(p,BorderLayout.NORTH);
		
		JPanel bp=new JPanel();
		bp.setBackground(Color.blue);
		bp.setLayout(new FlowLayout());
		
		JButton addb=new JButton("+");
		addb.addActionListener(this);
		bp.add(addb);
		JButton sub=new JButton("-");
		sub.addActionListener(this);
		bp.add(sub);
		JButton r=new JButton("reset");
		r.addActionListener(this);
		bp.add(r);
		
		add(bp,BorderLayout.CENTER);
		
		
		
	}
  public void assumeCorrectNumber(ActionEvent e)
  {
	  String s=e.getActionCommand();
	  if(s.equals("+"))
	  {
		  result=result+ stringToDouble(iof.getText());
	     iof.setText(Double.toString(result));
	  }
	  else if(s.equals("-"))
	  {
		  result=result - stringToDouble(iof.getText());
		     iof.setText(Double.toString(result));
	  }
	  else if(s.equals("reset"))
	  {
		  result=0.0;
		  iof.setText("0.0");
	  }
	  else
		  iof.setText("unexpected error");
  }
	

	private static double stringToDouble(String Sobject) {
	
	      return Double.parseDouble(Sobject.trim());
}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			assumeCorrectNumber(e);
		}
		catch(NumberFormatException e2)
		{
			iof.setText("error: reenter number.");
		}
		
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.setVisible(true);

	}
}
