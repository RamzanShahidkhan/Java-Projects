

public class Recurse {

    public int count(String input) {
	if (input.length() > 1)
	{
	    if(input.charAt(0) == 'x') 
	    {
		return 1 + count(input.substring(1));
	    }
	    else
		return 0 + count(input.substring(1));
	}
	else
	{
		if(input.charAt(0)=='x')
		return 1;
		else
			return 0;
	}
	
		
	//add your base cases here
    }

 public static void main(String [] arg)
 {
	  Recurse s=new Recurse();
	     System.out.println( s.count("raax"));
 }
 }