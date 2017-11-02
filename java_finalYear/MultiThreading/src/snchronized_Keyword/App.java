package snchronized_Keyword;

public class App {
	 private int count=0;
	 
	 public  synchronized void increment(){
		 count++;
	 }
	
	public static void main(String[] args) {
		System.out.println("started ......");
		App app= new App();
		app.dthread();
	}
	public void dthread()
	{
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<100; i++)
				{
					increment();
				}
				
			}
		});
		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<100; i++)
				{
					increment();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("count is : "+ count);
	}
}
