
public class IndexSearchIteration {
	int search(int array[], int e, int size)
	{
		for(int i=0; i<size; i++)
		{
			if(array[i]==e)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6};
		IndexSearchIteration s=new IndexSearchIteration();
		int b=s.search(arr, 6, arr.length);
		System.out.println(b);
		}
}
