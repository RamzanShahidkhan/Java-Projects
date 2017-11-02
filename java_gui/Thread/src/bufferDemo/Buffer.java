package bufferDemo;

public interface Buffer {
	//place int value into buffer
	public void set(int value) throws InterruptedException;
	//return int value from buffer
	public int get (int value) throws InterruptedException;
	

}
