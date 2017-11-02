import java.io.*;
import java.net.*;

public class CommThread extends Thread {
	private Socket cs;
	private String [] users;
	private String [] passwords;
	private Boolean R1_Access[];
	private Boolean R2_Access[];
	private Boolean R3_Access[];
	
	
	private int[] numUsers;
	
	CommThread(Socket s, String [] user, String [] p,Boolean [] r1,Boolean [] r2,Boolean [] r3,int[] num) 
	{
		cs = s;
		users =user;
		passwords =p;
		numUsers =num;
		R1_Access = r1;
		R2_Access = r2;
		R3_Access = r3;
	}

	public void run()
	{
		try {
			InputStreamReader isr=new InputStreamReader(cs.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			PrintStream ps=new PrintStream(cs.getOutputStream());
			String str=br.readLine();
			System.out.println("Received Request Comm: "+str);
			if(str.compareTo("create")== 0)
			{
				String newuser=br.readLine();
				String newpass=br.readLine();
				String r1= br.readLine();   //read r1 
				String r2= br.readLine();  //read r2
				String r3= br.readLine();   //read r3
				
				numUsers[0]++;
				users[numUsers[0]-1] = newuser;
				passwords[numUsers[0]-1] = newpass;
				
				if(r1.compareTo("yes")==0)
					R1_Access[numUsers[0]-1] = true;
				else
					R1_Access[numUsers[0]-1] = false;
				if(r2.compareTo("yes")==0)
					R2_Access[numUsers[0]-1] = true;
				else
					R2_Access[numUsers[0]-1] = false;
				if(r3.compareTo("yes")==0)
					R3_Access[numUsers[0]-1] = true;
				else
					R3_Access[numUsers[0]-1] = false;
				ps.println("Create Request accepted:!");	
			}
			else if (str.compareTo("authenticate")==0)
			{
				String user =br.readLine();
				String password= br.readLine();
				//authentication process
				boolean found = false;
				System.out.println("Into authenticate:" +numUsers[0]);
				for(int i=0; i<numUsers[0]; i++)
				{
					System.out.println(users[i] +" "+passwords[i]);
					if((user.compareTo(users[i])==0) && ( password.compareTo(passwords[i])==0 ))
					{
						found = true;
						break;
						
					}
				}
				if(found==true)
					ps.println("Autorequest accepted!!");
				else
					ps.println("autorequest rejected!!");
			}
			else if(str.compareTo("authorize")==0)
			{
				String user=br.readLine();
				String password =br.readLine();
				String resource = br.readLine();
				//find user name Index
				int index;
				boolean found = false;
				int i;
				for(i =0; i< numUsers[0]; i++)
				{
					System.out.println(users[i] +" "+ passwords[i]);
					if((user.compareTo(users[i])==0) && (password.compareTo(passwords[i])==0))
					{
						found= true;
						index=i;
						break;
					}
					if(found == true)
					{
						boolean accessValue=false;
						if(resource.compareTo("R1")==0)
							accessValue =R1_Access[i];
						if(resource.compareTo("R2")==0)
							accessValue =R2_Access[i];
						if(resource.compareTo("R3")==0)
							accessValue =R3_Access[i];
						if(accessValue == true)
							ps.println("Authorized");
						else
							ps.println("Not Authorized");
					}
					else if (str.compareTo("quit") == 0)
					{
						ps.println("Finishing Connection");
						cs.close();	
					}
					else 
					{
						ps.println("Unexpected Command: Resetting Connection");
						cs.close();	
					}
					
				}
			}

			
			cs.close();	
		}
		catch (Exception e)
		{}
	}
}


