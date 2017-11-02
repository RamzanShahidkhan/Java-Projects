import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InfoAboutHouses {
	public InfoAboutHouses(){
	    JFrame frame = new JFrame();
	    Object rowData[][] = { { "2", "$8", "P","P","NT","NT",".",".","P","NT" },
	        { "6", "$11", "NT","NT",".",".","P", "P","NT","P"},
	        {"8","$10.50",".","P","P","NT",".","NT","NT","P"},
	        { "10", "$7", "P","P","NT","P","NT",".","P","." },
	        { "13", "$6.50", "NT",".",".","NT","P", "P","P","P"},
	        {"17","$9.50",".","P","NT","P",".",".","NT","P"}};
	    Object columnNames[] = { "House NO", "Price", "8th Jan 16","5th Feb 16","4th Mar 16","1st Apr 16","29th Apr 16","27th May 16","24th Jun 16","22nd Jul 16" };
	    JTable table = new JTable(rowData, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(800, 200);
	    frame.setVisible(true);
	}
  public static void main(String args[]) {
	  InfoAboutHouses i = new InfoAboutHouses();
}
}