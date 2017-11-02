package CheckboxStart;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//with main method in the class
public class MultipleSelectionFrame extends JFrame {

	

		private JList colorJList;
		private JList copyJList;
		private JButton copyJButton;
		private static final String[] colorNames={"Black","Blue","cyan","Drak Gray",
				"Gray","Green","Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
		
		
		public MultipleSelectionFrame() 
		{
			super("Multiple selection list,,,,");
			setLayout(new FlowLayout());
			colorJList=new JList(colorNames);
			colorJList.setVisibleRowCount(5);
			colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			add(new JScrollPane(colorJList));
			copyJButton =new JButton("copy>>");
			copyJButton.addActionListener(
            new ActionListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void actionPerformed(ActionEvent event) 
					{
					
					copyJList.setListData(colorJList.getSelectedValues());
				}
			}
            );
			add(copyJButton);
			copyJList =new JList();
			copyJList.setVisibleRowCount(6);
			copyJList.setFixedCellWidth(100);
			copyJList.setFixedCellHeight(15);
			copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			add(new JScrollPane(copyJList));
		}
		public static void main(String[] args)
		{
			MultipleSelectionFrame multi=new MultipleSelectionFrame();
			multi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			multi.setSize(400,360);
			multi.setVisible(true);
		}

	}



