package selfTest;

import javax.xml.soap.Node;

public class list {
	node head;
	public list(node e)
	{
		head =e;
	}
	public list()
	{
		head= null;
	}
	public void add()
	{
	    head = head.nex;
	    System.out.println("add is call yara");
	}
	public void displayy() {
		node current = head;
		while(current != null)
		{
			current.displayy();
			current =current.nex;
		}
	
		
		//System.out.println("head is " +head.name + " "+ head.age);
		
	}
	public void confuse(node t)
	{
		node current= head;
		while(current.nex != null)
		{
			current =current.nex;
			
		}
		current.nex = t;
	}
	public void addAtEnd(Node t) {
		
	}
	public void deleteFromStart(){
		
	}
    public void deleteFromEnd(){
 		
	}
    public boolean search(String name){
		return false;
    	
    }
    public boolean isEmpty(){
		return false;
    	
    }
    public int size(){
		return 0;
    }
    public void delete(node x)
    {
    	x.nex = head;
    	head = x;
    }
	
	

}
