import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAuthor {
	static final String db_urll="jdbc:mysql://localhost/books";
	

	public static void main(String[] args) {
		Connection connection=null;
		Statement state=null;
		ResultSet rset=null;
		try
		{
			connection=DriverManager.getConnection(db_urll, "root", "");
			state=connection.createStatement();
			rset=state.executeQuery("Select AuthorID, FirstName,LastName from Author");
			ResultSetMetaData metaData=rset.getMetaData();
			int numOfColumn=metaData.getColumnCount();
			System.out.println("Author Table of Books DataBase: \n ");
			
			for(int i=1; i<=numOfColumn; i++)
			{
				System.out.printf("%-8s\t", metaData.getColumnName(i));
				//System.out.println();
				
			}
			while(rset.next())
			{
				for(int i=1; i<=numOfColumn; i++)
				System.out.printf("%-8s\t", rset.getObject(i));
				System.out.println();
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally {
			try 
			{
				rset.close();
				state.close();
				connection.close();
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		

	}

}
