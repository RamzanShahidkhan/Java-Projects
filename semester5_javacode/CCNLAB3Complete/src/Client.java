import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

    public static void main(String args[])
    {
    	try
    	{
		Socket client =new Socket("localhost",2222);
		PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
		if (args[0].compareTo("create") == 0)
		{
		pw.println(args[0]); //create
		pw.println(args[1]); //username
		pw.println(args[2]); //password
		pw.println(args[3]); //R1
		pw.println(args[4]); //R2
		pw.println(args[5]); //R3
		}
		else if (args[0].compareTo("authenticate") == 0)
		{
		pw.println(args[0]); //authenticate
		pw.println(args[1]); //username
		pw.println(args[2]); //password
		}
		else if (args[0].compareTo("authorize") == 0)
		{
		pw.println(args[0]); //authenticate
		pw.println(args[1]); //username
		pw.println(args[2]); //password
		pw.println(args[3]); //Resource Name
		}
		System.out.println("Request sent successfully");

		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.print(br.readLine());
		client.close();
		}
    	catch(Exception ex)
    	{
			System.out.println(ex);
    	}
    }


}