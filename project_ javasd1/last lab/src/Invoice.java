
public class Invoice {
	
	private String partnum;
	private String description;
	private int purchesed;
	private double ppitem;
	

	public Invoice(String num, String description, int purchesed, double item)
	{  
		partnum = num;
		this.description = description;
		setPurchesed(purchesed);
		setPpitem(item);
	}


	public String getPartnum() {
		return partnum;
	}


	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPurchesed() {
		return purchesed;
	}


	public void setPurchesed(int purchesed) {
	if(purchesed<0)
	{
		this.purchesed=0;
	}
	else
		this.purchesed=purchesed;
 
		
	}
	public double getPpitem() {
		return ppitem;
	}


	public void setPpitem(double item) {
		if(item<0)
		{
			return;
		}
		else
			
		  ppitem=item;
	}
   public double getInvoiceAmount()
   {
	  return  getPurchesed()* getPpitem();
	 
   }
 public static void main(String[] args) {
		
     Invoice B=new Invoice("jashan", "cheap ",8,4);
     System.out.println("part num is "  +B.getPartnum());
     System.out.println("discription is "  +B.getDescription());
     System.out.println("quantity purchase   "+B.getPurchesed());
     System.out.println("Price per item is "+B.getPpitem());
     System.out.println("total amount is " +B.getInvoiceAmount());
	}
	
}
