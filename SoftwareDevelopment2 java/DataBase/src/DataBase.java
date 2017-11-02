import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	private String connectionString="jdbc:mysql://localhost/libdata";
	
	private Connection conn=null;
	private Statement st=null;
	private ResultSet rs=null;
	public DataBase() {
		try 
		{
			conn=DriverManager.getConnection(connectionString, "root","");
			st=conn.createStatement();
			rs=st.executeQuery("select * from book");  // to get result set not update 
			ResultSetMetaData rsmd=rs.getMetaData();
			//ResultSetMetaData rsmd=rs.getMetaData();
			while(rs.next())
			{
//				System.out.println(rs.getInt(1) + " "+ rs.getString(2)+" "+ 
//			rs.getInt(3)+ " "+ rs.getInt(4) );
				for(int i=1; i<=rsmd.getColumnCount(); i++)
				{
				    System.out.println(rs.getObject(i));
				}
			}
			rs.close();
			st.close();
			conn.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
          DataBase   b=new DataBase();
	}

}
