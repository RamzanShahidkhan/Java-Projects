package serializableConeDemo;

public class YourCloneableClass implements Cloneable{
	
	public Object clone()
	{
		try {
			return super.clone(); //Invocation of clone 
			             //in the base class object
		} 
		catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
