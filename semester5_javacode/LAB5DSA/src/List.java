
public class List {
	Node head;
	public List(Node e)
	{
		head =  e;
	}
	public List()
	{
		head = null;
	}
	public void addAtStart(Node x)
	{
		 x.next = head;
		  head = x;
	}
	public void display() {
		Node current = head;
		while(current != null)
		{
			current.display();
			current =current.next;
		}
		//current = current.next;
		//this.head =current;
		
		//System.out.println("head is " +head.name + " "+ head.age);
		
	}
	public void addAtEnd(Node t) {
		//System.out.println("adding at end position");
		Node header= head;
		while(header.next != null)
		{
			header =header.next;
		}
		header.next =t;
		
	}
	public void deleteFromStart(){
		System.out.println("deleteATStart is call");
	   head =head.next;	
	}
    public void deleteFromEnd(){
    	System.out.println(head.next.next.next.next);
    	System.out.println();
//    	Node temp = head;
//		Node secondLast = null;
//		
//		while(this.head!=null){
//			secondLast=head;
//			head=head.next;
//		}
//		secondLast=null;
//		this.head=secondLast;
       
    	Node  end = head;
    	while(end!= null)
    	{
    		System.out.println(end.name);
    		if(end.next.next == null)
    		{
    			System.out.println("null a gia yaar ");
    			end.next = end.next.next;
    			//break;
    		}
    		end= end.next;
    		
    	}
    	//this.head = end;
    	
 		
	}
    public boolean search(String name){
    	System.out.println("search is call");
    	while(head.next !=null)
    	{
    		//if (head.toString().equals(name))
    		if (head.name ==name)
    			return true;
    		head = head.next;
    	}
		return false;
    	
    }
    public boolean isEmpty(){
    	System.out.println("isEmtpy is called");
    	if(head== null)
    		return true;
    	
		return false;
    	
    }
    public int size(){
    	System.out.println("size method is called");
    	int count= 0;
    	while(head != null)
    	{
    		head=head.next;
    		count++;
    		
    	}
		return count;
    	
    }
    
	
	

}
