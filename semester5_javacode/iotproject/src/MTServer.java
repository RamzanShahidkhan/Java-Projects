import java.net.*;

public class MTServer {

	public static void main(String args[])
	{
		int clients=1; 
		try
		{

			@SuppressWarnings("resource")
			ServerSocket ss=new ServerSocket(1122);

			System.out.println("Waiting for client request");

			while (clients<3)
			{
				Socket client=ss.accept();
				System.out.println(client.getInetAddress());


				System.out.println("Accepted Request# "+clients);

				if(clients==2){
					
					System.out.println("Saving data.........");
					SaveData save = new SaveData(client);
					save.start();
					clients++;
					System.out.println("Going....");

				}
				else if(clients==1){
					System.out.println("Waiting");
					
					System.out.println("Sending data.......");
					SendData send=new SendData(client);
					send.start();
				}
			}
			System.out.println(clients);
			clients++;

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}