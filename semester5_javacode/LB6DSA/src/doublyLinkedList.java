import java.util.NoSuchElementException;

public class doublyLinkedList {
	node head;
	node tail;
	int size;
	public doublyLinkedList()
	{
		head = null;
		tail = null;
		size=0;
	}
    public void addStart(int dataa) 
    { 
    	node tmp= new node(dataa, head,null);
    	System.out.println("data is: " + tmp.data);
    	if(head!= null)
    	{
    		head.previous=tmp;
    		head.next=tmp;
    		System.out.println("prev ::" +head.previous);
    		System.out.println("next is  ::" +head.next);
    		System.out.println("tail  : " + tail);
    	}
    	
    	System.out.println("first time head : "+ head);
    	head=tmp;
    	//head.previous=tmp;
    	System.out.println("prevoius yarr :" +head.previous);
    	System.out.println("1st next  yarr :" +head.next);
    	System.out.println("headdd :: " +head);
    	System.out.println("tail after fill :" + tail);
    	if(tail==null)
    	{
    		System.out.println("tail first time is null :" +tail);
    		tail=tmp;
    	}
    	System.out.println("tail first fill isss :" +tail);
    	size++;
    	System.out.println("adding elements: " + dataa);
	}
    public void deleteStart()
    {
    	if(size==0) throw new NoSuchElementException();
    	//node tmp =head;
    	node r= head;
    	System.out.println("first element is :" + r.data);
    	r=r.next;
    	r.previous=null;
//    	head  =  head.next;
//    	head.previous  =  null;
    	size--;
    	System.out.println("deleted element :" + r.data);
    	return ;
    }
    public void deleteEnd()
    {
    	node t= tail;
    	t = t.previous;
    	t.next=null;
    	size--;
    	System.out.println("delete at end element is  : " + t.data);
    }
//	public void addStart(int dataa) {
//	    
//    	node tmp= new node(dataa, head,null);
//    	if(head!= null)
//    	{
//    		//head.previous=tmp;
//    		head.setPrevious(tmp);
//		  System.out.println("prev ::" +head.previous);
//		  System.out.println("tail  : " + tail);
//    	}
//    	head=tmp;
//    	if(tail==null)
//    	{
//    		tail=tmp;
//    	}
//    	size++;
//    	System.out.println("adding elements at start :"+ dataa );
//	}
//	
    public void addEnd(int dataa)
    {
    	node tmp = new node (dataa,null,tail);
    	System.out.println("pre tail in 1st :" + tail);
    	if(tail!= null)
    	{
    		tail.next = tmp;
    		System.out.println("tail.next is end : "+ tail.next);
    		System.out.println();
    	}
    	tail=tmp;
    	head.previous=tmp;
    	System.out.println("tail=tmp  is : "+ tail.next);
    	System.out.println("head.prev is : "+ head.previous);
    	System.out.println("tail after tmp is : "+ tail);
    	if(head== null)
    	{
    		head =tmp;
    		System.out.println("head if null : "+ head);
    	}
    	size++;
    	System.out.println("head.next is : "+head.next);
    	
    	System.out.println("if head is not null : "+ head);
    	System.out.println("adding elements at end : " + dataa);
    	    	
    }
    
    /**
    public void deleteMid(int datu)
    {
    	node r=head;
    	while(r.data!=datu)
    	{
    		System.out.println("delete mid :");
    		r = r.next;
    	}
    	//r.data =datu;
    	node tmp= r.previous;
    	r.next.previous=tmp;
    	
    	
    }*/
    public int Size()
    {
    	return size;
    }
    public boolean isEmpty(){
    	if (size==0)
    		return true;
		return false;
    	
    }
	public static void main(String[] args) {
		doublyLinkedList listd= new doublyLinkedList();
		listd.addStart(10); // 34
		listd.addStart(34);  //12
		//listd.addStart(16);   //16
		listd.addEnd(56);
		listd.addEnd(364);
		System.out.println("size of list : " +listd.Size());
		listd.deleteStart();
		System.out.println("size of list : " +listd.Size());
		//listd.deleteMid(12);
		System.out.println("size of list mid : " +listd.Size());
		listd.deleteEnd();
		System.out.println("size of list enddelete : " +listd.Size());

	}

}
