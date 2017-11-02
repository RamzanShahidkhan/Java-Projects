
public class Test {
	public void print(Circle s)
	{
		System.out.println(s.getr());
	}
  public static void main(String [] args)
  {
	   Circle c=new Circle(6);
	  Test t=new Test();
	  t.print(c);
	  c.setradius(5);
	 
	  t.print(c);
	  
  }

}