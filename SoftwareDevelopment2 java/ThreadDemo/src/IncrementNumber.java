
public class IncrementNumber {
	private int counter;
	
	public IncrementNumber()
	{
		counter=0;
	}
	public int value()
	{
		return counter;
	}
	public void increment()
	{
		int local;
		local=counter;
		local++;
		counter=local;
	}
	

	

}
