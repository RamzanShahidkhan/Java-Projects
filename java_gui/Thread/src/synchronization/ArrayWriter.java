package synchronization;

public class ArrayWriter implements Runnable {
	private final SimpleArray sharedArray;
	private final int startvalue;
	public ArrayWriter(int value,SimpleArray array) {
		startvalue=value;
		sharedArray=array;
	}

	@Override
	public void run() 
	{
		for (int i = startvalue; i < startvalue+3; i++) 
		{
			sharedArray.add(i);
			
		}
			
	}

}
