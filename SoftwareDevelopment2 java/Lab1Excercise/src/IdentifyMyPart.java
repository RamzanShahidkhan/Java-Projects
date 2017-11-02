
public class IdentifyMyPart {
	public static int x=7;  //what are the class variable and instant variable ?
	public int y=3;
	

	public static void main(String[] args) {
		IdentifyMyPart a=new IdentifyMyPart();
		IdentifyMyPart b=new IdentifyMyPart();
		a.y=5;
		b.y=6;
		a.x=1;
		b.x=2;
		System.out.println("a.y " + a.y);
		System.out.println("b.y " + b.y);
		System.out.println("a.x " + a.x);
		System.out.println("b.x " + b.x);
	    System.out.println("identitifyMyPart.x =  " + IdentifyMyPart.x);
		

	}

}
