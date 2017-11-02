import java.io.*;
import java.net.*;

public class MTServer {

	public static void main(String args[])
    {
    	String[] users= new String[100];
		String[] passwords= new String[100];
		Boolean[] R1_Access= new Boolean[100];
		Boolean[] R2_Access= new Boolean[100];
		Boolean[] R3_Access= new Boolean[100];
		//initialize
		int numUsers[]= new int[1]; 
		numUsers[0]=0;
    	int requests=0; 
    	try
    	{
	    	ServerSocket ss=new ServerSocket(2222);

	    	System.out.println("Waiting for client request");
	    	while (true)
	    	{
	    	Socket client=ss.accept();
	    	requests++;
	    	System.out.println("Accepted Request# "+requests);
	    	CommThread ct = new CommThread(client,users,passwords,R1_Access,R2_Access,R3_Access,numUsers);
	    	ct.start();
	    	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}