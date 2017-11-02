package newcode;

import java.net.*;

public class Server {

	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(2222);
			System.out.println("Waiting for client request");
			while(true){
				Socket client=ss.accept();
				Threading tr=new Threading(client);
				tr.start();
			}


		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}