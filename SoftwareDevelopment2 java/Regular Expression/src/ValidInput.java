import java.util.Scanner;

public class ValidInput {
	
	public static boolean validFName(String fName)
	{
		return fName.matches("[A-Z][a-zA-Z]*");
		
	}
	public static boolean validLNmae(String l)
	{
		// any letter split by space, apostrophe or hyphens
		return l.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*") ;
	}
    public static boolean validAddress(String adddress)
    {
    	return adddress.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
	public static boolean validCity(String city)
	{
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	public static boolean vailidState(String state)
	{
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	public static boolean validZip(String zip)
	{
		return zip.matches("(\\d{5}|[0-9]{5})");
		
	}
	public static boolean validPhone(String phone)
	{
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter FName yar");
		String fName=sc.nextLine();
		System.out.println("enter lastName");
		String lName=sc.nextLine();
		System.out.println("enter Address");
		String address=sc.nextLine();
		System.out.println("enter City Name");
		String city=sc.nextLine();
		System.out.println("enter state");
		String state=sc.nextLine();
		System.out.println("enter zipcode 5 digit only");
		String zip=sc.nextLine();
		System.out.println("enter phone number");
		String phone=sc.nextLine();
		
		System.out.println("\nvalidate result\n ");
		if(!ValidInput.validFName(fName))
			System.out.println("invalid fName");
		else if(!validLNmae(lName))
			System.out.println("invalid lastName");
		 if(!validAddress(address))
			System.out.println("invalid address");
		else if(!validCity(city))
			System.out.println("invalid city name");
		else if(!vailidState(state))
			System.out.println("invalid state");
		else if(!validZip(zip))
			System.out.println("invalid zipcode");
		else if(!validPhone(phone))
			System.out.println("invalid phone Number");
		else
			System.out.println("Thank you valid input ");
		
		

	}

}
