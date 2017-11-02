import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TextFieldDemo extends JFrame implements ActionListener{
	public static final int nor=30;
	private JTextField text;
	public TextFieldDemo()
	{
		super("text demo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		jp.setBackground(Color.WHITE);
		
		text=new JTextField(nor);
		jp.add(text,BorderLayout.SOUTH);
		JLabel lb=new JLabel("enter your name here");
		jp.add(lb,BorderLayout.CENTER);
		
		add(jp);
		JPanel bp=new JPanel();
		bp.setLayout(new FlowLayout());
		bp.setBackground(Color.blue);
		JButton action=new JButton("click me");
		action.addActionListener(this);
		bp.add(action);
		JButton b2=new JButton("clear");
		b2.addActionListener(this);
		bp.add(b2);
		
		add(bp); //button panel
	}

	public static void main(String[] args) {
		TextFieldDemo t=new TextFieldDemo();
		t.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("click me"))
			text.setText("Hello  " +text.getText());
		else if(s.equals("clear"))
			text.setText("");
		else
			System.out.println("unexpected error");
		
	}

}
