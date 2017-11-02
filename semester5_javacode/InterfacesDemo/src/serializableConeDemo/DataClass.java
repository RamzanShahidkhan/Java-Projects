package serializableConeDemo;

public class DataClass  implements Cloneable{
	
	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
		
	}

}
