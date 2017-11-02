

import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.Scanner;
public class Client {

	public static void main(String args[]) throws Exception
	{
		
		String fileName;
		fileName = args[0];
		System.out.println("Enter the name of file");
		Scanner scanner = new Scanner(System.in);
		String file_name = scanner.nextLine();
		File file = new File(file_name);
		Socket client =new Socket("localhost",2222);
		ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
 
        oos.writeObject(file.getName());
 
        FileInputStream fis = new FileInputStream(file);
        MTServer mt = new MTServer();
        byte [] buffer = new byte[];
        Integer bytesRead = 0;
 
        while ((bytesRead = fis.read(buffer)) > 0) {
            oos.writeObject(bytesRead);
            oos.writeObject(Arrays.copyOf(buffer, buffer.length));
        }
 
        oos.close();
        ois.close();
        System.exit(0);    
}
		
		
		
//		try
//		{
//			Socket client =new Socket("localhost",2222);
//			PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
//			//pw.println(args[0]);
//			pw.println("kakaaaa");
//			System.out.println("Request sent successfully");
//
//			BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
//			System.out.print(br.readLine());
//			client.close();
//		}
//		catch(Exception ex)
//		{
//			System.out.println(ex);
//		}
	}


}