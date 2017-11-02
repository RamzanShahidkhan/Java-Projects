
public class Echo {
	//List the command-line arguments
	public static void main(String[] args) {
		for(int i=0; i < args.length - 1; i++)
			System.out.println(args[i]+ " ");
		if(args.length!=0)
			System.out.println(args[args.length - 1]);
		else 
			System.out.println("No argument to echo");
	}

}
