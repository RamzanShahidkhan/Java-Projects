package lab3;

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
			//pw.println(args[0]);
			pw.println("kakaaaa");
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