import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ListBox extends JFrame implements ActionListener {
	private JList itemList;
	private JList copyList;
	private JButton addButton;
	private JButton rButton;
	private JPanel   bp;
	private static final  String [] items={ "Black", "Yellow","Red","White","Gray","Green","Pink","orange",
			"Magenta","Blue"};
	
	public ListBox()
	{
		super("JList Demo Yar");
		setLayout(new FlowLayout());
		//setLayout(new BorderLayout());
		itemList=new JList(items);
		itemList.setVisibleRowCount(5);
		itemList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(itemList));
		//add(itemList);
		bp=new JPanel();
		//bp.setLayout(new BorderLayout());
		addButton=new JButton("Add >>>");
		addButton.addActionListener(this);
		bp.add(addButton,BorderLayout.NORTH);
		
		rButton=new JButton("<<Remove");
		rButton.addActionListener(this);
		bp.add(rButton,BorderLayout.SOUTH);
		add(bp);
		
		copyList=new JList();
		copyList.setVisibleRowCount(8);
		copyList.setFixedCellWidth(100);
		copyList.setFixedCellHeight(15);
		copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyList));
		
		
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		///copyList.setListData(itemList.getSelectedValues());
		JButton j=(JButton)e.getSource();
		String s=j.getText();
		if(s.equals("Add >>>"))
		{
			copyList.setListData(itemList.getSelectedValues());
		}
		else if(s.equals("<<Remove"))
		{
			
		}
		
	}
	
	

	public static void main(String[] args) {
		ListBox b=new ListBox();
		

	}




}
