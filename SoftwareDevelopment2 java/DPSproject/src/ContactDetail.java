import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ContactDetail {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactDetail window = new ContactDetail();
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
	public ContactDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setForeground(new Color(0, 0, 0));
		
		panel.setLayout(null);
		
		JLabel lblMobileNo = new JLabel("Mobile No:");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobileNo.setForeground(new Color(0, 128, 0));
		lblMobileNo.setBackground(new Color(0, 128, 0));
		lblMobileNo.setBounds(40, 67, 78, 14);
		panel.add(lblMobileNo);
		
		JLabel label = new JLabel("+923027071310");
		label.setForeground(new Color(139, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(128, 67, 122, 14);
		panel.add(label);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(0, 128, 0));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(40, 92, 78, 14);
		panel.add(lblAddress);
		
		JLabel lblkmFromMainwali = new JLabel("32Km from Mainwali Near Namal College Mainwali");
		lblkmFromMainwali.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblkmFromMainwali.setForeground(new Color(128, 0, 0));
		lblkmFromMainwali.setBounds(126, 92, 298, 14);
		panel.add(lblkmFromMainwali);
		
		JLabel lblContactDetails = new JLabel("Contact Details:");
		lblContactDetails.setForeground(new Color(0, 128, 0));
		lblContactDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContactDetails.setBounds(40, 11, 105, 14);
		panel.add(lblContactDetails);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
