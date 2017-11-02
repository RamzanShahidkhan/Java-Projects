import java.io.ObjectInputStream;
import java.net.*;

public class MTServer extends Client{

	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(2222);
			while (true)
			{
				System.out.println("Waiting for client request");
				Socket client = ss.accept();
				ObjectInputStream obs = new ObjectInputStream(client.getInputStream());
				ObjectSerialize os=(ObjectSerialize) obs.readObject();
				System.out.println(os.name);
//				AuthenticationThread a = new AuthenticationThread(client);
//				a.start();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}