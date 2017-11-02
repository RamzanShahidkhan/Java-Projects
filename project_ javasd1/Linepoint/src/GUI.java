
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	private static int clickCount = 0;

	public GUI()
	{
		constructGUI();
	}

	private void constructGUI()
	{
		JFrame jf = new JFrame("Line Drawing");
		JLabel jl = new JLabel();
		jl.setText("<html><body><center><p>Note: Every new click, after the 1st, "
				+ "in the Yellow area below will define a new straight"
				+ " line drawn between the recent click and the "
				+ "previous one.</p></center></body></html>");
		jl.setForeground(Color.BLUE);
		jf.add(jl, BorderLayout.NORTH);

		JPanel jpCenter = new JPanel();
		jpCenter.setBackground(Color.YELLOW);
		jpCenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.out.println("Point " + (++clickCount) + ":  "
						+ e.getX() + ", " + e.getY());
			}
		});
		jf.add(jpCenter);

		jf.setVisible(true);
		jf.setSize(500, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new GUI();
	}
}
