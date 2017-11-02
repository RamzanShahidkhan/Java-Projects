package synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharerArrayTest {
	public static void main (String [] args)
	{
		SimpleArray sharedSimpleArray=new SimpleArray(6);
		ArrayWriter w1=new ArrayWriter(1, sharedSimpleArray);
		ArrayWriter w2=new ArrayWriter(11, sharedSimpleArray);
		
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.execute(w1);
		executor.execute(w2);
		
		executor.shutdown();
		
		try {
			boolean teaskEnded=executor.awaitTermination(1, TimeUnit.MINUTES);
		    if(teaskEnded)
		    {
		    	System.out.println(sharedSimpleArray);
		    }
		    else
		    	System.out.println("time out wile waiting for tasks to finish");
		    
		} 
		catch (InterruptedException e) {
			System.out.println("Interrupted while waiting for tasks to finish");
		}
		
	}

}
