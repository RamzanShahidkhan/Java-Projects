
/**
 * @author Ramzan
 *
 */

public class pop {
	 private int s=0;
	 /**
	  * this method separate the numbers
	  * @param n    an integer   
	  * @return       int value
	  */
	  
	    public  int num(int n)
	    {
	    	if(n==0)
	    	{
	    		return n;
	    	}
	    	else
	    	{
	    		//System.out.println(n%10); // for reverse ordering of number 
	    		num(n/10);
	    		System.out.println(n%10);
	    	}
	    		
	    	return 0;
	    }
	    /**
	     * it's a main method 
	     * @param args      pass argumnet to main method  
	     */
	public static void main(String[] args) {
		pop p=new pop();
	    p.num(459);
		
		

	}

}
