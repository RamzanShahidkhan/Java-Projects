import java.util.Arrays;

public class ArrayDemo {
	public int [] start(int [] arr, int value)
	{
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] !=0 )
			{
				System.out.println("array is full");
				break;
			}
			else if(arr[i]==0)
			{
				arr[i]=value;
				
				System.out.println(Arrays.toString(arr));
				break;
				
			}
			else if(arr.length>0 )
			{
				System.out.println("write value");
				arr[i]=value;
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
		
		return arr;	
	}
	
	public static void main(String[] args) {
		int [] arr = new int[10];
		for(int i=0; i<arr.length-4; i++)
		{
			arr[i]=4;
		}
		
		ArrayDemo d =new ArrayDemo();
		d.start(arr, 18);
	}
}
