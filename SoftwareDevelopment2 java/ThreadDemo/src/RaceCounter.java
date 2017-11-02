
public class RaceCounter extends Thread{
	public IncrementNumber obj;
	public RaceCounter(IncrementNumber ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.increment();
	}
	
	public static void main(String[] args) 
	{
		
		IncrementNumber count=new IncrementNumber();
		RaceCounter [] thread=new RaceCounter[1000];
		System.out.println("the Counter value is "+ count.value());
		for(int i=0; i<thread.length; i++)
		{
			thread[i]=new RaceCounter(count);
			thread[i].start();
		}
		System.out.println("The counter value is "+ count.value());

	}
	

}
