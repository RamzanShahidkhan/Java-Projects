import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
	private Connection conn=null;
	private Statement state=null;
	private ResultSet rs=null;
	private ResultSetMetaData metaData=null;
	private int numOfRows;
	
	private Boolean connectedToDataBase=false;
	//constructor
	public TableModel(String url, String username,String password,String query) throws SQLException
	{
		conn=DriverManager.getConnection(url,username,password);
		state=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
		
		connectedToDataBase=true;
		//setQuery(query);
	}
   //get class that represents column type it is a method
	public Class getColumnClass(int column) throws IllegalStateException
	{
		if(!connectedToDataBase)
			throw new IllegalStateException("Not connected to Database");
		try
		{
			String className=metaData.getColumnClassName(column+1);
			return Class.forName(className);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return Object.class;
	}
	@Override
	public int getColumnCount() throws IllegalStateException
	{
		// TODO Auto-generated method stub
		if(!connectedToDataBase)
			throw new IllegalStateException("Not connected to Database");
		
//		try 
//		{
//			return metaData.getColumnCount();
//		} 
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return 0;
	}
	public String getColumnName(int column)  throws IllegalStateException
	{
		if(!connectedToDataBase)
			throw new IllegalStateException("Not connected to DataBase in clnName");
		try {
			return metaData.getColumnName(column+1);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	@Override
	public int getRowCount() throws IllegalStateException
	{
		if(!connectedToDataBase)
			throw new IllegalStateException("Not connected to database");		
		return numOfRows;
	}
//obtain value in particular row and column
	@Override
	public Object getValueAt(int row, int column) 
	{
		if(!connectedToDataBase)
			throw new IllegalStateException("Not Connected to Database");
		try 
		{
			rs.absolute(row+1);
			return rs.getObject(column+1);
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ""; //if problem, return empty string object
	}
	
	public void setQuery(String query) throws SQLException,IllegalStateException
	{
		if(!connectedToDataBase)
			throw new IllegalStateException("Not Connected to Database");
		//specify query and execute it
		rs=state.executeQuery(query);
		metaData=rs.getMetaData();
		
		rs.last(); //move to last row 
		numOfRows=rs.getRow(); //get row number
		//notify JTable that model has changed
		fireTableStructureChanged();
		
	}
	//close statements and connection
	public void disconnectFromDataBase()
	{
		if(connectedToDataBase)
			try {
				rs.close();
				state.close();
				conn.close();
			} 
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally //update database connection status 
		{
			connectedToDataBase=false;
		}
	}

}
