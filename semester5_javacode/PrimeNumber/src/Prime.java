
public class Prime {
	private static int gcd(int a, int b) {
	    int t;
	    while(b != 0){
	        t = a;
	        a = b;
	        b = t%b;
	    }
	    return a;
	}
	//And then:

	private static boolean relativelyPrime(int a, int b) {
	    return gcd(a,b) == 1;
	}
	public static void main(String [] args)
	{
		Prime p=new Prime();
	}

}
