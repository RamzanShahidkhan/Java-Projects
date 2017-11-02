import java.util.Scanner;

public class Library {
	private final Book[] book=new Book[6];
	Scanner input;
	//private final Book[] book=new Book[6];
	private Library(Scanner s){
		input=s;
	}
   public void storebook()
	{
	   
		System.out.println(" Enter Book name :");
		String s=input.nextLine();
		System.out.println(" Enter author name :");
		String s2=input.nextLine();
		System.out.println(s.gettitle());
		
	}
   public void displaybook()
   {
	   
   }
  public static void main(String [] args)
  {
	 Book b=new Book("Love ", "Naeem Baloch", "Hidden story");
	 Library l=new Library();
	 l.storebook(b);
	 
  }
 
}
