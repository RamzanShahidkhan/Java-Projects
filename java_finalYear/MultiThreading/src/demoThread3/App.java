package demoThread3;

import java.util.Scanner;

class Processor extends Thread{
	private boolean running=true;
	@Override
	public void run() {
		while(running)
			
		{
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void shutdown()
	{
		running= false;	
	}
}
public class App {

	public static void main(String[] args) {
		Processor p= new Processor();
		p.start();
		System.out.println("Press return to stop");
		Scanner scanner= new Scanner(System.in);
		scanner.nextLine();
		p.shutdown();
	}
	
}