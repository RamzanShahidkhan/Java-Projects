import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;


public class Server {


	static String  connectionString="jdbc:mysql://localhost/iot";
	static Connection conn =null;
	static Statement stmt =null;

	public static void main(String args[]) throws SQLException
	{ 
		conn = DriverManager.getConnection(connectionString, "root", null);
		stmt = conn.createStatement();
		String query = " insert into iotdata (Date, Temperature, Humidity,Moisture)"
				+ " values (?, ?, ?, ?)";
		String Datequery = " Update iotdata set Temperature=?,Humidity=?,Moisture=? "+"where Date=?";

		PreparedStatement preparedStmt = conn.prepareStatement(query);
		PreparedStatement preparedStmtupdate = conn.prepareStatement(Datequery);
		
		// (2) create a java sql date object we want to insert
		Calendar calendar = Calendar.getInstance();
		Date currDate = new Date (calendar.getTime().getTime());
		System.out.println(currDate);
		
		int i=1;
		Date lastdate=currDate;
		int temp=0,hum=0,mois=0;
		int lasttemp=0,lasthum=0,lastmois=0;
	//	double newtemp=0,newhum=0,newmois=0;
		
		try
		{
			ServerSocket ss=new ServerSocket(1122);
			System.out.println("Waiting for client request????????");
			while(true){
				Socket client=ss.accept();
				System.out.println("Accepted Request ");

				InputStreamReader input=new InputStreamReader(client.getInputStream());
				BufferedReader b=new BufferedReader(input);
				String s=b.readLine();
				while((s)!= null){

					if(i<=3){
						if(i==1){
							System.out.println("Temprature = "+s);
							temp=Integer.parseInt(s);
							lasttemp=(temp+lasttemp)/2;
							System.out.println("Updated temp= "+lasttemp);
							System.out.println();
							
						}
						
						else if(i==2){
							System.out.println("Humidity = "+s);
							hum=Integer.parseInt(s);
							lasthum=(hum+lasthum)/2;
							System.out.println("Updated hum= "+lasthum);
							System.out.println();
						}
						
						else{
							System.out.println("Moisture = "+s);
							mois=Integer.parseInt(s);
							lastmois=(mois+lastmois)/2;
							System.out.println("Updated mois= "+lastmois);
							System.out.println();
						}

						s= b.readLine();
						i++;
					}
					else{
						i=1;
						if(currDate.compareTo(lastdate)==0){
							System.out.println("In update query");
							preparedStmtupdate.setInt(1, lasttemp);
							preparedStmtupdate.setInt(2, lasthum);
							preparedStmtupdate.setInt(3, lastmois);
							preparedStmtupdate.setDate (4, currDate);
							System.out.println(preparedStmtupdate);
							preparedStmtupdate.executeUpdate();
						}
						else{
							preparedStmt.setDate   (1, currDate);
							preparedStmt.setInt(2, temp);
							preparedStmt.setInt(3, hum);
							preparedStmt.setInt(4, mois);
							preparedStmt.executeUpdate();						
							
						}

					}
					

				}


				stmt.close(); 
	            conn.close();   
				input.close();
				b.close();
				client.close();

			}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}