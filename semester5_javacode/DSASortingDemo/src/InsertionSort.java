
public class InsertionSort {
	
	
	
	public static void main(String[] args) {
		
		int A [] ={5,2,14,6,1,13};
		int key=0;
		int i=0;
		for ( i=0; i<A.length ; i++)
		{
			for(int j=i; j<A.length; j++)
			{
				while (A[j] < A[i])
				{
					int tmp = A[i];
					A[i] =A[j];
					A[j] =tmp;
				}
			}
			System.out.println("Sorted array "+ i +",  "  +A[i]);
		}
		
//		for (int j=1; j<A.length; j++)
//		{
//			key=A[j];
//			i=j-1;
//			while (i>0 && A[i] >key)
//			{
//				A[i+1] = A[i];
//				i=i-1;
//				A[i]=key;
//				key =A[i+1];
//			}
//			
//			System.out.println("array is " + A[i]  );
//		}
	}

}
