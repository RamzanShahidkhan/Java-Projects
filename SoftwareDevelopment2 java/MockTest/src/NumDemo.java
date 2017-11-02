
public class NumDemo implements MathTool{

	@Override
	public int addUp(int x, int y) {
		// TODO Auto-generated method stub
		int z=x+y;
		return z;
	}

	@Override
	public void evenOdd(int x) {
		if(x%2==0)
			System.out.println("Even");
		else
		System.out.println("Odd");
		
	}
	public static void main(String [] arg)
	{
		NumDemo n=new NumDemo();
		System.out.println(n.addUp(4, 2));
		n.evenOdd(41);
	}
	

}
