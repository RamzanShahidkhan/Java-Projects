
public class findIndex {
	int search(int array[], int element,int size)
	{
		int middle=size/2;
		
		if(array[middle] > element)
			return (search(array, element, middle-1));
		
		else if(array[middle] < element)
		{
			return (search(array, element, middle+1));
		}
		
		else
			return middle;
	}
	
	public static void main(String[] args) 
	{	
		int [] arr={1,2,3,4,5,6};	
		binarySearch b=new binarySearch();
		System.out.println("index");
		//for(int i=0; i < arr.length; i++)
		
		 System.out.println(b.search(arr, 4, arr.length));
		
		
	}
}
