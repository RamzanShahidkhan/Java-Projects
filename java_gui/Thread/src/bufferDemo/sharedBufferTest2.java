package bufferDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class sharedBufferTest2 {
	public static void main( String [] args)
	{
		ExecutorService app=Executors.newCachedThreadPool();
		Buffer sharedLocation=new SynchronizedBuffer();
		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n","Operation"
		,"Buffer","Occupied","---------","-------\t\t--------");
		app.execute(new Producer(sharedLocation));
		app.execute(new Consumer(sharedLocation));
		
		app.shutdown();
	}

}
