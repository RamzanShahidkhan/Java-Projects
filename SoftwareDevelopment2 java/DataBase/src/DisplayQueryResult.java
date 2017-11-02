import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.TableRowSorter;

public class DisplayQueryResult extends JFrame {
	static final String db_URl="jdbc:mysql://localhost/books";
	static final String username="root";
	static final String password="";
	 static final String Default_Query="Select * from Author";
	 
	 private TableModel tableModel;
	 private JTextArea queryArea;
	 
	 public DisplayQueryResult() 
	 {
		 super("DisplayQueryDemo");
		 try 
		 {
			tableModel=new TableModel(db_URl, username, password, Default_Query);
			//set up textArea in which user type query
			queryArea=new JTextArea(Default_Query,3,10);
			queryArea.setWrapStyleWord(true);
			queryArea.setLineWrap(true);
			
			JScrollPane scrollPane=new JScrollPane(queryArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED
					, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			//button for submittimg query
			JButton submitButton=new JButton("Submit Query");
			
			Box boxNorth=Box.createHorizontalBox();
			boxNorth.add(scrollPane);
			boxNorth.add(submitButton);
			//create JTable Base on the TableModel
			JTable resultTable=new JTable(tableModel);
			JLabel filterLabel=new JLabel("Filter:");
			final JTextField filterText=new JTextField();
			JButton filterButton=new JButton("Apply Filter:");
			Box boxSouth=Box.createHorizontalBox();
			
			boxSouth.add(filterLabel);
			boxSouth.add(filterText);
			boxSouth.add(filterButton);
			//place GUI component on content pane
			add(boxNorth,BorderLayout.NORTH);
			add(new JScrollPane(resultTable), BorderLayout.CENTER);
			add(boxSouth, BorderLayout.SOUTH);
			
			submitButton.addActionListener(
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							//perform a new query
							try 
							{
								tableModel.setQuery(queryArea.getText());
							} 
							catch (IllegalStateException sql) 
							{
								JOptionPane.showMessageDialog(null, sql.getMessage(),
								"DataBase Error",JOptionPane.ERROR_MESSAGE);
								//e.printStackTrace();
								//try to recover from user invalid query and execute default query
								try
								{
									tableModel.setQuery(Default_Query);
									queryArea.setText(Default_Query);
								} 
								catch (IllegalStateException sqlex2) 
								{
									JOptionPane.showMessageDialog(null,sqlex2.getMessage(),"dataBase Error"
											,JOptionPane.ERROR_MESSAGE);
									//ensure database connection is closed
									tableModel.disconnectFromDataBase();
									System.exit(1); //terminate application
									
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					});
			final TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(tableModel);
			resultTable.setRowSorter(sorter);
			setSize(500,250);
			setVisible(true);
			
			filterButton.addActionListener(
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							String text=filterText.getText();
							if(text.length()==0)
								sorter.setRowFilter(null);
							else
								try
							{
								 sorter.setRowFilter(RowFilter.regexFilter(text));
							}
							catch (PatternSyntaxException e) {
								JOptionPane.showMessageDialog(null,"bad regex pattern",
										"bad regex Pattern",JOptionPane.ERROR_MESSAGE);
							}
							
						}
					});
					
			
			
		} 
		 catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"dataBase Eroor",JOptionPane.ERROR_MESSAGE);
			tableModel.disconnectFromDataBase();
			System.exit(1);
			
		}
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 addWindowListener(
				 new WindowAdapter()
				 {
					 public void windowClosed(WindowEvent event)
					 {
						 tableModel.disconnectFromDataBase();
						 System.exit(0); 
					 } 
				});
	}
	 public static void main(String args [])
	 {
		 new DisplayQueryResult();
	 

}
}