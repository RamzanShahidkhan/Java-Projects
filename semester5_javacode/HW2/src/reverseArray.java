import java.util.Arrays;

public class reverseArray {
	
	private static int invertContent(int array[])
	{
		int tmp=0;
		
		for(int i=0; i< array.length/2; i++)
		{
			tmp = array[array.length-1-i];
			array[i] = array[array.length-1-i] ;
			array[array.length-1-i] = tmp;
			
		}
		return tmp;
		
//		int left=0;
//		int right=array.length-1;
//		while(left < right)
//		{
//			int tmp = array[left];
//			array[left] = array[right];
//			array[right] = tmp;
//			left++;
//			right--;
//			return tmp;
//			
//		}
//		return -1;
		
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,5,6};
		System.out.println("reverse array contents");
		System.out.println(invertContent(arr));
		
	}
}
