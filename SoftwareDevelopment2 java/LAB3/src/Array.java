import java.util.Scanner;

public class Array {
	private static int [] arr= new int[5];
	//private Scanner sc =new Scanner(System.in);
	public void array()
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i;
		}
	}
	
	public static void main(String[] args) {
		Array b=new Array();
		b.array();
		Scanner sc =new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("enter index");
		int index=sc.nextInt();
		System.out.println("enter value on this index");
		int v=sc.nextInt();
		
		try
		{
			arr[index]=v;
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
