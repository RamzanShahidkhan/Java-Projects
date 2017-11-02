
public class findMin {
	
	//return the minimum element in a[]
	int findmin(int a[], int size)
	{
		int min=a[0];
	    if(size > 0)
	    {
	    	return  Math.min(a[size], findmin(a, size-1));
	    }
	    else
	    {
	    	return a[0];
	    }
	}
	
	public static void main(String[] args) {
		int [] arr= {5,7,4,5};
		findMin f= new findMin();
	     System.out.println("minimum number");
	     System.out.println(f.findmin(arr, arr.length-1));     
		}
	
}
