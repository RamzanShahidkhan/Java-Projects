
public class ExerciseChap1 {
	static int maxThree(int x,int y, int z)
	{
		if (x>y)
		{
			if(x >z)
			{
				return x;
			}
		}
		else if (y > x && y > z)
		{
			return y;
		}
		return z ;
		
	}
	public static void main(String[] args) {
		System.out.println(maxThree(3, 2, 5));
		
		System.out.println( "55 in base 2: " + Integer.toString( 55, 2 ) );
		int x = Integer.parseInt( "75" );
		double y = Double.parseDouble( "3.14" );
		System.out.println(x+"   "+y);
	}
	
//	public static void main(String[] args) {
//		int a=4, b=8, c=12;
//		System.out.println(a);
//		a = b++ + c++;
//		System.out.println(a);
//		a = b++ + ++c;
//		System.out.println(a);
//		a = ++b + c++;
//		System.out.println(a);
//		a = ++a + ++c;
//		System.out.println(a);
//		
//		System.out.println(true && false || true);
		
//		public static int f( int x )
//		 { /* body unknown */
//			x++;
//			return x;
//		 }
//		 public static void main( String [ ] args )
//		 {
//		 int x = 0;
//		
//		 int g=f( x );
//		 System.out.println( g );
//		 }
	//}

}
