import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sum extends JFrame implements ActionListener {

	JTextField t;
	JTextField t1;
	JTextField r;

	public Sum() {
		super("sum of numbers");
		setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2));
		
		JLabel l1=new JLabel("1st number= ");
		JLabel l2=new JLabel("2st number= ");
		t = new JTextField("56",5);
		t1 = new JTextField("20",5);
		JButton s = new JButton("Sum");
		s.addActionListener(this);
		 r = new JTextField(5);
		p.add(l1);
		p.add(t);
		p.add(l2);
		
		p.add(t1);
		p.add(s);
		p.add(r);
		add(p);
		setSize(300, 180);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Sum s = new Sum();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
		int n2=Integer.parseInt(t1.getText());
		int n1=Integer.parseInt(t.getText());
		r.setText(Integer.toString(n1+n2));
//		if(s==)
//		r.setText(Integer.toString(n1+n2));

	}
}
