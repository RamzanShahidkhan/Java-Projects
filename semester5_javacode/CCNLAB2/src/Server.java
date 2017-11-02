import java.io.*;
import java.net.*;

public class Server {

	public static void main(String args[])
	{
		String [] users =new String[]{"user1","user2","user3"};
		String [] passwords  =new String[] {"pass1","pass2","pass3"};

		try
		{
			//ServerSocket ss=new ServerSocket(1122,0,InetAddress.getLocalHost());

			ServerSocket ss=new ServerSocket(2222);
			while(true){
				System.out.println("Waiting for client request");
				Socket client=ss.accept();
				System.out.println("Accepted connection request");
				InputStreamReader isr=new InputStreamReader(client.getInputStream());
				BufferedReader br =new BufferedReader(isr);
				String username = br.readLine();
				String password =br.readLine();
				System.out.println("Received username is : "+ username);
				System.out.println("Received password is : " + password);
				//authenticate user
				String result ="Invalid";
				for (int i = 0; i < users.length; i++) 
				{
					if((users[i].compareTo(username) == 0) && (passwords[i].compareTo(password)==0))
					{
						result ="valid";
						break;
					}

				}
				PrintStream ps=new PrintStream(client.getOutputStream());
				//ps.println("Data has been received / send  by server");
				ps.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}