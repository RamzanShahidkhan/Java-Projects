public class B6 {

    public static void main(String args[])
 {
	String s = args[0];
	int B = 0;
	int K = 0;
	
for (int i = 0; i < s.length(); i++) 
{
	    if (s.charAt(i) == 'B')
		
   B++;
	   
 if (s.charAt(i) == 'K')

		K++;
	
}

	
int r = Math.max(B, K);

	
double p = Math.pow(r, 4);

	
double d = p/args[0].indexOf('E');
	

	System.out.println(Math.tan(d));
  
  }
}