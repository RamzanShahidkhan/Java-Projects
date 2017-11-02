import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class AuthenticationThread extends Thread{
	private static Socket cs;

	AuthenticationThread(Socket s) 
	{cs = s;}

	public void run()
	{
		try {
			InputStreamReader isr = new InputStreamReader(cs.getInputStream());
			BufferedReader br =new BufferedReader(isr);
//			String option = br.readLine();;
				
				
				// start object
				
				
				// end object
			}
		catch (Exception e)
		{}
	}
}