package Chapter18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollbarDemo extends JFrame implements ActionListener {
	private static final int cpl=30;
	private static final int lines=15;
	private  JTextArea display;
	private String memo1;
	private String memo2;
	public ScrollbarDemo()
	{
		super("scroll demo");
		setSize(400,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		p.setBackground(Color.lightGray );
		p.setLayout(new FlowLayout());
		
		JButton b1=new JButton("Save 1");
		b1.addActionListener(this);
		p.add(b1);
		
		JButton b2=new JButton("Save 2");
		b2.addActionListener(this);
		p.add(b2);
		
		JButton clear=new JButton("Clear");
		clear.addActionListener(this);
		p.add(clear);
		
		JButton g1=new JButton("Get 1");
		g1.addActionListener(this);
		p.add(g1);
		
		JButton g2=new JButton("Get 2");
		g2.addActionListener(this);
		p.add(g2);
		
	    add(p, BorderLayout.SOUTH);
	    
	    JPanel tp=new JPanel();
	    tp.setBackground(Color.blue);
	    
	    display =new JTextArea(lines,cpl);
	    display.setBackground(Color.WHITE);
	    
	    JScrollPane st=new JScrollPane(display);
	    st.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    st.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    tp.add(st);
	    
	    add(tp, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		ScrollbarDemo s=new ScrollbarDemo();
		s.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Save 1"))
			memo1=display.getText();
		else if(s.equals("Save 2"))
			memo2=display.getText();
		else if(s.equals("Clear"))
			display.setText("");
		else if(s.equals("Get 1"))
		     display.setText(memo1);
		else if(s.equals("Get 2"))
			display.setText(memo2);
		else
			System.out.println("unexpected error");	
	}
}
