import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.SortOrder;

public class Array {
	public static int[] a={1,2,3} ;
	public static int []b={4,9,6};
	public static int[] sum=new int [a.length+b.length];	
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
		System.out.println(Arrays.toString(sum));
		for (int i=0; i<sum.length-1; i++)
		{ int tmp=0;
			if(sum[i]> sum[i+1])
			{
				tmp=sum[i];
				sum[i]=sum[i+1];
				sum[i+1]=tmp;			
			}
		}
		String t=Arrays.toString(sum);
		System.out.println(Arrays.toString(sum));
	}
}
