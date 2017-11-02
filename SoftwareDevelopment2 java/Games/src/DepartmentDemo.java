import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DepartmentDemo extends JFrame {
	private JTextField idfield;
	private JTextField fField;
	private JTextField lField;
	
	private JLabel  fLabel;
	
	private JLabel  idLabel;
	private JLabel  lLabel;
	private JLabel  dLabel;
	private JLabel  designLabel;
	private JLabel  scaleLabel;
	
	private JPanel panel;
	private JPanel panel1;
	private JPanel bPanel;
	private JList depart;
	private JList design;
	
	private JButton save;
	private JButton reset;
	
	private JRadioButton s1;
	private JRadioButton s2;
	private JRadioButton s3;
	private JRadioButton s4;
	
	private ButtonGroup radioGroup;
	
	private static final String [] departList={"Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary" };
	private static final String [] designList={"Professor","Associate Professor","Assistant professor","Lecturer",
			"Teaching Assistant","HOD "};
	
	public DepartmentDemo()
	{
		super("Depart demo");
		setLayout(new FlowLayout());
		//setLayout(new BoxLayout(4, ));
		panel=new JPanel();
		//panel.setLayout(new GridBagLayout());
		panel.setLayout(new GridLayout(3, 2, 1, 1));
		idLabel=new JLabel("Staff ID");
		panel.add(idLabel);
		//panel.add(idArea);
		idfield=new JTextField(10);
		panel.add(idfield);
		fLabel=new JLabel("First Name");
		panel.add(fLabel);
		fField=new JTextField(10);
		panel.add(fField);
		
		lLabel=new JLabel("Last Name");
		panel.add(lLabel);
		lField=new JTextField(10);
		panel.add(lField);
		// radio button 
//				scaleLabel=new JLabel("Scale");
//				add(scaleLabel);
//				radioGroup=new ButtonGroup();
//				s1=new JRadioButton("S1",true);
//				s2=new JRadioButton("S2",false);
//				s3=new JRadioButton("S3",false);
//				s4=new JRadioButton("S4",false);
//				panel.add(new JPanel());
//				panel.add(new JPanel());
//				panel.add(s1);
//				panel.add(s2);
//				panel.add(s3);
//				panel.add(s4);
//				
//
//				radioGroup.add(s1);
//				radioGroup.add(s2);
//				radioGroup.add(s3);
				//radioGroup.add(s4);
		
		add(panel);
//		save=new JButton("Save");
//		panel.add(save);
		//add(panel,BorderLayout.WEST);
		panel1=new JPanel();
		//panel1.setLayout(new FlowLayout());
		//panel1.setLayout(new GridBagLayout());
		panel1.setLayout(new GridLayout(2,2));
		dLabel=new JLabel("Department");
		panel1.add(dLabel);
		depart=new JList(departList);
		depart.setVisibleRowCount(5);
		//depart.setFixedCellHeight(5);
		panel1.add(new JScrollPane(depart));
		designLabel=new JLabel("Department");
		panel1.add(designLabel);
		design=new JList(designList);
		design.setVisibleRowCount(4);
		panel1.add(new JScrollPane(design));
		
		add(panel1,BorderLayout.EAST);
		bPanel=new JPanel();
		save=new JButton("Save");
		bPanel.add(save);
		reset=new JButton("Reset");
		bPanel.add(reset);
		
		add(bPanel,BorderLayout.SOUTH);
		
		
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
	DepartmentDemo d=new DepartmentDemo();

	}

}
