import java.util.ArrayList;
import java.util.Arrays;

public class Array {
	public static int[] a={1,2,3} ;
	public static int []b={4,5,6};
	public static int[] sum=new int [a.length+b.length];
	public void change()
	{  
		
	}
	
	public static void main(String[] args) 
	{
		int index=0;
		for(int i=0; i < a.length; i++)
		{     
			sum[index]=a[i];
			index++;
			sum[index]=b[i];
			index++;
			
		}
		//System.out.println(sum);
		//System.out.println(index);
		System.out.println(Arrays.toString(sum));
//		for (int i=0; i<sum.length; i++)
//		{
//			System.out.println(sum[i]);
//		}
	}
	


}
