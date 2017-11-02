package doublyPackage;

public class node
{
	int data;
	node next;
	node previous;
	public node()
	{
		data=0;
		next = null;
		previous=null;
	}
	public node(int i)
	{
		data=i;
		next = null;
		previous=null;
	}
	public node(int i,node nex,node prev)
	{
		data=i;
		next = nex;
		previous=prev;
	}
	public void display()
	{
		System.out.println("display method in node class");
		
	}
	//return the data of node element
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		/** returns the next node of this node */
		public node getNext() {
			return next;
		}
		public void setNext(node next) {
			this.next = next;
		}
		/**returns the previous node of this node   */
		public node getPrevious() {
			return previous;
		}
		public void setPrevious(node previous) {
			this.previous = previous;
		}
	
}
