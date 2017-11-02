import java.util.*;
public class Species {
	private String name;
	private int pop;
	private double gRate;
	
	public Species()
	{
		name=null;
		pop=0;
		gRate=0;
	}
	public Species(String n,int p, double gr)
	{
		name=n;
		if(p>=0)
		{
			pop=p;
		}
		else
		{
			System.out.println("negative pop");
			System.exit(0);
		}
		
		gRate=gr;
	}
	public String toString()
	{
		return ("Name: "+name +"\n"+"populat "+pop+"\n"+"gRate  "+gRate+ "%");
	}
	

	public static void main(String[] args) {
		

	}

}
