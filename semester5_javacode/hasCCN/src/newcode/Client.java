package newcode;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
	static int n = 0;
	public void connector(String x){

		try
		{
			Socket client =new Socket("localhost",2222);
			PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
			pw.println(n+":"+x);

			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
			String sr = br.readLine();
			int check = Integer.parseInt(sr);
			if(check == 1){
				System.out.println("ACK");
				n++;
				client.close();
			}
			else{
				System.out.println("NACK");
				client.close();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println(" Enter a String ");
			String s = sc.nextLine();
			String [] arr = s.split(" ");
			Client c = new Client();
			for(int i=0;i<arr.length;i++){
				c.connector(arr[n]);
			}
		}
	}
}