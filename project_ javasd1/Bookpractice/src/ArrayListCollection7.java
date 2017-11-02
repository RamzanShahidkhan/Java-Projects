import java.util.ArrayList;

public class ArrayListCollection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> items= new ArrayList<>(); 
		items.add("red");
		items.add(0,  "yellow");
		System.out.println("Display list contents with counter control loop:");
		for(int i=0; i<items.size(); i++)
		  System.out.printf("%s  ",  items.get(i));
		display("\n Display list content with enhanced loop\n",items);
		items.add("green");
		items.add("blue");
		display("\nDisplay list with two new items\n",items);
		items.remove("yellow");
		display("first item remove\n", items);
		items.remove(1);
		display("remove 2nd list element (green)\n", items);
		System.out.printf("\"red\" is %s in the list\n",items.contains("red")?" " :"not");
		System.out.printf("size:%s\n",items.size());

	}
	
	public static void display( String header,ArrayList<String> items)
	{
		System.out.print(header);
		for(String item: items)
		{
			System.out.printf("%s",item);
			System.out.println();
		}
	}

}
