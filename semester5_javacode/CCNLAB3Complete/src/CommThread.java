import java.io.*;
import java.net.*;

public class CommThread extends Thread {
private Socket cs;
private String[] users;
private String[] passwords;
private Boolean[] R1_Access;
private Boolean[] R2_Access;
private Boolean[] R3_Access;
private int[] numUsers;

CommThread(Socket s, String[] u, String[] p, Boolean[] r1, Boolean[] r2, Boolean[] r3, int[] un ) 
			{
				cs = s;
				users = u;
				passwords = p;
				R1_Access = r1;
				R2_Access = r2;
				R3_Access = r3;
				numUsers = un;
			}

public void run()
	{
		try {
			InputStreamReader isr=new InputStreamReader(cs.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			PrintStream ps=new PrintStream(cs.getOutputStream());

			//get the command {create, authenticate, authorize}
			String str=br.readLine();
			System.out.println("Received RequestF: "+str);
			if (str.compareTo("create") == 0)
			{
				//get user name
				String newuser=br.readLine();
				//get password
				String newpassword=br.readLine();
				//get R1 access
				String r1=br.readLine();
				//get R2 access
				String r2=br.readLine();
				//get R3 access
				String r3=br.readLine();
				numUsers[0]++;
				users[numUsers[0]-1] = newuser;
				passwords[numUsers[0]-1] = newpassword;
				if (r1.compareTo("yes") == 0)
					R1_Access[numUsers[0]-1] = true;
				else
					R1_Access[numUsers[0]-1] = false;

				if (r2.compareTo("yes") == 0)
					R2_Access[numUsers[0]-1] = true;
				else
					R2_Access[numUsers[0]-1] = false;

				if (r3.compareTo("yes") == 0)
					R3_Access[numUsers[0]-1] = true;
				else
					R3_Access[numUsers[0]-1] = false;


				ps.println("Create Request Accepted");


			}
			else if (str.compareTo("authenticate") == 0)
			{
				//get user name
				String user=br.readLine();
				//get password
				String password=br.readLine();	
				//Authentication Process and answer
				boolean found = false;
				System.out.println("Into Authnticate "+ numUsers[0]);
				for (int i=0; i<numUsers[0]; i++)
					{
					System.out.println(users[i] +" "+passwords[i]);
					if ((user.compareTo(users[i]) == 0) && (password.compareTo(passwords[i])==0))
						{
						found = true;
						break;
						}
					}
				if (found == true)
					ps.println("AutheRequest Accepted");
				else
					ps.println("AutheRequest Rejected");					

			}
			else if (str.compareTo("authorize") == 0)
			{
				//get user name
				String user=br.readLine();
				//get password
				String password=br.readLine();	
				//get Resource
				String resource=br.readLine();
				//Find User Name index
				int index;
				boolean found = false;
				int i;
				for (i=0; i<numUsers[0]; i++)
					{
					System.out.println(users[i] +" "+passwords[i]);
					if ((user.compareTo(users[i]) == 0) && (password.compareTo(passwords[i])==0))
						{
						found = true;
						index = i;
						break;
						}
					}
				if (found == true)
					{
					boolean accessVal = false;
					if (resource.compareTo("R1") == 0)	
						accessVal=R1_Access[i];
					if (resource.compareTo("R2") == 0)	
						accessVal=R2_Access[i];
					if (resource.compareTo("R3") == 0)	
						accessVal=R3_Access[i];
					if (accessVal == true)
						ps.println("Authorized");
					else
						ps.println("Not Authorized");
					}
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
		catch (Exception e)
		{}
	}
}


