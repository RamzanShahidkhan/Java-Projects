package bufferDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class sharedBufferTest {

	public static void main(String[] args) {
		ExecutorService application=Executors.newCachedThreadPool();
		Buffer sharedLocation=new UnsynchronizedBuffer();
		System.out.println("Action\t\tvalue\tsum of product\t sum of consumed");
		System.out.println(
				"------\t\t-----\t----------\t--------------\n");
		application.execute(new Producer(sharedLocation));
		application.execute(new Consumer(sharedLocation));
		
		application.shutdown();
	}

}
