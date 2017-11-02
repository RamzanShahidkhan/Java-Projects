package newcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Threading extends Thread{

	Socket client;

	public Threading (Socket s){

		client=s;

	}
	public void run(){

		InputStreamReader isr;
		try {
			isr = new InputStreamReader(client.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			String str=br.readLine();
			System.out.println(str);
			
			if(str!= ""){
				PrintStream ps=new PrintStream(client.getOutputStream());
				ps.println("1");
			}
			else{
				PrintStream ps=new PrintStream(client.getOutputStream());
				ps.println("0");
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
