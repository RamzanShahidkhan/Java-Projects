
public class binarySearch {
	
	int search(int array[], int element,int size)
	{
		int middle=size/2;
		if(array[middle] > element){
			System.out.println("element< middle");
			return (search(array, element, middle-1));
		}
		else if(array[middle] < element)
		{
			System.out.println("element > middle");
			return (search(array, element, middle+1));
		}
		else
		{
			System.out.println("element ==middle");
			return middle;
		}
	}
	
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6};
		binarySearch b=new binarySearch();
		System.out.println("element in array");
		System.out.println(b.search(arr, 2, (arr.length-1)));

	}

}
