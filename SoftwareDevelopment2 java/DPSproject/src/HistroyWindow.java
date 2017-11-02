import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class HistroyWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		HistroyWindow h=new HistroyWindow();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HistroyWindow window=new HistroyWindow();
//					//window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 */
	public HistroyWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Our Histroy");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setForeground(new Color(0, 0, 0));
		
		panel.setLayout(null);
		
		JLabel histroy = new JLabel("Our Histroy");
		histroy.setForeground(new Color(0, 128, 0));
		histroy.setFont(new Font("Tahoma", Font.BOLD, 13));
		histroy.setBounds(40, 11, 105, 14);
		panel.add(histroy);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
