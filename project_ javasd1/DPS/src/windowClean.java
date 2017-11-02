import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class windowClean  {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowClean window = new windowClean();
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
	public windowClean() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel windowcleanLabel = new JLabel("welcome to Window Clean System");
		
		JLabel lblEnterYourName = new JLabel("Enter your Name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblClickOnLogin = new JLabel("Click on login");
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 Schedule f=new Schedule();
						
					}
				}
				);
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(110)
							.addComponent(windowcleanLabel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(98)
							.addComponent(lblEnterYourName))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(93)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblClickOnLogin)
									.addGap(18)
									.addComponent(LoginButton))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(windowcleanLabel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEnterYourName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblClickOnLogin)
						.addComponent(LoginButton))
					.addContainerGap(162, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

	

}
