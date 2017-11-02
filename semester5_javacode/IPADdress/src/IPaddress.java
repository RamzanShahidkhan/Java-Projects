import java.net.*;

class IPaddress
{
   public static void main(String args[])
   {
      try
      {
        // InetAddress in=InetAddress.getByName("Enter the website here like www.google.com");
    	  
    	  InetAddress in=InetAddress.getByName("www.namal.edu.pk");
    	 // InetAddress class. InetAddress.getAllByName()
         System.out.println("The ip Address of site is:"+in.getHostAddress());
      }
      catch(Exception e)
      {
System.out.println("Some Exception has occurred with details"+e.getMessage());
      }
   }
}