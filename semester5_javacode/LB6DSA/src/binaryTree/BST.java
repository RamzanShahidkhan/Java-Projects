package binaryTree;

public class BST {
	
	private node root;
	
	public BST() {
		root =null;
	}
	
	public void addNode(int value)
	{
		node newnode = new node(value);
		
		if(root ==null)
		{
			root = newnode;
			return;
		}
		node current = root;
		node parent = null;
		while(true)
		{
			parent =current;
			if(value < current.data)
			{
				current =current.left;
				if(current == null)
				{
					parent.left = newnode;
					return;
				}
			}
			else
			{
				current = current .right;
				if(current ==null)
				{
					parent.right= newnode;
					return;
				}
			}
		}
		
	}
	public void display(node root)
	{
		if(root!= null)
		{
			display(root.left);
			System.out.println(" " + root.data);
			display(root.right);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println("BST class is called");
		BST b = new BST();
		//node n = new node(100);
		b.addNode(3);b.addNode(8);b.addNode(1);b.addNode(4);
		b.addNode(6);b.addNode(2);b.addNode(10);
		b.display(b.root);

	}

}
