
/**
 * @author Ramzan
 *
 */
public class Square {
	/**
	 * it will give square of the numbers
	 * @param n   pass an integer as parameter
	 * @return   value int type
	 */
	
	public static int square(int n)
	{
		if(n<=1)
			return 1;
		else
			return (square(n-1)+n*n);
	}
/**'
 * 
 * @param args   pass string argument as a array good work
 */
	public static void main(String[] args) {
		
		for(int i=0; i<4; i++)
		System.out.println("square of " +i +" is " +square(i));

	}

}
