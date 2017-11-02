
public class Node {
	String name;
	int age;
	Node next;
	public Node()
	{
		name = "empty";
		age=0;
		next=null;
	}
	public Node(String n, int a)
	{
		name =n;
		age=a;
		next=null;
	}
	public void display()
	{
		System.out.println("next node,call Node is "+ name +" "+ age  );
	}

}
