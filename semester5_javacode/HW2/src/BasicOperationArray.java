import java.util.ArrayList;
import java.util.Arrays;

public class BasicOperationArray {
	private static int displayContent(int [] arr)
	{
		for(int i=0; i< arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		return 0;
	}
	private static int  searchElement(int [] arr, int element)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.print( "element " +element + " is found at index " );
				return i;
			}
		}
		return -1;
		
	}
	private static int[] insertStart(int [] arr,int value)
	{
		int [] newArray=new int [arr.length];
		for(int i=0; i < arr.length; i++)
		{
			arr[0]=value;
			//System.out.println("new value at start: "+ arr[i]);
		    newArray[i]=arr[i];
		}
		return newArray;
	}
	private static int[] insertEnd(int [] arr,int value)
	{
		int [] newArray=new int [arr.length];
		for(int i=0; i < arr.length; i++)
		{
			arr[arr.length-1]=value;
			//System.out.println("new value at start: "+ arr[i]);
		    newArray[i]=arr[i];
		}
		return newArray;
	}
	private static int[] insertAtIndex(int arr[], int index, int value)
	{
		int [] newArr =new int[arr.length];
		for(int i=0; i<newArr.length; i++)
		{
			arr[index]=value;
			newArr[i] = arr[i];
		}
		return newArr;
	}
	private static void removeAtStart(int arr[], int index)
	{
		ArrayList<Integer> arrList =new ArrayList<Integer>(arr.length);
		//arrList = arr;
		System.out.println("original Array Size: " + arr.length);
		System.out.println("original array contents: "+Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		BasicOperationArray  b=new BasicOperationArray();
		int [] arr = new int[] {1,2,3,4,5,6};
		displayContent(arr);
		System.out.println(searchElement(arr, 4)); 
		
		int [] newArr=insertStart(arr, 8);
		System.out.println("NewValue at start index:  " +Arrays.toString(newArr));
		int [] endArr=insertEnd(newArr, 45);
		System.out.println("newValue at End of array: "+Arrays.toString(endArr));
		
		int [] indexArray=insertAtIndex(arr, 5, 50);
		System.out.println("value at any Index : "+ Arrays.toString(indexArray));
		
		
	}
}
