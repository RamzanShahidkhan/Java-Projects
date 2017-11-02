package serializableConeDemo;

public class YourCloneableClass2 implements Cloneable{
	private DataClass someVariable;
	//DataClass is a mutable class.
	
	public Object clone()
	{
		try{
			YourCloneableClass2 copy=(YourCloneableClass2)super.clone();
			copy.someVariable=(DataClass)someVariable.clone();
			return copy;
		}
		catch(CloneNotSupportedException e){
			return null;
		}
		
		
	}
	

}
