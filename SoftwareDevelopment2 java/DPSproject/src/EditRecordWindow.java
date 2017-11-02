import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.Font;

public class EditRecordWindow {
	public EditRecordWindow(){
	    JFrame frame = new JFrame();
	    Object rowData[][] = { { "2", "$8", "P","P","NT","NT",".",".","P","NT" },
	        { "6", "$11", "NT","NT",".",".","P", "P","NT","P"},
	        {"8","$10.50",".","P","P","NT",".","NT","NT","P"},
	        { "10", "$7", "P","P","NT","P","NT",".","P","." },
	        { "13", "$6.50", "NT",".",".","NT","P", "P","P","P"},
	        {"17","$9.50",".","P","NT","P",".",".","NT","P"}};
	    Object columnNames[] = { "House NO", "Price", "8th Jan 16","5th Feb 16","4th Mar 16","1st Apr 16","29th Apr 16","27th May 16","24th Jun 16","22nd Jul 16" };
	    frame.setSize(584, 298);
	    JTable table = new JTable(rowData, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    
	    JPanel mainPanel = new JPanel();
	    
	    mainPanel.setBackground(new Color(240, 230, 140));
	    
	    frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
	    mainPanel.setLayout(new BorderLayout());
	    mainPanel.add(scrollPane,BorderLayout.CENTER);
	    
	    JButton btnKalaa = new JButton("Kalaa");
	    btnKalaa.setBackground(new Color(0, 0, 0));
	    btnKalaa.setForeground(new Color(0, 0, 0));
	    //mainPanel.add(btnKalaa, BorderLayout.NORTH);
	    
	    JLabel label=new JLabel("Data");
	    label.setBackground(new Color(34, 139, 34));
	    label.setFont(new Font("Tahoma", Font.BOLD, 16));
	    mainPanel.add(label,BorderLayout.NORTH);
	    JPanel bPanel = new JPanel();
	    bPanel.setBackground(new Color(0, 128, 0));
	    bPanel.setLayout(new FlowLayout());
	    bPanel.add(new JButton("edit"));
	    bPanel.add(new JButton("Save Changes"));
	    
	    mainPanel.add(bPanel,BorderLayout.SOUTH);
	    
	    
    frame.setVisible(true);
	}
  public static void main(String args[]) {
	 EditRecordWindow w=new EditRecordWindow();
}
}