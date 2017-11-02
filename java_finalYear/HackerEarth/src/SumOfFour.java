import java.util.Scanner;

public class SumOfFour {
	public static void main(String[] args) {
		
//		int[] numArray = new int[4]; // Define an array of integers of size 4.
//		Scanner s = new Scanner(System.in);
//                int i;
//		for(i=0; i<4; i++){
//			numArray[i] = s.nextInt(); // Get the input
//		}
//		int sum = 0;
//		// Write the logic to add these integers here:
//		for(int j=0 ; j< numArray.length; j++)
//		{
//			sum+=numArray[j];
//		}
//		System.out.print(sum); // Print the sum
//		s.close();
		
        Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		// Define an array of integers of size N. 
		int[] numArray = new int[N];		

		int sum = 0;
		for(int i=0; i<N; i++){
			numArray[i] = s.nextInt(); // Get the input
		}
	    
	    // Write the logic to add these numbers here:
	    for(int j=0; j<numArray.length; j++)
	    {
	        sum+=numArray[j];
	    }
	    System.out.print(sum);
	    s.close();
	}
}