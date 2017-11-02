import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

public class SaveData extends Thread {

	public String connectionString="jdbc:mysql://localhost/iot";
	public Connection conn =null;
	public Statement stmt =null;
	public ResultSet rs=null;

	Socket cs;
	SaveData(Socket s) {
		cs = s;
	}
	public void run()
	{
		try {

			conn = DriverManager.getConnection(connectionString, "root", "");
			stmt = conn.createStatement();

			System.out.println("In saving ");
			String query =  "INSERT INTO iotdata (date,temperature,humidity,moisture)" +"VALUES (?,?,?,?)";
			String Datequery = "Update iotdata set Temperature=?,Humidity=?,Moisture=? "+"where Date=?";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			PreparedStatement preparedStmtupdate = conn.prepareStatement(Datequery);


			Calendar calendar = Calendar.getInstance();
			Date currDate = new Date (calendar.getTime().getTime());


			int i=1;
			Date lastdate=currDate;
			int temp=0,hum=0,mois=0;
			int lasttemp=0,lasthum=0,lastmois=0;
			int savemois=0;

			while(true){

				int maxmois=1030;
				InputStreamReader input=new InputStreamReader(cs.getInputStream());
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
							lastmois=(mois+savemois)/2;
							savemois=(maxmois-lastmois)%100;
							System.out.println("save mois= "+savemois);
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
							preparedStmtupdate.setInt(3, savemois);
							preparedStmtupdate.setDate (4, currDate);
							System.out.println(preparedStmtupdate);
							preparedStmtupdate.executeUpdate();
						}
						else{
							preparedStmt.setDate   (1, currDate);
							System.out.println("In insert query");
							preparedStmt.setInt(2, temp);
							preparedStmt.setInt(3, hum);
							preparedStmt.setInt(4, savemois);
							preparedStmt.executeUpdate();					

						}

					}
				}


			}

		}
		catch (Exception e){

		}
	}
}


