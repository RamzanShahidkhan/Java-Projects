import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame {

	public static void main(String[] args) {
		JFrame jf = new JFrame("MyFrame chachu");
//		jf.setLayout(new GridLayout(3,3));
		
		JPanel jp1 = new JPanel();
		JButton jb1 = new JButton("Red");
		jb1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					jp1.setBackground(Color.red);
				}
		});
		JButton jb2 = new JButton("Blue");
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jp1.setBackground(Color.BLUE);
			}
		});
		//JButton jb3 = new JButton("button3");
//		JButton jb4 = new JButton("button4");
//		jb4.setSize(50,25);
		JPanel jp2 = new JPanel();
		jp1.setBackground(Color.YELLOW);
//		jp.add(jb4);
//		JButton jb5 = new JButton("button5");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jf.add(jp2, BorderLayout.SOUTH);
		jf.add(jp1);
//		jf.add(jb3);
//		jf.add(jb4);
//		jf.add(jb5);
		
		jf.setVisible(true);
		jf.setSize(500, 400);

	}

}
