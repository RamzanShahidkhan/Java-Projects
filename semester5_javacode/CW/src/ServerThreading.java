import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/*
 * This class is use for multi-threading.
 * This class extends the Thread class for multi-threading and used it's method run(). 
 */
public class ServerThreading extends Thread {
	private Socket cs;
	int a = 0;
	/*
	 * Constructor of ServerThreading initialize the Socket with the client Socket.
	 */
	public ServerThreading(Socket s) {
		cs = s;
	}
	/*
	 * This calls different thread with their priorities and execute the thread.
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		try {
			/*
			 * This Stream is used to read packet from the client side and is used to read 
			 * the object that client sent.
			 * The received packet is stored in variable p of class packet and type cast with packet
			 * class.
			 */
			ObjectInputStream ois = new ObjectInputStream(cs.getInputStream());
			packet p = (packet) ois.readObject();
			/*
			 * s variable of Integer type is used to store the sequence number received by client
			 * str variable store the packet of string type received from client 
			 * then print on the console sequence number and data of string
			 */
			int s = p.sequenceNo;
			String str = p.data;
			System.out.println("Data recieved: " + s + " " + str);
			/*
			 * This stream is used to send object to the client side and use the client socket cs
			 * to send to data on it
			 */
			ObjectOutputStream obs = new ObjectOutputStream(cs.getOutputStream());
			/*
			 * This condition checks that if variable a value and s that is value of sequence number
			 * are equal then print the message of ACK and also send this Seq-No to client to give 
			 * him the message of confirmation of received packet.
			 * Otherwise send object of 0 that indicates the NACK and it's mean packet send by cient 
			 * is not reached to the server.
			 */

				if (a == s) {
					System.out.println("sending ack");
					obs.writeObject(a);	
					a++;
					
				} else {
					System.out.println("sending NACK");
					obs.writeObject(-1);
				}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
