import cw.Node;

public class LinkList {
	private static int[] dataArray = { 73, 82, 77, 84, 80, 89, 72, 71, 67, 85, 83, 81, 87, 88, 86, 75 };

	Node head;
	Node tail;

	public LinkList() {
		head = null;
		tail = null;
	}
	public void addNode(int data) {
		Node newNode = new Node(data);
		//System.out.println(newNode.data);

		// head ==null
		// Node newNode= new Node(data,head,tail);
		/*
		 * Node constructor valu
		 */
		// for(int i=0; i<array.length; i++)
		// {
		// newNode.data=array[i];
		// newNode.next= you will place head
		//
		// }
		Node current = head;
		if (current == null) {
			head = newNode;
			//
			return ;
		}
		while (current != null) {
			if (current.data > newNode.data) {
				current.prev = newNode;
				newNode.next = current;
				
			}else
			if (current.data < newNode.data) {
				current.next = newNode;
				newNode.prev = current;
				
				//return current;
			}else
			if (current.data < newNode.data && current.next.data > newNode.data) {
				Node tmp = current.next;
				current.next = newNode;
				newNode.next = tmp;
				tmp.prev = newNode;
				newNode.prev = current;
				//return current;
			}

			current = current.next;

		}
		//System.out.println("head  "+ head.data);
		//return head;
	}

	public void print() {
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr= curr.next;
		}

	}
	public static void main(String[] args) {
		System.out.println("call");
		LinkList l = new LinkList();
		for (int i = 0; i < dataArray.length; i++) {
			l.addNode(dataArray[i]);
			l.print();
			//System.out.println("in loop");
		}
		/* b
		 * []ab= new int[]{1,2,3,4,5}; for l.addNOde(ab[i]) l.view
		 */

		// System.out.println(n.data);
	}

}
