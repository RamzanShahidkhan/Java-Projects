
public class BinaryIteration {
	
	private int binaryIteration(int arr[], int e, int size)
	{
		int mid= size/2;
		if(arr[mid] == e)
		{
			System.out.println("midlle element size/2");
			return mid;
		}
		else if(arr[mid] > e)
		{
			for(int i=mid-1; i<=0; i--)
				if(arr[i]==e)
				{
			        return i;
				}
		}
		else if(arr[mid] > e)
		{
			for(int i=mid+1; i<=arr.length; i++ )
			{
				if(arr[i]== e)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7};
		BinaryIteration b=new BinaryIteration();
		System.out.println(b.binaryIteration(arr, 3, arr.length));
	}
}
