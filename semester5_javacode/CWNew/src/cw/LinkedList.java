package cw;

public class LinkedList {
	public int size = 0;
	Node head;
	Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public Node addBegin(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
		return newNode;

	}

	public Node addAtEnd(int d) {
		Node newNode = new Node(d);
		if (size == 0) {
			System.out.println("adding at end " + d);
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
		return newNode;
	}

	public void sortList(int data) {
		Node n = new Node(data);
		if (size == 0 || data <= head.data) {
			addBegin(data);
		} else if (data > tail.data) {
			addAtEnd(data);
		} else if (size > 1) {

			Node cur = head;
			while (cur != null) {
				if (data < cur.data) {
					Node tmp = cur.prev;
					tmp.next = n;
					n.prev = tmp;
					n.next = cur;
					cur.prev = n;
					size++;
					break;
				}
				cur = cur.next;
			}
		}
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		int[] dataArray = { 73, 82, 77, 84, 80, 89, 72, 71, 67, 85, 83, 81, 87, 88, 86, 75 };
		for (int i = 0; i < dataArray.length; i++) {
			l.sortList(dataArray[i]);
		}
		l.print();
	}
}
