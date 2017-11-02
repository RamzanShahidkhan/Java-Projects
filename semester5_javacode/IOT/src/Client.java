import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("Connecting....");
		Socket s=new Socket("172.16.11.104",1122);
		PrintWriter p=new PrintWriter(s.getOutputStream());
		p.write("Hello");
		p.flush();
		p.close();
		s.close();
	}

}
