
public class GeneralizedSelectionSort {
	
	public static void sort(Comparable[] a, int numUsed){
		int index, indexOfNextSmallest;
		for(index=0; index<numUsed-1; index++)
		{
			//place the correct value in a[index]
			indexOfNextSmallest=indexOfSmallest(index, a, numUsed);
			interChange(index, indexOfNextSmallest, a);
		}
	}
	private static int indexOfSmallest(int startIndex,Comparable[] a, int numUsed)
	{
		Comparable min = a[startIndex];
		int indexOfMin = startIndex;
		int index;
		for(index=startIndex+1; index<numUsed; index++ ){
			if(a[index].compareTo(min) <0)  //if a[index] is less than min
			{
				min=a[index];
				indexOfMin=index;
				//min is smallest of a[startIndex] through a[index]
			}
		}
		return indexOfMin;
	}
	private static void interChange(int i, int j,Comparable[] a){
		Comparable temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp; //original value of a[i]
	}
}
