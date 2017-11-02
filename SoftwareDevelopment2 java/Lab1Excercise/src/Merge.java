import java.util.Arrays;

import javax.swing.SortOrder;

public class Merge {
	public static int[] a={11,6,8};
	public static int[] b={4,9,5};
	public int[] c=new int[a.length +b.length];
	public static SortOrder[] c1;
	
	public void merge()
	{
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length)
			
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;		
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		//SortOrder.DESCENDING.c
		System.out.println(Arrays.toString(c));
	}
	public void sort()
	{  int tmp;
		for(int i=0; i<c.length-1; i++)
		{   
			if(c[i]> c[i+1])
			{
				 tmp = c[i];
				 c[i]=c[i+1];
				 c[i+1]=tmp;
			}
			
		}
		System.out.println(Arrays.toString(c));
	}
	public static void main(String[] args) {
		Merge m=new Merge();
		m.merge();
		//System.out.println(m.merge(););
		m.sort();
	}
}
