import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class jjj {
	static boolean check = false;
	static int N=14031243;
	private int step=0;
	File fileName= new File("Results.txt");
	static PrintWriter writer =null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	static String [] theArray;
	int arraySize;
	//int itemsInArray=0;
	
	//constuctor 
	public jjj(int size)
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
			step++;
			
			//writer.println();
    // 		writer.append("P"+arrayIndex+" ");
			writer.print("P"+arrayIndex+" ");
			   System.out.println("Index is "+arrayIndex+" for value No "+n);
			   while (theArray[arrayIndex]!="-1")
			   {
				   ++arrayIndex;
				   
				   System.out.println("Collision Try " + arrayIndex + " Instead");
					// If we get to the end of the array go back to index 0
					arrayIndex %= arraySize;
					writer.append("ColP"+arrayIndex+" ");
					step++;
			   System.out.println("Index after collision is "+arrayIndex+" for value No "+n);
			   }
			   step++;
			   theArray[arrayIndex]=Integer.toString(n);
			   //writer.println();
//			   writer.append("I"+n+"@"+arrayIndex);
			   writer.print("I"+n+"@"+arrayIndex+" ");
			   if(check == true){
				  writer.print("\n Daz Daz Steps are "+step);
				  writer.println();
			   }
			    //writer.print(" jaaa");
			   //writer.println();
			  // writer.print("\n step count are: "+step);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("for filewriter stream");
			e.printStackTrace();
		}
		finally {
			writer.close();
		}  
	}
	public void display()
	{
		int increment = 0;
		for (int m = 0; m < 10; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("--");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("|  %3s      " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("--");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (theArray[n].equals("-1"))
					System.out.print("|            ");

				else
					System.out
							.print(String.format("|  %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("--");

			System.out.println();
		}
	}
	public static void main(String[] args)
	{ 
		System.out.println("my fun chalda pia haa");
	    jjj hash=new jjj(24);
	    Random rand = new Random();
	    //unofficial code 
//		for(int i=0; i<8; i++)
//		{
//			 if(i == 7){
//				  
//				  check = true;
//				  System.out.println("Dazi If "+ i);
//			  }
//		     int indexArray=rand.nextInt(24);
//			  hash.hashFunction(indexArray, hash.theArray);
////			hash.hashFunction(15031240, hash.theArray);
////			hash.hashFunction(306, hash.theArray);
//			//hash.hashFunction(306, hash.theArray);
//			  System.out.println("num is "+indexArray);
//			 
//			  
//		}
		// Official code is this
	    for(int i=0; i<10; i++)
	    {     
		    	if(i==9)
				{
					check =true;
					System.out.println("daz in main is  index "+ i);
				}
	    	 Arrays.fill(theArray, "-1");
			  for(int j=0; j<3; j++)
			  { 
//				if(j==2)
//				{
//					check =true;
//					System.out.println("daz in main is  index "+ j);
//				} 
				  //int valueNumber=rand.nextInt(20);
				  hash.hashFunction(15031240, hash.theArray);
    	     	  hash.hashFunction(306, hash.theArray);
				  //System.out.println("number is: "+ valueNumber);
				  //hash.hashFunction(valueNumber, hash.theArray);
				   writer.println();
				   writer.println();
			   }
			   
	   }
//		hash.hashFunction(15031240, hash.theArray);
//		Arrays.fill(theArray, "-1");
//		hash.hashFunction(306, hash.theArray);
//		hash.hashFunction(306, hash.theArray);
		
		
		//hash.display();	
	}
}
