
public class sumArray {
	//return the sum of all elements in a[]
	int findsum(int a[], int size)
	{
		int sum=0;
//		if(size > 0)
//		{
//			//sum += a[size]+ findsum(a, size-1);
//			return a[size]+ findsum(a, size-1);
//		}
//		else
//		{
//		return a[0];
//		}
		if(size==0)
		{
		return a[size];
		}
		else if (size > 0)
		{
			//sum += a[size]+ findsum(a, size-1);
			return a[size]+ findsum(a, size-1);
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4};
		sumArray s= new sumArray();
		System.out.println("sum of array");
		System.out.println(s.findsum(ar, ar.length-1));
		     
		}
}
