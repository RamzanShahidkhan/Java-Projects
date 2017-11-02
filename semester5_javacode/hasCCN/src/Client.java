import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Timer;

public class Client{
	public static Scanner sc = new Scanner(System.in);

	public static void funtion(){
			System.out.println("Enter your Name");
			String n = sc.next();
			System.out.println("Enter Your Password");
			String p = sc.next();
			Identify(n, p,"");
	}
	
	public static void Identify(String Name,String Password,String service){
		try
		{
			Socket client =new Socket("localhost",2222);
			ObjectOutputStream obs;
			ObjectSerialize ob = new ObjectSerialize(Name, Password);
			obs = new ObjectOutputStream(client.getOutputStream());
			obs.writeObject(ob);
			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.print(br.readLine());
			client.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void main(String args[])
	{
		while(true){
			funtion();
		}
	}
}