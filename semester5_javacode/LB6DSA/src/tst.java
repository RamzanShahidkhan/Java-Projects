
public class tst {
	static Node head;
	Node prev;
	
	public tst() {
		head=null;
		prev=null;
	}
	
	
	
	Node sortedInsert(Node head, int data) {
	    Node newnode = new Node();
	    newnode.data = data;

	    // head is null -> new Node is new list
	    if (head == null)
	        return newnode;

	    // handle special case if data < head.data
	    if (data < head.data) {
	        newnode.next = head;
	        head.prev = newnode;
	        return newnode; // newnode is the new list head
	    }

	    // search position in list
	    for (Node prev = head; prev.next != null; prev = prev.next) {
	        if (prev.next.data > data)
	            break;
	    }

	    // insert behind prev
	    newnode.next = prev.next;
	    if (prev.next != null) {
	        prev.next.prev = newnode;
	    }
	    prev.next = newnode;
	    newnode.prev = prev;

	    return head; // head did not change
	}
	
	public static void main(String[] args) {
		tst t = new tst();
		Node p=t.sortedInsert(null, 12);
		Node p1=t.sortedInsert(head, 22);
		
		System.out.println(p.data);
		System.out.println(p1.data);
				
	}
	
//	Node head;
//	Node tail;
//	
//	public tst() {
//		head=null;
//		tail=null;
//	}
//	
//	Node sortedInsert(Node head, int data) {
//	    Node newnode = new Node();
//	    newnode.data = data;
//	    Node current = head;
//	    Node pre = null;
//	    if(head == null) {
//	        head = newnode;
//	        newnode.prev = null;
//	    } 
//	    else if (head.data >= newnode.data) {
//	        newnode.next = head;
//	        head.prev = newnode;
//	        head = newnode;
//	        return newnode;
//	    }
//
//	    while(current!=null && current.data <= newnode.data) {
//	        pre = current;
//	        current = current.next;
//
//	        newnode.prev = pre;
//	        pre.next = newnode;
//	        newnode.next = current;
//	        if (current != null) {
//	            current.prev = newnode;
//	        }
//	    }
//	    return head;      
//	}
//	public static void main(String[] args) {
//		tst t=new tst();
//		//System.out.println(t.sortedInsert(head, 34));
//	}
}
