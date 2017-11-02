package Chapter3;

public class Ticket {
	private int serialNumber;
	private static int ticketCount=0;
	
	public Ticket() {
		System.out.println("calling constructor");
		serialNumber = ++ticketCount;
	}
	public int getSerial()
	{
		return serialNumber;
	}
	public static int getTicketCount()
	{
		return ticketCount;
	}
	
	
	public static void main(String[] args) {
	Ticket t1;
	Ticket t2;
	System.out.println("Ticket count is "+ Ticket.getTicketCount());
	t1=new Ticket();
	t2= new Ticket();
	System.out.println("Ticket count is "+Ticket.getTicketCount());
	
	System.out.println(t1.getSerial());
	System.out.println(t2.getSerial());

	}

}
