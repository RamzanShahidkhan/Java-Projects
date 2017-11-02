
public class Average {
	public static double average(double...number)
	{
		double total=0.0;
		for(double d: number)
		{
		  total+=d;
		}
		return total/number.length;
		
	}

	public static void main(String[] args) {
		double d1=10.0;
		double d2=15.0;
		double d3=20.0;
		System.out.printf("average of d1 and d2 is %.1f  " ,average(d1,d2));
		System.out.println();
		System.out.printf("average of d1 and d2 and d3 is %.1f  " ,average(d1,d2,d3));

	}

}
