package begin;

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
		//pw.println("kakaaa");
		Scanner sc=new Scanner(System.in);
		//do{
		System.out.println("Request sent successfully");
		
		
		System.out.println("enter name pass: ");
		String n1=sc.nextLine();
		String p1= sc.nextLine();
		pw.println(n1);
		pw.println(p1);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		//System.out.println("name on client:: "+br.readLine());
		//System.out.print("pass on client: "+br.readLine());
		System.out.println(br.readLine());
		client.close();
		//}while(true);
		
		}
    	catch(Exception ex)
    	{
			System.out.println(ex);
    	}
    }


}