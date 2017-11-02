import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UserPayment {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserPayment window = new UserPayment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 361);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(0, 128, 0));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(68, 57, 88, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(166, 55, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblHouseNo = new JLabel("House No:");
		lblHouseNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHouseNo.setForeground(new Color(0, 128, 0));
		lblHouseNo.setBounds(68, 86, 85, 14);
		panel.add(lblHouseNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 86, 120, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setForeground(new Color(0, 128, 0));
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmount.setBounds(68, 121, 88, 14);
		panel.add(lblAmount);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 119, 120, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(0, 128, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnSubmit.setBounds(159, 223, 89, 23);
		panel.add(btnSubmit);
		frame.setVisible(true);
	}
}
