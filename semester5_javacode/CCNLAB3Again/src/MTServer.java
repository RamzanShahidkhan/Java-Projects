import java.io.*;
import java.net.*;

public class MTServer {

    public static void main(String args[])
    {
    	String [] users =new String[100];
    	String [] passwords =new String[100];
    	Boolean []R1_access = new Boolean[100];
    	Boolean []R2_access = new Boolean[100];
    	Boolean []R3_access = new Boolean[100];
    	int [] nummUsers = new int[1];
    	nummUsers[0] = 0;
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
	    	CommThread ct = new CommThread(client,users,passwords,R1_access,R2_access,R3_access,nummUsers);
	    	ct.start();
	    	}
		}
		catch(Exception e)
		{
			System.out.println("ex on server side "+e);
		}
    }
}