package LongMuckTest;
public class Recursion {

    //TODO - INSERT YOUR CODE HERE
	public static void significantDigit(int num)
	{
		if(num<10)
		{
			System.out.println( num);
		}
		else
			//System.out.println(num);
			significantDigit(num/10);
			
	}


    /** When run, this class should call the method you create and
	print out the most significant digit. For the cases below
	your program should print:
	
	1
	7
	5
	5
	0

	if it works correctly
    */
    public static void main(String args[]) {

	significantDigit(123);
	significantDigit(789);
	significantDigit(55);
	significantDigit(5555555);
	significantDigit(0);
    }
}