package lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Clientdemo {
	public void run() throws Exception
	{
		Socket s=new Socket("localhost",444);
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println("Hello to server  From Client");
		
		InputStreamReader isr = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		String message=br.readLine();
		System.out.println("get by server : "+ message);
	}
	public static void main(String[] args) throws Exception {
		Clientdemo c= new Clientdemo();
		c.run();
	}
}
