
public class sum {
	
	int Sum(int n)
	{
		if(n!=0){
		return n+Sum(n-1);
		}
		else
		{
			return n;
		}
		
		
	}

	public static void main(String[] args) {
	  sum s=new sum();
	 System.out.println( s.Sum(4));

	}

}
