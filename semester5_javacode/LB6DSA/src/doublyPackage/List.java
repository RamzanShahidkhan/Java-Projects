package doublyPackage;

public class List {
	node head;
	node tail;
	int size;
	public List()
	{
		head = null;
		tail = null;
		size=0;
	}
	public void addStart(int dataa) 
    { 
    	node tmp= new node(dataa, head,null);
    	//System.out.println("data is: " + tmp.data);
    	if(head!= null)
    	{
    		head.previous=tmp;
    		head.next=tmp;
    		//System.out.println("tail  : " + tail);
    	}
    	head=tmp;
    	if(tail==null)
    	{
    		
    		tail=tmp;
    	}
    	//System.out.println("tail first fill isss :" +tail);
    	size++;
    	//System.out.println("adding elements: " + dataa);
	}

	public static void main(String[] args) {
		List listd= new List();
		//listd.addStart(10); // 34
		//listd.addStart(34);  //12
		int [] ar={12,24,45,67,34,19};
		for(int i=0; i<ar.length;i++)
		{
		listd.addStart(ar[i]);
		}
		//listd.addStart(16);   //16
		
//		System.out.println("size of list : " +listd.Size());
//		//listd.deleteMid(12);
//		System.out.println("size of list mid : " +listd.Size());
//		listd.deleteEnd();
//		System.out.println("size of list enddelete : " +listd.Size());

	}
}
