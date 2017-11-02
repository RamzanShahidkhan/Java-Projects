import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windowStart {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowStart window = new windowStart();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowStart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 511, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setForeground(Color.GREEN);
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		JLabel lblWelcomeToWindowcleansystem = new JLabel("Welcome to WindowCleanSystem");
		lblWelcomeToWindowcleansystem.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 16));
		lblWelcomeToWindowcleansystem.setForeground(new Color(0, 128, 0));
		lblWelcomeToWindowcleansystem.setBackground(new Color(0, 128, 0));
		
		JLabel lblEnterStaffId = new JLabel("Enter Staff ID:");
		lblEnterStaffId.setForeground(new Color(0, 128, 0));
		lblEnterStaffId.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblEnterPassword_1 = new JLabel("Enter Password:");
		lblEnterPassword_1.setForeground(new Color(0, 128, 0));
		lblEnterPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton loginButton = new JButton("Client Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==loginButton){
					RecordWindow r = new RecordWindow();
					frame.setVisible(false);
				}
			}
		});
		loginButton.setForeground(new Color(0, 128, 0));
		loginButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblIfYouAre = new JLabel("If you are client, Click client Button");
		lblIfYouAre.setForeground(new Color(0, 128, 0));
		lblIfYouAre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblIfYouAre_1 = new JLabel("If you are Customer,Click customer Button");
		lblIfYouAre_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblIfYouAre_1.setForeground(new Color(255, 0, 0));
		
		JLabel lblEnterUserId = new JLabel("Enter User ID:");
		lblEnterUserId.setForeground(new Color(128, 0, 0));
		lblEnterUserId.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblEnterPassword_2 = new JLabel("Enter Password:");
		lblEnterPassword_2.setForeground(new Color(128, 0, 0));
		lblEnterPassword_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnCustomer = new JButton("Customer:");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				UserAccount account=new UserAccount();
				frame.setVisible(false);
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCustomer.setForeground(new Color(128, 0, 0));
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap(5, Short.MAX_VALUE)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblEnterStaffId, Alignment.LEADING)
										.addComponent(lblEnterPassword_1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_1)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
									.addGap(115))
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(lblIfYouAre, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblIfYouAre_1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_mainPanel.createSequentialGroup()
									.addComponent(loginButton)
									.addGap(104)
									.addComponent(lblEnterPassword, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)))))
					.addGap(92))
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGap(117)
					.addComponent(lblWelcomeToWindowcleansystem, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEnterUserId, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addComponent(lblEnterPassword_2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_3, 113, 113, 113)))
					.addGap(219))
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGap(133)
					.addComponent(btnCustomer)
					.addContainerGap(267, Short.MAX_VALUE))
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addComponent(lblWelcomeToWindowcleansystem, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblIfYouAre)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterStaffId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPassword_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addComponent(lblEnterPassword)
							.addGap(27))
						.addGroup(gl_mainPanel.createSequentialGroup()
							.addComponent(loginButton)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblIfYouAre_1)
							.addGap(6)))
					.addGap(2)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterUserId))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterPassword_2))
					.addGap(26)
					.addComponent(btnCustomer)
					.addGap(43))
		);
		mainPanel.setLayout(gl_mainPanel);
		frame.setVisible(true);
	}
	
}
