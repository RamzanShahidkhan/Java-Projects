import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guii {
	public static void main(String[] args){ 
		JFrame F = new JFrame("Front view of Microwave Oven");
		F.setLayout(new GridLayout(1,2));
		JButton jb = new JButton("Food to be placed here");
		JTextField textfield = new JTextField("Time to be displayed here");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		F.add(jb);
		F.add(panel);
		panel.add(textfield, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,3));
		JButton[] barr = new JButton[12];
		String[] btext = {"1", "2", "3",
				"4", "5", "6",
				"7", "8", "9",
				"0", "Start", "Stop"};
		
		for(int i=0;i<barr.length;i++){
			barr[i] = new JButton(btext[i]);
			buttonPanel.add(barr[i]);
		}
		
		panel.add(buttonPanel);
		
		F.setSize(400,200);
		F.setVisible(true);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
