
public class Testtriangle {
	void printtri(Triangle t)
	{    System.out.println("Rectangle Base, Per & HYe are");
		System.out.println(" Base : " +t.getBase());
		System.out.println(" Hyepotenuse: "+t.gethye());
		System.out.println(" perpendicular: "+t.getper());
		
	}
	public void printrec(Rectangle r)
	{  
		System.out.println("Triangle lenght and width are :");
		System.out.println(" length: "+r.getl());
		System.out.println(" width: "+r.getw());
	}
	public static void main(String [] args)
	{
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Testtriangle T=new Testtriangle();
		t.setBase(4);
		t.sethye(5);
		t.setper(6);
		r.setl(10);
		r.setw(9);
		T.printtri(t);
		T.printrec(r);
	}

}
