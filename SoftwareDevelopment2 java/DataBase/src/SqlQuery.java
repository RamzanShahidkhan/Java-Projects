import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SqlQuery {

	private String connectionString="jdbc:mysql://localhost/guidata";
	private JFrame frame;
	private JTextField fText;
	private JTextField lText;
	private JTextField eText;
	private JTextField yText;
	private JLabel email;
	private JLabel year;
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SqlQuery window = new SqlQuery();
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
	public SqlQuery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		fText = new JTextField();
		fText.setColumns(10);
		
		lText = new JTextField();
		lText.setColumns(10);
		
		eText = new JTextField();
		eText.setColumns(10);
		
		yText = new JTextField();
		yText.setColumns(10);
		
		JLabel first = new JLabel("First Name:");
		
		JLabel last = new JLabel("Last Name:");
		
		email = new JLabel("email");
		
		year = new JLabel("Year");
		
		JButton save = new JButton("Save");
		save.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						String f=fText.getText();
						String l=lText.getText();
						String e=eText.getText();
						int y=Integer.parseInt(yText.getText());
						try 
						{
							conn=DriverManager.getConnection(connectionString, "root","");
							st=conn.createStatement();
							//st.executeUpdate("insert into employee values" +"(\""+f+"\",\""+l+"\",\""+e+"\")"+year.getText() );
							st.executeUpdate("insert into employee values" +"("+ '"'+ f+'"'+","+'"'+l+'"'+","+'"'+e+'"'+","+ y+")");
							 System.out.println("insert into employee values" +"("+ '"'+ f+'"'+","+'"'+l+'"'+","+'"'+e+'"'+","+ y+")");
						} 
						catch (SQLException e1) 
						{
							// TODO Auto-generated catch block
							System.err.println(" error in At query");
						}
					}
				}
				);
		JButton reset = new JButton("Reset");
		reset.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) 
					{
						fText.setText("");
						lText.setText("");
						eText.setText("");
						yText.setText("");
						
						
						
					}
				});
		
		JButton search = new JButton("Search");
		search.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(first, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(last)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(email)
										.addComponent(year))))
							.addGap(42)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lText)
								.addComponent(fText, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
								.addComponent(yText)
								.addComponent(eText)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(91)
							.addComponent(save)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(reset)
							.addGap(18)
							.addComponent(search)))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(fText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(first))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(eText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(email))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(yText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(year)))
						.addComponent(last))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(save)
						.addComponent(reset)
						.addComponent(search))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
