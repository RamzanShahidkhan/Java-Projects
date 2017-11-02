import java.io.IOException;

public class ThrowDemo {
	public static void  processFile(String toFile) throws IOException
	{
		//omitted implementation propogates all
		//thrown IOException back to the caller
		
	}
	
	public static void main(String[] args) {
		for(String fileName : args)
		{
			try {
				processFile(fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
		}
		
	}

}
