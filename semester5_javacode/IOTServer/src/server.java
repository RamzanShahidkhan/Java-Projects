import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public void receive() throws IOException{
		ServerSocket ss=new ServerSocket(1123);
		System.out.println("Waiting");
		while(true){
			Socket client=ss.accept();
			System.out.println("Accepted");
			InputStreamReader inp=new InputStreamReader(client.getInputStream());
			BufferedReader b=new BufferedReader(inp);
			String s=b.readLine();
			System.out.println(s);
	
		}
	}
	public static void main(String[] args) throws IOException {
		server s=new server();
		s.receive();
	}
}
