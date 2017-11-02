import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/*
 *  this is client class which is used to communicate with server and send packets 
 */
public class ClientCW {
	// variable a is an Integer
	static int a = 0;
	// array of strings. this is used to store the packet of string type
	static String[] arr = { "ram", "shah", "has", "badar", "hello" };
	
/*
 * This method is used to make client socket and used streams to read from server and 
 * write data on the server.
 */
	public static void clientRequest() {
		// use ObjectOutPutStream to write data on the server side
		// use ObjectInputStream to read data from server side
		ObjectOutputStream obs = null;
		ObjectInputStream ois = null;
		try {
			// this create Socket for client to communicate with the given specific port
			// it's arguments are localhost and port number of server
			Socket client = new Socket("localhost", 1122);
            
			while (true) {
				// use for loop to create some  packets of data
				for (int i = 0; i < 5; i++) {
					/* It initialize  the ObjectOutPutStream by making object 
					 * argument used send the data to server by using socket
					 * Create the object of packet class and initialized it with arguments
					 * sequence number and data of type string 
					 * this create a packet of data which send on server
					 * writeObject method used to write object on server side 
					 */
					obs = new ObjectOutputStream(client.getOutputStream());
					packet packet = new packet(i, arr[i]);
					obs.writeObject(packet);
					/*
					 * This stream is used to read data from server that sever send to
					 * the client
					 * readObject method read the object received from server and type
					 * cast it into integer 
					 */
					ois = new ObjectInputStream(client.getInputStream());
					int a = (int) ois.readObject();
					/*
					 * This checks the condition that if object get from server and
					 * sequence number of packet are same then return ACK
					 * Otherwise print the message of NACK
					 */
					if (a == i) {
						System.out.println("ACk");

					} else {
						System.out.println("NACK");
						// break;
					}
				}
				/*
				 * use to close the obs Stream
				 * close method is used to close the connection of client.
				 */
				obs.flush();
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	 * The main method is static and call when run the class. it initiate the program
	 * In this method i make the object of this class and called it's methods.
	 */

	public static void main(String[] args) {
		ClientCW cl = new ClientCW();
		clientRequest();
	}

}
