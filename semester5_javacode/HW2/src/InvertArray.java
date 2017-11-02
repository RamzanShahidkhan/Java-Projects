import java.util.Arrays;

public class InvertArray {
	
	private static int[] invertContent(int array[])
	{ 
		System.out.println("first array: " + Arrays.toString(array));
		int [] reversed= new int[array.length];
		for(int i=0; i< array.length; i++)
		{
			reversed[i] = array[array.length-1-i];
			
		}
		return reversed;
	}

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		InvertArray  a =new InvertArray();
		System.out.println("invert contents");
		//for(int i=0; i< arr.length; i++)
		int [] array=invertContent(arr);
			System.out.print(Arrays.toString(array));
	}
}
