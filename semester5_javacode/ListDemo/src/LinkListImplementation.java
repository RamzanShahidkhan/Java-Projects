
public class LinkListImplementation {
	public static void main(String[] args) throws java.lang.Exception {
		LinkedListT a = new LinkedListT();
		a.addAtBegin(5);
		a.addAtBegin(15);
		a.addAtEnd(20);
		a.addAtEnd(21);
		a.deleteAtBegin();
		a.deleteAtEnd();
		a.addAtIndex(10, 2);
		a.addAtEnd(15);
		a.display();
		System.out.println("\n Size of the list is: " + a.size);
		System.out.println(" Element at 2nd position : " + a.elementAt(2));
		System.out.println(" Searching element 20, location : " + a.search(15));
	}
}