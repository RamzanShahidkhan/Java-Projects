package selfTest;


public class node {
	String name;
	int age;
     node nex;

	
	public node()
	{
		name = "empty";
		age=0;
		nex=null;
	}
	public node(String n, int a)
	{
		name =n;
		age=a;
		nex=null;
	}
	public void displayy() {
		System.out.println("next node is "+ name +" "+ age);
		
	}

}
