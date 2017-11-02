import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * This class is used to create server and communication with client through socket.
 * This class used the ServerThreading class for multi-threading for clients.
 */
public class ServerCW {
	// port number of server 
	public static final int port=1122;
	/*
	 * This main method used to run the class and  the return void.
	 * I implemented all code in this method to communication with client and making server
	 * multi-threading us class ServerThreading
	 */
	public static void main(String [] arg)
	{
		try {
			/*
			 * This creates the ServerSocket which wait for request coming from clients
			 * and used port number that is same of the client number to make serverSocket
			 * and create communication between them.
			 */
			ServerSocket  ss = new ServerSocket(port);
			System.out.println("server is waiting for client request");
			while(true){
				/*
				 * This Socket calls the ServerSocket  method
				 * accept() for listening the requests and accept these requests
				 * then make a communication socket between server and client
				 *  
				 */
				Socket client =ss.accept();
				System.out.println("Request accepted by server");
				/*
				 * Made the object of ServerThreading class for multi-threading
				 * and it's argument is client socket.
				 * start method of Thread class is used to start the thread for client.
				 */
				ServerThreading th= new ServerThreading(client);
				th.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
