

import java.io.*;
import java.net.*;

public class CommThread extends Thread {
	private Socket cs;
	public int buffer_size=100;


	CommThread(Socket s) 
	{cs = s;}

	public void run()
	{
		//try {
		//			InputStreamReader isr=new InputStreamReader(cs.getInputStream());
		//			BufferedReader br =new BufferedReader(isr);
		//			String str=br.readLine();
		//			System.out.println("Received Request: "+str);

		//			PrintStream ps=new PrintStream(cs.getOutputStream());
		//			ps.println("Request Accepted");	
		//			cs.close();	
		//		}
		//		catch (Exception e)
		//		{}
		try {
			saveFile(cs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void saveFile (Socket cs) throws Exception
	{
		try {
			ObjectOutputStream oos= new ObjectOutputStream(cs.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(cs.getInputStream());
			FileOutputStream fos=null;
			byte[] buffer = new byte [buffer_size];
			// 1 read file name 
			Object o=ois.readObject();
			if(o instanceof String)
			{
				fos = new FileOutputStream(o.toString());
			}
			else 
			{
				throwException("Something is wrong!");
			}
			//2. read file to the end 
			Integer byteRead= 0;
			do
			{
				o = ois.readObject();
				 
	            if (!(o instanceof Integer)) {
	                throwException("Something is wrong");
	            }
	 
	            byteRead = (Integer)o;
	 
	            o = ois.readObject();
	 
	            if (!(o instanceof byte[])) {
	                throwException("Something is wrong");
	            }
	 
	            buffer = (byte[])o;
	 
	            // 3. Write data to output file.
	            fos.write(buffer, 0, byteRead);
			}
			while(byteRead == buffer_size);
			System.out.println("File transfer success");
	         
	        fos.close();
	 
	        ois.close();
	        oos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void throwException(String message) throws Exception {
        throw new Exception(message);
    }
}


