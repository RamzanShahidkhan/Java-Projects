
public class RaceCounditionTest extends Thread {
	private Counter cObject;
	public RaceCounditionTest(Counter ctr)
	{
		cObject=ctr;
	}
	public void run()
	{
		cObject.increment();
	}
	public static void main(String[] args)
	{
		int i;
		Counter mCounter=new Counter();
		RaceCounditionTest[] threads=new RaceCounditionTest[30000];
		System.out.println("The counter is "+mCounter.value() );
		for( i=0; i<threads.length;  i++)
		{
			threads[i]=new RaceCounditionTest(mCounter);
			threads[i].start();
		}
		for(i=0; i<threads.length; i++)
		{
			try 
			{
				threads[i].join();  //wait for the thread to complete
			} 
			catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}  
		}
		System.out.println("The counterrr is  "+ mCounter.value());
		
	}

}
