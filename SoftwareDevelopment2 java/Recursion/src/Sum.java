import java.io.FileNotFoundException;
/**
 * @author Personal
 *
 */
public class Sum {
	/**
	 * 
	 * @param number  pass an integer
	 * @return     the sum of numbers
	 */
	public int sum(int number)
	{
		if(number==1)
			return number;
		else
		{
			return number+sum(number-1);
		}	
	}
	/**
	 * this is the main method of application
	 * @param args    pass argument to method sum as integer
	 * @param s an integer argument
	 * @return some string
	 * @throws FileNotFoundException it throws file not found exception
	 */
	public static void  main(String[] args) {
		Sum ss=new Sum();
		System.out.println("sum is " +ss.sum(4));	
	}
}
