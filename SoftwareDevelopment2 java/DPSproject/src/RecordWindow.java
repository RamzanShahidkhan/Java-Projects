import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class RecordWindow extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_11;
	private JTextField textField_4;
	
	public RecordWindow()
	{
		super("JTabbedPane Demo");
		JTabbedPane tab=new JTabbedPane();
		tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		JLabel l1=new JLabel(" ",SwingConstants.TRAILING);
		l1.setBackground(new Color(240, 230, 140));
		//JLabel l2=new JLabel(" ",SwingConstants.VERTICAL);
		l1.setForeground(new Color(240, 230, 140));
		JPanel p1=new JPanel();
		p1.setLayout(new BorderLayout());
		l1.setIcon(new ImageIcon("E:/SD2/DPSproject/man.jpg"));
		//l2.setIcon(new ImageIcon("E:/SD2/DPSproject/cartoon.jpg"));
		p1.add(l1, BorderLayout.WEST);
		//p1.add(l2,BorderLayout.EAST );
		
		tab.addTab("Home",null, p1,"Home");
		JPanel p2=new JPanel();
		p2.setBackground(new Color(240, 230, 140));
		tab.addTab("Schedule",null,p2, "Check Schedule");
		p2.setLayout(null);
		
		JLabel lblEnterHouseNo = new JLabel("Enter House No:");
		lblEnterHouseNo.setBackground(new Color(34, 139, 34));
		lblEnterHouseNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterHouseNo.setForeground(new Color(0, 128, 0));
		lblEnterHouseNo.setBounds(37, 168, 110, 23);
		p2.add(lblEnterHouseNo);
		
		textField = new JTextField();
		textField.setBounds(168, 170, 110, 20);
		p2.add(textField);
		textField.setColumns(10);
		
		JButton btnPressEnter = new JButton("Press Enter");
		btnPressEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				InfoAboutHouses h=new InfoAboutHouses();
			}
		});
		btnPressEnter.setForeground(new Color(0, 128, 0));
		btnPressEnter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnPressEnter.setBounds(70, 220, 125, 23);
		p2.add(btnPressEnter);
		
		JLabel lblEnterTheName = new JLabel("If you want to know whole Data, Click on this");
		lblEnterTheName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterTheName.setBackground(new Color(0, 255, 0));
		lblEnterTheName.setForeground(new Color(0, 0, 0));
		lblEnterTheName.setBounds(37, 28, 311, 14);
		p2.add(lblEnterTheName);
		
		JButton btnScheduleData = new JButton("Schedule Data");
		btnScheduleData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				InfoAboutHouses sch=new InfoAboutHouses();
			}
		});
		btnScheduleData.setForeground(new Color(0, 128, 0));
		btnScheduleData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnScheduleData.setBounds(57, 60, 125, 23);
		p2.add(btnScheduleData);
		
		JLabel lblToKnowThe = new JLabel("To know the Data of single House, Enter House No");
		lblToKnowThe.setBounds(37, 127, 294, 14);
		p2.add(lblToKnowThe);
		JPanel p3=new JPanel();
		p3.setBackground(new Color(240, 230, 140));
		p3.setForeground(new Color(0, 128, 128));
		tab.addTab("Edit Record", null,p3,"Edit Record");
		p3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter House No:");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(36, 52, 118, 24);
		p3.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 56, 110, 20);
		p3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Click on this");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditRecordWindow ed=new EditRecordWindow();
				
			}
		});
		btnNewButton.setBounds(125, 107, 110, 35);
		p3.add(btnNewButton);
		
		getContentPane().add(tab);
		JPanel p4=new JPanel();
		p4.setBackground(new Color(240, 230, 140));
		p4.setForeground(new Color(255, 228, 181));
		p1.add(l1);
		tab.addTab("Add New Customer",null, p4,"New Customer");
		p4.setLayout(null);
		
		JLabel lblEmail = new JLabel("House No :");
		lblEmail.setForeground(new Color(0, 128, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(43, 34, 89, 19);
		p4.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 35, 137, 20);
		p4.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNoOfWindows = new JLabel("No of Windows :");
		lblNoOfWindows.setForeground(new Color(0, 128, 0));
		lblNoOfWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoOfWindows.setBounds(43, 64, 109, 19);
		p4.add(lblNoOfWindows);
		
		textField_3 = new JTextField();
		textField_3.setBounds(177, 66, 137, 20);
		p4.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRound = new JLabel("Round :");
		lblRound.setForeground(new Color(0, 128, 0));
		lblRound.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRound.setBounds(43, 139, 109, 14);
		p4.add(lblRound);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("4 weekly");
		rdbtnNewRadioButton.setBounds(178, 136, 67, 23);
		p4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("8 weekly");
		rdbtnNewRadioButton_1.setBounds(247, 136, 67, 23);
		p4.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(155, 223, 67, 23);
		p4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setForeground(new Color(0, 128, 0));
		btnNewButton_2.setBounds(237, 223, 77, 23);
		p4.add(btnNewButton_2);
		
		JLabel lblCalculatedPrice = new JLabel("Calculated price");
		lblCalculatedPrice.setForeground(new Color(0, 128, 0));
		lblCalculatedPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblCalculatedPrice.setBounds(43, 171, 109, 14);
		p4.add(lblCalculatedPrice);
		
		textField_11 = new JTextField();
		textField_11.setBounds(177, 169, 137, 20);
		p4.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblPriceWindow = new JLabel("Price Per window");
		lblPriceWindow.setForeground(new Color(0, 128, 0));
		lblPriceWindow.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPriceWindow.setBounds(43, 102, 109, 14);
		p4.add(lblPriceWindow);
		
		textField_4 = new JTextField();
		textField_4.setBounds(176, 100, 138, 20);
		p4.add(textField_4);
		textField_4.setColumns(10);
		p1.add(l1);
		JPanel p6=new JPanel();
		p6.setBackground(new Color(240, 230, 140));
		p6.setForeground(new Color(255, 222, 173));
		p1.add(l1);
		tab.addTab("About us",null, p6,"About us");
		p6.setLayout(null);
		
		JButton btnContaictDetails = new JButton("Contaict details:");
		btnContaictDetails.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg)
			{
				ContactDetail contact=new ContactDetail();
			}
		});
		btnContaictDetails.setForeground(new Color(0, 128, 0));
		btnContaictDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnContaictDetails.setBounds(30, 155, 135, 23);
		p6.add(btnContaictDetails);
		
		JButton btnNewButton_4 = new JButton("Our History");
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HistroyWindow histroy=new HistroyWindow();
				
				
				
				
			}
		});
		btnNewButton_4.setForeground(new Color(0, 128, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(30, 65, 135, 23);
		p6.add(btnNewButton_4);
		
		JLabel lblToKnowAbout = new JLabel("To know about our window clean Service Business, ");
		lblToKnowAbout.setBackground(new Color(128, 128, 0));
		lblToKnowAbout.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblToKnowAbout.setForeground(new Color(139, 0, 0));
		lblToKnowAbout.setBounds(30, 11, 412, 29);
		p6.add(lblToKnowAbout);
		
		JLabel lblClickOnThe = new JLabel("Click on the histroy Button");
		lblClickOnThe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClickOnThe.setForeground(new Color(128, 0, 0));
		lblClickOnThe.setBounds(29, 36, 310, 14);
		p6.add(lblClickOnThe);
		
		JLabel lblForContactClick = new JLabel("For contact, Click on the Contact Detail Button");
		lblForContactClick.setForeground(new Color(128, 0, 0));
		lblForContactClick.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblForContactClick.setBounds(30, 121, 317, 23);
		p6.add(lblForContactClick);
		
		JPanel p5=new JPanel();
		p5.setForeground(new Color(240, 230, 140));
		p5.setBackground(new Color(240, 230, 140));
		tab.addTab("Help",null, p5,"Help");
		p5.setLayout(null);
		p5.setForeground(new Color(255, 235, 205));
		p5.setBackground(new Color(255, 222, 173));
		
		JLabel lblOnlineLinks = new JLabel("Online Links:");
		lblOnlineLinks.setForeground(new Color(0, 128, 0));
		lblOnlineLinks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnlineLinks.setBounds(43, 22, 77, 14);
		p5.add(lblOnlineLinks);
		
		setSize(546,454);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
	   RecordWindow w=new RecordWindow();
	    
	    
     
	}
}
