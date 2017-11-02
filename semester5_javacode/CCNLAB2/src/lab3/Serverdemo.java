package lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverdemo {
	public void run() throws Exception
	{
		ServerSocket ss= new ServerSocket(444);
		System.out.println("waiting for req yarra");
		Socket sock=ss.accept();
		InputStreamReader isr= new InputStreamReader(sock.getInputStream());
		BufferedReader br =new BufferedReader(isr);
		String message =br.readLine();
		System.out.println(message);
		if(message != null)
		{
			//PrintWriter pw = new PrintWriter(sock.getOutputStream());
			PrintStream pw = new PrintStream(sock.getOutputStream());
			pw.println("message received!!!!");
		}
		
	}

	public static void main(String[] args) throws Exception {
		Serverdemo s= new Serverdemo();
		s.run();

	}

}
