package lab3;


import java.io.*;
import java.net.*;

public class MTServer {

    public static void main(String args[])
    {
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
	    	CommThread ct = new CommThread(client);
	    	ct.start();
	    	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}