package cw;

public class Node {
	int data;
	Node next;
	Node prev;
	
	//
	public Node(int d) {
		data =d;
		next=null;
		prev=null;
	}
	//NOde(n);
	//Display sysout data 
	public void display()
	{
		System.out.println(data+" ");
	}
}
