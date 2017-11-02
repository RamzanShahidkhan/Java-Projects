
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class jk {
	static boolean check = false;
	static int N=14031243;
	private static int step=0;
	File fileName= new File("Results.txt");
	static PrintWriter writer =null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	static String [] theArray;
	int arraySize;
	//int itemsInArray=0;
	
	//constuctor 
	public jk(int size)
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
			    //writer.print();
			   System.out.println("Index is "+arrayIndex+" for value No "+n);
			   while (!(theArray[arrayIndex].equals("-1")))
			   {
				   writer.print((" P"+arrayIndex));
				   ++arrayIndex;
				   
				   System.out.println("Collision Try " + arrayIndex + " Instead");
					// If we get to the end of the array go back to index 0
					arrayIndex %= arraySize;
					//writer.println();
					
					
					step++;
			   System.out.println("Index after collision is "+arrayIndex+" for value No "+n);
			   }
			  step++;
			   theArray[arrayIndex]=Integer.toString(n);
			   //writer.println();
//			   writer.append("I"+n+"@"+arrayIndex);
			   writer.print(" P"+arrayIndex+" "+" I"+n+"@"+arrayIndex+" ");
			   //writer.println();
			   if(check == true){
				  writer.print("\n Daz Daz Steps are "+step);
				  writer.println();
			   }
			   writer.close();
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
		 
	}
//    Random rand = new Random();
//    writer1= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
//    // for k=10
//    for(int i=0; i<10; i++)
//    {  
//		  for(int j=0; j<100; j++)
//		  { 
//			   if(j==0)
//			   {
//				   check=true;
//			   }
//			  int valueNumber=rand.nextInt(uob);
//			 
//			  hash.hashFunction(valueNumber, hash.theArray);
//			   writer1.flush();
//		   }
//		  Arrays.fill(theArray, "-1");
//    }
//    //average=step/10;
//    writer1.print("\ntotal Steps for k=10 are: "+step +"\n"+ "average is: "+step*10/10+"\n");
//    writer1.close();
//    //for k==100
//       writer2= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
//    for(int i=0; i<100; i++)
//    {  step=0;
//		  for(int j=0; j<100; j++)
//		  {  
//			  int valueNumber=rand.nextInt(uob);
//			  hash.hashFunction(valueNumber, hash.theArray);
//			   writer1.flush();
//		   }
//		  
//		  Arrays.fill(theArray, "-1");
//    }
//    //average=step/10;
//    writer2.print("\ntotal Steps for k=100 are: "+step +"\n"+ "average is: "+step*100/100+"\n");
//    writer2.close();
//    writer3= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
////  //for k==1000
//    for(int i=0; i<1000; i++)
//    {  
//    	step=0;
//		  for(int j=0; j<100; j++)
//		  { 
//			  int valueNumber=rand.nextInt(uob);
//			  hash.hashFunction(valueNumber, hash.theArray);
//			   writer3.flush();
//		   }
//		  Arrays.fill(theArray, "-1");
//    }
//    //average=step/10;
//    writer3.print("\ntotal Steps for k=1000 are: "+step +"\n"+ "average is: "+step*1000/1000+"\n");
//    writer3.close();
	public static void main(String[] args) throws IOException
	{ 
		System.out.println("my fun chalda pia haa");
	    jk hash=new jk(101);
	    Random rand = new Random();
	    writer= new PrintWriter(new BufferedWriter(new FileWriter("Results.txt",true)));
	  
	    //writer.println();
			//writer.close();
		
		// Official code is this
	    for(int i=0; i<10; i++)
	    {     	
//		    	if(i==9)
//				{
//					check =true;
//					System.out.println("daz in main is  index "+ i);
//				}
	    	
	    	writer.print("Steps  "+i);
	    	writer.print("    ");
			  for(int j=0; j<100; j++)
			  { 
				  int valueNumber=rand.nextInt(N);
				  hash.hashFunction(valueNumber, hash.theArray);
				   writer.println();
				   //writer.println();
			   }
			  Arrays.fill(theArray, "-1");
	    }
	    writer.print("\n Daz Daz Steps are "+step);
	    writer.close();
	    
			   
			  
			   
	   
//		hash.hashFunction(15031240, hash.theArray);
//		Arrays.fill(theArray, "-1");
//		hash.hashFunction(306, hash.theArray);
//		hash.hashFunction(306, hash.theArray);
		
		
		//hash.display();	
	
	
}
}