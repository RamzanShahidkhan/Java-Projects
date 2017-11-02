import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MTServer {

    public static void main(String args[])
    {
    	User u =new User("ramzan",1234);
    	User u1 = new User("shahid",1122);
    	int requests=0; 
    	
    	try
    	{
	    	ServerSocket ss=new ServerSocket(2222);
	    	System.out.println("Waiting for client request");
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("input authentication password: ");
	    	int input =sc.nextInt();
	    	
	    	//Socket client=ss.accept();
	    	while(u.getPassword()== input)
	    	{
	    		Socket client=ss.accept();
	    		System.out.println("Accepted Request# "+requests);
		    	CommThread ct = new CommThread(client);
		    	ct.start();
		    	requests++;
	    	}
	    }
		catch(Exception e)
		{ 
			System.out.println("ex is called in Server");
			System.out.println(e);
		}
    }
}