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
		//Scanner input = new Scanner ();
		pw.println("kaku");
		System.out.println("Request sent successfully");

		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.print("data sent by server yar = "+ br.readLine());
		client.close();
		}
    	catch(Exception ex)
    	{
    		System.out.println("exception method is called in client");
			System.out.println(ex);
    	}
    }


}