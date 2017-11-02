import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserAccount extends JFrame {
	private int [] days;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public UserAccount()
	{
		//super("Create Account");
		JTabbedPane tab=new JTabbedPane();
		JPanel p1=new JPanel();
		tab.addTab("SignUp",null, p1,"First Panel");
		p1.setLayout(null);
		days=new int[30];
		for(int i=0; i<days.length; i++)
		{
			
			days[i]=i;
			System.out.println(days[i]);
		}
		
		
		JLabel lblIfYouHave = new JLabel("If you have already account");
		lblIfYouHave.setForeground(new Color(0, 128, 0));
		lblIfYouHave.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfYouHave.setBounds(30, 11, 238, 14);
		p1.add(lblIfYouHave);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setForeground(new Color(0, 128, 0));
		lblEmail.setBounds(30, 36, 67, 14);
		p1.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(116, 34, 152, 20);
		p1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 128, 0));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(30, 61, 67, 14);
		p1.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 59, 152, 20);
		p1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserPayment pay=new UserPayment();
				setVisible(false);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBackground(new Color(240, 240, 240));
		btnLogin.setForeground(new Color(0, 128, 0));
		btnLogin.setBounds(296, 57, 89, 23);
		p1.add(btnLogin);
		
		JLabel lblFirstname = new JLabel("FirstName:");
		lblFirstname.setForeground(new Color(0, 128, 0));
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstname.setBounds(30, 158, 67, 14);
		p1.add(lblFirstname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 156, 152, 20);
		p1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLastname = new JLabel("LastName:");
		lblLastname.setForeground(new Color(0, 128, 0));
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastname.setBounds(30, 185, 67, 14);
		p1.add(lblLastname);
		
		textField_3 = new JTextField();
		textField_3.setBounds(116, 183, 152, 20);
		p1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail_1.setForeground(new Color(0, 128, 0));
		lblEmail_1.setBounds(30, 216, 77, 14);
		p1.add(lblEmail_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(116, 214, 152, 20);
		p1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setBounds(30, 247, 67, 14);
		p1.add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(116, 245, 152, 20);
		p1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setForeground(new Color(0, 128, 0));
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword.setBounds(30, 276, 83, 20);
		p1.add(lblConfirmPassword);
		
		textField_6 = new JTextField();
		textField_6.setBounds(116, 276, 152, 20);
		p1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDateOfBirth.setForeground(new Color(0, 128, 0));
		lblDateOfBirth.setBounds(30, 307, 74, 14);
		p1.add(lblDateOfBirth);
		JComboBox day;
		String [] d={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"
				,"25","26","27","28","29"};
//		for(int i=1; i<d.length; i++)
//		{
//			d[i]=i;
//		}
		        
		day = new JComboBox(d);
		
		
//		for( int i=0; i<days.length ; i++)
//		{
//			day.addItem(days[i]);
//			//day.it
//		}
		day.setBounds(116, 307, 37, 20);
		p1.add(day);
		
		String[] m = {"Jan","Feb","March","Apr","May","Jun","July","Aug","Sept","Nov","Oct","Decem"};
		JComboBox month = new JComboBox(m);
		month.setBounds(163, 307, 47, 20);
		p1.add(month);
		String [] y={"2016","2017","2018","2019"};
		JComboBox year = new JComboBox(y);
		year.setBounds(220, 307, 48, 20);
		p1.add(year);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserPayment pay=new UserPayment();
				setVisible(false);
			}
		});
		btnSignup.setForeground(new Color(0, 128, 0));
		btnSignup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnSignup.setBounds(127, 347, 89, 23);
		p1.add(btnSignup);
		
		JLabel lblIfYouHave_1 = new JLabel("If you have not already account, then create an account;");
		lblIfYouHave_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIfYouHave_1.setForeground(new Color(0, 128, 0));
		lblIfYouHave_1.setBounds(30, 105, 438, 14);
		p1.add(lblIfYouHave_1);
		
		
		getContentPane().add(tab);
		
		setSize(568,447);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
	    UserAccount a=new UserAccount();
	    
	    
     
	}
}
