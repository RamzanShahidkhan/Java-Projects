import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.jdbc.Field;

public class DepartmentFrame extends JFrame {
	private JTextField idfield;
	private JTextField fField;
	private JTextField lField;
	
	private JLabel  fLabel;
	
	private JLabel  idLabel;
	private JLabel  lLabel;
	private JLabel  dLabel;
	private JLabel  designLabel;
	private JLabel  scaleLabel;
	private JLabel  dateLabel;
	
	
	private JList depart;
	private JList design;
	
	private JPanel panel;
	private JPanel bpanel;
	
	private JButton save;
	private JButton reset;
	private GridBagLayout bagLayout;
	private GridBagConstraints constraints;
	
	private JRadioButton s1;
	private JRadioButton s2;
	private JRadioButton s3;
	private JRadioButton s4;
	
	private JComboBox comboBox;
	
	private ButtonGroup radioGroup;
	
	private static final String [] departList={"Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary","Compter science","Electrical engineering","IT support",
			"Labrary" };
	private static final String [] designList={"Professor","Associate Professor","Assistant professor","Lecturer",
			"Teaching Assistant","HOD ","TA ships","Visitor"};
	
	public DepartmentFrame()
	{
		super("Depart demo");
		
		bagLayout=new GridBagLayout();
		setLayout(bagLayout);
		constraints=new GridBagConstraints();
		
		idLabel=new JLabel("Staff ID");
		constraints.fill=GridBagConstraints.BOTH;
		addComponent(idLabel, 0, 0, 1, 1);
		
		//add(idLabel);
		idfield=new JTextField(10);
		//add(idfield);
		addComponent(idfield, 0, 1, 1, 1);
		
		fLabel=new JLabel("First Name");
		//add(fLabel);
		addComponent(fLabel, 1,0, 1, 1);
		
		fField=new JTextField(10);
		//add(fField);
		constraints.fill=GridBagConstraints.HORIZONTAL;
		addComponent(fField, 1, 1, 1, 1);
		
		lLabel=new JLabel("Last Name");
		//add(lLabel);
		addComponent(lLabel, 2, 0, 1, 1);
		
		lField=new JTextField(10);
		//add(lField);
		addComponent(lField, 2, 1, 1, 1);
		
		dateLabel=new JLabel("Date of Birth:");
		addComponent(dateLabel, 3, 0, 1, 1);
		
		comboBox=new JComboBox();
		addComponent(comboBox, 3,1, 1, 1);
		
		// radio button 
		panel=new JPanel();
				scaleLabel=new JLabel("Scale:");
				addComponent(scaleLabel, 4, 0, 1, 1);
				//add(scaleLabel);
				radioGroup=new ButtonGroup();
				s1=new JRadioButton("S1",true);
				s2=new JRadioButton("S2",false);
				s3=new JRadioButton("S3",false);
				s4=new JRadioButton("S4",false);
				panel.add(s1);
				panel.add(s2);
				panel.add(s3);
				panel.add(s4);
				

				radioGroup.add(s1);
				radioGroup.add(s2);
				radioGroup.add(s3);
				radioGroup.add(s4);
		
				constraints.fill=GridBagConstraints.NONE;
		addComponent(panel, 4, 1, 1, 1);
		
		constraints.anchor=GridBagConstraints.NORTHEAST;
		constraints.weightx=10;
		constraints.weighty=0;
		dLabel=new JLabel("Department");
		addComponent(dLabel, 0, 2, 1, 1);
		//add(dLabel);
		constraints.anchor=GridBagConstraints.NORTH;
		depart=new JList(departList);
		depart.setVisibleRowCount(6);
		//depart.setFixedCellHeight(5);
		addComponent(new JScrollPane(depart), 0, 3, 1, 2);
		
		constraints.anchor=GridBagConstraints.NORTHEAST;
		designLabel=new JLabel("Designation");
		addComponent(designLabel,3, 2, 1, 1);
		constraints.anchor=GridBagConstraints.NORTH;
		constraints.fill=GridBagConstraints.NONE;
		design=new JList(designList);
		design.setVisibleRowCount(6);
		addComponent(new JScrollPane(design),3 ,3, 1,1);
		
		constraints.weightx=10;
		constraints.weighty=0;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		bpanel=new JPanel();
		save=new JButton("Save");
	    bpanel.add(save);
		//addComponent(save, 4,1, 1, 1);
		
		reset=new JButton("Reset");
		bpanel.add(reset);
		//addComponent(reset, 4, 2, 1, 1);
		addComponent(bpanel, 5, 1, 1, 1);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private void addComponent(Component comp,int row, int col, int w, int h)
	{
		constraints.gridx=col;
		constraints.gridy=row;
		constraints.gridwidth=w;  //describe numbers of columns occupy by component
		constraints.gridheight=h;  //describe numbers of rows occupy by component
		bagLayout.setConstraints(comp, constraints);
		add(comp);
	}
	
	

	public static void main(String[] args) {
	DepartmentFrame d=new DepartmentFrame();

	}

}
