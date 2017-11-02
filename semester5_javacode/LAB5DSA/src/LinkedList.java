
public class LinkedList{

	public static void main(String[] args) {
		Node n1 =new Node("N1",20);
		
		List list =new List();
		list.addAtStart(n1);
		Node n2 =new Node("N2",25);
		list.addAtStart(n2);
		Node n3 =new Node("N3",35);
		list.addAtStart(n3);
		Node end1= new Node ("ENd1",23);
		
		list.addAtEnd(end1);
		list.display();
		
//		System.out.println("deleting at first");
//		list.deleteFromStart();
//		list.display();
	    list.deleteFromEnd();
		System.out.println("after removing at end: ");
		list.display();
		//node1.display();
//		System.out.println("seach name is : ");
//		System.out.println(list.search("N3"));
		//list.display();
		System.out.println(list.isEmpty());
		System.out.println("size of List : " +list.size());
		System.out.println("LIST2----: ");
		List l2= new List();
		Node m1= new Node("M1",12);
		Node m2= new Node("M2",42);
		Node m3= new Node("M3",52);
		Node m4= new Node("M4",22);
		l2.addAtStart(m1);
		l2.addAtStart(m2);
		l2.addAtStart(m3);
		l2.display();
		
		
	}

}
