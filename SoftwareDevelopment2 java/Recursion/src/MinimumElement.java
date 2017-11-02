
public class MinimumElement {
	private static int a[]={2,5,4,4,6};
	private int c;
	public int minimum(int b[], int n)
	{
		if(b[0]==n)
		{
			return b[0];
		}
		else
		{
		return b[1]+minimum(b, n-1);
		}
	}

	public static void main(String[] args) {
		MinimumElement m=new MinimumElement();
		System.out.println(m.minimum(a, a.length));
		

	}

}
