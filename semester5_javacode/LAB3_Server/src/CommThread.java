import java.io.*;
import java.net.*;

public class CommThread extends Thread {
private Socket cs;

CommThread(Socket s) 
			{cs = s;}

public void run()
	{
		try {
			InputStreamReader isr=new InputStreamReader(cs.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			String str=br.readLine();
			System.out.println("Received Request sent by client: "+str);
			
			PrintStream ps=new PrintStream(cs.getOutputStream());
			ps.println("Request Accepted reply bye server");	
			cs.close();	
		}
		catch (Exception e)
		{}
	}
}