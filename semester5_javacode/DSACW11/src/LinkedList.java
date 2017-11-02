

import java.util.Random;

public class LinkedList {
	public int size=0;
	Node head;
	Node tail;
	public LinkedList() {
		head=null;
		tail=null;
	}
	
	public Node addBegin(int data)
	{
		//System.out.println("adding atStart is  "+data);
		Node newNode= new Node(data);
		if(size==0)
		{
			//System.out.println("adding atStart is  "+data);
			head=newNode;
			tail=newNode;		
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		size++;
		return newNode;
		
	}
	public Node addAtEnd(int d)
	{
		//System.out.println("adding at end "+ d);
		Node newNode= new Node(d);
		if(size==0)
		{
		//	System.out.println("adding at end "+ d);
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			newNode.prev=tail;
			tail= newNode;
		}
		size++;
		return newNode;
	}
	public Node addAtPostion(int data)
	{
		Node n = new Node(data);
		 if(data >head.data && data< head.next.data)
		{
			Node current=head;
			Node tmp=current.next;
			current.next=n;
			n.next=tmp;
			tmp.prev=n;
			n.prev=current;
			
		}
		return n;
	}
	public void sortList(int data)
	{ 
		Node current=head;
		Node n= new Node(data);
		Node sec=head;
		if(head==null)
		{
			head=n;
		}
		else if(n.data>current.data)
		{
			while(current!=null)
			{
				if(n.data <current.data)
				{
					int tmp=n.data;
					n.data=current.data;
					current.data=tmp;
					size++;
				}
				sec=current;
				current=current.next;
				}
				sec.next=n;
		}
		else
		{
			addBegin(data);
		}
//		if(size==0 || data <=head.data)
//		{
//			//System.out.println("data < head.data");
//			addBegin(data);
//		}
//		else if(n.data > current.data)
//		{
//			Node cur=head;
//			Node sec=head;
//			while(cur!=null){
//			if(n.data <cur.data)
//			{
//				int tmp=n.data;
//				n.data=current.data;
//				current.data=tmp;
//				size++;
//			}
//			sec=cur;
//			cur=cur.next;
//			}
//			sec.next=n;
//		}
//		else
//		addAtEnd(data);
		
		current=n;
			
	}
	public void print()
	{
		Node current= head;
		while(current!=null)
		{
			System.out.print(" " +current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
      	LinkedList l= new LinkedList();
		int[] dataArray = { 73, 82, 77, 84, 80, 89, 72, 71, 67, 85, 83, 81, 87, 88, 86, 75 };
		int[] dataArray1 = { 73, 75, 72, 77, 79, 80, 69, 65, 62, 82, 83, 86, 87, 88, 60, 55 };
		for(int i=0; i<dataArray1.length; i++)
		{
			l.sortList(dataArray1[i]);
		}
		System.out.println("arraysize is ="+dataArray1.length);
		l.print();

	}

}
