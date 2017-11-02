package begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class autoThread extends Thread {
	String [] users =new String[]{"user1","user2","user3"};
	String [] passwords  =new String[] {"pass1","pass2","pass3"};
	public String name ="ramzan";
	public String password="ramzan";
	private Socket cs;
	public autoThread(Socket s) {
		cs=s;
	}
	
	public boolean name(String username, String pass){
		
		if(username.equals(name) && pass.equals(password) )
			return true;
	
		return false;	
	}
	@Override
	public void run() {
		super.run();
		 
		try {
			InputStreamReader	isr = new InputStreamReader(cs.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			String user=br.readLine();
			String pass=br.readLine();
			
			name(user,pass);
			
			System.out.println("name is: "+ user);
			System.out.println("password is :" +pass);
			
			PrintStream ps=new PrintStream(cs.getOutputStream());
			String result="Invaliduser";
			if((name(user,pass)) ==true ){
			 result ="validuser";	
			 
			}
			ps.print(result);
			cs.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
