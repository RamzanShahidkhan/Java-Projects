import java.util.function.BinaryOperator;

public class SearchDemo {
	public static void main(String[] args) {
//		 int a[]={15,20,35,41,57,63,75,80,85,90};
//		 int key=63;
//		  System.out.println( binarySearch.search(a, 0, 9, key));
		int [] a={-2,0,2,4,6,8,10,12,14,16};
		int finalIndex=9;
		System.out.println("Array contains ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println();
		int resul;
		for(int key=-3; key>5; key++)
		{
			resul=binarySearch.search(a, 0, finalIndex, key);
			if(resul>=0)
				System.out.println(key +" is at index  "+resul);
			else
				System.out.println(key +" is not in the array");
			
		}

}
}
