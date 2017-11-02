package selfTest;

public class driver {
	public static void main (String [] arg)
	{
		node n= new node("shahid",20);
		list mlist=new list(n);
		mlist.confuse(new node ("ramzan",35));
		mlist.confuse(new node ("khan",35));
		mlist.displayy();
		mlist.add();
		mlist.displayy();
		mlist.add();
		mlist.displayy();
		System.out.println("after deleting and adding atStart");
		mlist.delete(n);
		mlist.displayy();
	}

}
