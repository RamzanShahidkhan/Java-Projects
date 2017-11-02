import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;


public class MTServer {
	
	static String  connectionString="jdbc:mysql://localhost/iot";
	static Connection conn =null;
 	 static Statement stmt =null;
	
	public static void main(String args[])
	{	
		try
		{
			conn = DriverManager.getConnection(connectionString, "root", null);
			stmt = conn.createStatement();
			
			// (2) create a java sql date object we want to insert
		    Calendar calendar = Calendar.getInstance();
		    java.sql.Date currDate = new java.sql.Date(calendar.getTime().getTime());
		    System.out.println(currDate);
		     
		    // insert the data
			//stmt.executeUpdate("INSERT INTO history " + "VALUES (currDate,34,85,35)");
			ServerSocket ss=new ServerSocket(1122);
			System.out.println("Waiting for client request.......");
			
			// the mysql insert statement
		      String query = " insert into history (Date, Temperature, Humidity,Moisture)"
		        + " values (?, ?, ?, ?)";
		      String query1 = " uodate history set (Date, Temperature, Humidity,Moisture)"
				        + " values (?, ?, ?, ?)";


		      // create the mysql insert preparedstatement
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      
			while(true){
				Socket client=ss.accept();
				System.out.println("Accepted Request ");
				
				InputStreamReader input=new InputStreamReader(client.getInputStream());
				BufferedReader b=new BufferedReader(input);
				String s=b.readLine();
				System.out.println(s);
				int count=1;
				int t = 0;
				int h = 0;
				int m = 0;
				while((s)!= null)
				{
					if(count==1 ){
						t=Integer.parseInt(s);
						count++;
					}
					if(count==2)
					{
						h=Integer.parseInt(s);
						count++;
					}
					if(count==3)
					{ 
						m=Integer.parseInt(s);
					}
				           s= b.readLine();
           	    }
				
				preparedStmt.setDate   (1, currDate);
				preparedStmt.setInt(2, t);
				preparedStmt.setInt(3, h);
				preparedStmt.setInt(4, m);
			      // execute the preparedstatement
			    // preparedStmt.execute();
			     preparedStmt.executeUpdate();
				
				input.close();
				b.close();
				client.close();
				
				/* Close all DB related objects */
	            stmt.close(); 
	            conn.close();   
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}