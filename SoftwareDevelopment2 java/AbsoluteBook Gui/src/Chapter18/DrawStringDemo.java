package Chapter18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawStringDemo extends JFrame implements ActionListener {
	public static final int w=350;
	public static final int h=200;
	public static  final int x_s=20;
	public static final int y_s=100;
	public static final int p_s=24;
	private String text="push the button.";
	private Color penColor=Color.BLACK;
	private Font fo=new Font("SansSerif", Font.PLAIN, p_s);
	
	public DrawStringDemo()
	{
		setSize(w,h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Demo");
		getContentPane().setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		jp.setBackground(Color.LIGHT_GRAY);
		jp.setLayout(new BorderLayout());
		JButton jb=new JButton("The Button");
		jb.addActionListener(this);
		//jp.add(jb,BorderLayout.CENTER);
		jp.add(jb,BorderLayout.WEST);
		add(jp,BorderLayout.SOUTH);
	}
	

	public static void main(String[] args) {
		DrawStringDemo s=new DrawStringDemo();
		s.setVisible(true);

	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setFont(fo);
		g.setColor(penColor);
		g.drawString(text, x_s, y_s);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		penColor=Color.red;
		fo=new Font("Serif", Font.BOLD|Font.ITALIC, p_s);
		//fo=new Font("SansSerif", Font.BOLD|Font.ITALIC, p_s);
		text="Thank you. I needed that";
		repaint();
		
	}

}
