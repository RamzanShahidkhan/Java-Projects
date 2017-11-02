
public class Employe8 {
	private String fName;
	private  String lName;
	private static int count;

	public Employe8(String first, String last)
	{
		fName=first;
		lName=last;
		++count;
		System.out.printf("Employe constructor:%s %s; count:= %d\n",fName,lName,count);
		
	}
	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public static int getCount() {
		return count;
	}
}
