import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class Schedule extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public Schedule()
	{
		super("JTabbedPane Demo");
		JTabbedPane tab=new JTabbedPane();
		JLabel l1=new JLabel("Click On the Schedule to see Schedule Data and Record Buttons",SwingConstants.HORIZONTAL);
		
		
		tab.addTab("Home",null, l1,"First Panel");
		
		JLabel l2=new JLabel("panel two",SwingConstants.CENTER);
		JPanel p2=new JPanel();
		p2.setBackground(Color.green);
		p2.add(l2);
		
		JLabel rList=new JLabel("Data is stored in WindowOutput Excel File.  ",SwingConstants.CENTER);
		tab.addTab("Schedule",null,rList, "Second Panel");
		JPanel p3=new JPanel();
		p3.setLayout(new BorderLayout());
		tab.addTab("Record", null,p3,"third panle");
		
		JPanel panel = new JPanel();
		p3.add(panel, BorderLayout.CENTER);
		
		JLabel lblEnterHouseNo = new JLabel("Enter House NO");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblEeterRoundNo = new JLabel("Eeter round NO");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblEnterPrice = new JLabel("Enter Price");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter P/Paid");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblEnternext = new JLabel("Enter./not paid");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblEnterNt = new JLabel("Enter Nt/n time");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("data is stored in windowfile");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(110))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEnterNt, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblEeterRoundNo)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblEnterPrice, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
										.addComponent(lblEnterHouseNo, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
									.addComponent(lblEnternext, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
								.addGap(18))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_1)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
					.addGap(139))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterHouseNo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEeterRoundNo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterPrice))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnternext))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEnterNt))
					.addGap(76)
					.addComponent(lblNewLabel_1)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		getContentPane().add(tab);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
	    Schedule f=new Schedule();
	    RecordList dp=new RecordList();
	    
     
	}
}
