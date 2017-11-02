package myTree;

public class Bstree {
	private nodee root;

	public Bstree() {
		root=null;
	}
	public void addNodee(int value)
	{
		nodee newnod = new nodee(value);
		if(root == null)
		{
			root=newnod;
			return;
		}
		nodee curr=root;
		nodee parent = null;
		while(true)
		{
			parent =curr;
			if(value >curr.dataa )
			{
				curr= curr.right;
				if(curr == null)
				{
					parent.right =newnod;
					return;
				}
			}
			else //if( value < curr.dataa)
			{
				curr=curr.left;
				if(curr==null)
				{
					parent.left =newnod;
					return;
				}
			}		
		}	
	}
	public void deleteNode(int val)
	{
		nodee nod= new nodee(val);
		
	}
	public void display(nodee root)
	{
		if(root!=null)
		{
			display(root.left);
			System.out.println(" " +root.dataa );
			display(root.right);
		}

	}
	public static void main(String [] args)
	{
		System.out.println("Bstree is called::");
		Bstree bst = new Bstree();
		bst.addNodee(3);bst.addNodee(8);bst.addNodee(1);bst.addNodee(4);
		bst.addNodee(6);bst.addNodee(2);bst.addNodee(10);
		bst.display(bst.root);
	}
}
