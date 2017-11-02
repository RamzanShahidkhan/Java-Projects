
public class Testemploye8 {
	public static void main(String [] args)
	{
	    System.out.printf("Employe before initialization: %d\n",Employe8.getCount());
		Employe8 e1=new Employe8("nadi ", "papi");
		Employe8 e2=new Employe8("ramzan ", "zaka");
		System.out.println("Employe after initialization:");
		System.out.printf("via e1.getcount(): %d\n",e1.getCount());
		System.out.printf("via e1.getcount(): %d\n",e1.getCount());
		System.out.printf("via Employe8.getcount(): %d\n",Employe8.getCount());
		System.out.printf("\n Employee 1: %s%s\n Employee 2:%s%s\n",e1.getfName(),e1.getlName()
				,e2.getfName(),e2.getlName());
		e1=null;
		e2=null;

	}

}
