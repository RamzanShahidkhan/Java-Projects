package Chapter18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChooserDemo  extends JFrame implements ActionListener{
	private static final int w=400;
	private static final int h=200;
	
	private Color samplecolor=Color.lightGray;
	public ColorChooserDemo()
	{
		super("JColorchooserDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(samplecolor);
		setLayout(new BorderLayout());
		setSize(w,h);
		JPanel bp=new JPanel();
		bp.setBackground(Color.white);
		bp.setLayout(new FlowLayout());
		JButton bb=new JButton("Choose a color");
		bb.addActionListener(this);
		bp.add(bb);
		add(bp,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		ColorChooserDemo c=new ColorChooserDemo();
		c.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Choose a color"))
		{
			samplecolor= JColorChooser.showDialog(this, "JColor Chooserr", samplecolor);
			if(samplecolor!=null)
				getContentPane().setBackground(samplecolor);
		}
		else 
			System.out.println("error");
		
	}

}
