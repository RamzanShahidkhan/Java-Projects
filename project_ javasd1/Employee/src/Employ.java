
public class Employ {
	private int id;
	private String fname;
	private String lname;
	private DOB dob;
	private int salary;
	private String contactno;
	private int  DeptID;
	
	public Employ(int ID,String name, String nam,int d,int m,int y)
	{   id=ID;
		fname=name;
		lname=nam;
		dob= new DOB(d,m,y);
	}
	public boolean equals(Employ emp1 )
	{
		return(this.fname.equals(emp1.fname)&& this.id==emp1.id &&this.lname.equals(emp1.lname) 
				);
	}
//	}
//	public  boolean employee(Employ e1,Employ e2 )
//	{     
//		if(( e1.fname.equals(e2.fname)) &&( e1.lname.equals(e2.lname)))
//	     {
//		
//		    return true;
//	    }
//		else if(e1.id.equals(e2.id))
//		{
//			
//		}
//		return false;
//	}
	public static void main(String[] args)
	{
	
		Employ emp=new Employ(2,"Ali","khan",5,4,2015);
		Employ emp1=new Employ(2,"Ali","khan",5,4,2015);
		//Employ emp1=new Employ(4,"Ram","khan",7,8,1990);
		//System.out.println(emp.employee(emp1, emp));
		System.out.println(emp.equals(emp1));
	}

}
