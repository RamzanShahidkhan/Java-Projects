import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SendData extends Thread{

	public String connectionString="jdbc:mysql://localhost/iot";
	public Connection conn =null;
	public Statement stmt =null;
	public ResultSet rs=null;
	
	
	Socket cs;
	SendData(Socket s) {
		cs = s;
	}
	
	public void run()
	{
		try {

			conn = DriverManager.getConnection(connectionString, "root", "");
			stmt = conn.createStatement();

			String query =  "Select * from iotdata";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			rs=preparedStmt.executeQuery();
			System.out.println(rs);


			ObjectInputStream ois=new ObjectInputStream(cs.getInputStream());
			ObjectOutputStream oos=new ObjectOutputStream(cs.getOutputStream());
			
			while(rs.next()){

				System.out.println("In getting data.........");
				PrintWriter output=new PrintWriter(cs.getOutputStream());
				String date=rs.getString("date");
				String temperature=rs.getString("temperature");
				String humidity=rs.getString("humidity");
				String moisture=rs.getString("moisture");
				System.out.println(date);
				System.out.println(temperature);
				System.out.println(humidity);
				System.out.println(moisture);
//				if(date.isEmpty()){
//					break;
//				}
				Packet p=new Packet(date, temperature, humidity, moisture);
				oos.writeObject(p);

			}
			oos.close();
			cs.close();
			stmt.close();
			rs.close();

		}
		catch (Exception e){

			System.out.println(e);
		}
	}
}

