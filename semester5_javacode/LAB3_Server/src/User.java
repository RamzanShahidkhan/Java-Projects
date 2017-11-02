
public class User {
	private String name;
	private int password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public User(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	

}
