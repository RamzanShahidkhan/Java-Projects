import java.io.Serializable;

public class ObjectSerialize implements Serializable{
	String name;
	String Password;
	
	public ObjectSerialize(String name,String Password) {
		this.name = name;
		this.Password = Password;
	}

}
