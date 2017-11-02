
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hashing {
	
	static int uob=14031243;
	private static int step=0;
	File fileName= new File("Results.txt");
	static PrintWriter writer =null;
	static PrintWriter writer1 =null;
	static PrintWriter writer2 =null;
	static PrintWriter writer3 =null;
	static double average=0.0;

	static String [] theArray;
	int arraySize;
	//constuctor 
	public Hashing(int size)
	{
		theArray=new String[size];
		arraySize=size;
		Arrays.fill(theArray, "-1");	
	}
	//hashFunction to generate random numbers between [0,N].
	public void hashFunction(int n,String[] theArray )
	{
		try {
			writer= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
			int arrayIndex= n%arraySize;
			while (!(theArray[arrayIndex].equals("-1")))
			{
				writer.print((" P"+arrayIndex));
				++arrayIndex;   
				// If we get to the end of the array go back to index 0
				arrayIndex %= arraySize;
				step++;
			}
			step++;
			theArray[arrayIndex]=Integer.toString(n);
			writer.print(" P"+arrayIndex+" "+" I"+n+"@"+arrayIndex+" ");
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("for filewriter stream");
			e.printStackTrace();
		}
	}
	
	public void generateNumbers(int k, PrintWriter writer) throws IOException
	{    writer= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
	step=0;
	Random rand = new Random();
	Hashing hash=new Hashing(101);
	for(int i=0; i<k; i++)
	{  
		for(int j=0; j<100; j++)
		{ 
			int valueNumber=rand.nextInt(uob);
			hash.hashFunction(valueNumber, hash.theArray);
		}
		Arrays.fill(theArray, "-1");
	}
	writer.print("\n\n Number of Steps for k="+k  +" are: "+step +"\n"+ "average is: "+step*k/k+"\n");
	writer.close();
	}
	
	public static void main(String[] args) throws IOException
	{ 
		System.out.println("data is writing on the file Results.txt");
		Hashing hash1=new Hashing(101);
		hash1.generateNumbers(10, writer);
		hash1.generateNumbers(100,writer );
		hash1.generateNumbers(1000,writer );
		System.out.println("data is wriiten on the file Results.txt");
	}

}