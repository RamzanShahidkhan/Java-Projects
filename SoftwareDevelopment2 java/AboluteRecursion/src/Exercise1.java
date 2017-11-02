
public class Exercise1 {
	public static int cheers(int n)
	{
		if(n==0)
		{
			//System.out.println(n);
			return n;
		}
		else
		{
			
//			System.out.println("Hip");
//			cheers(n-1);
			System.out.println(n%10);
			cheers(n/10);
		}	
		return 0;
		
	}

	public static void main(String[] args)
	{
		cheers(1234);

	}

}
