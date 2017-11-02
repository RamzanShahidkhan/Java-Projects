
public class Enum {
     enum WorkDay{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY};
	public static void main(String[] args) {
		WorkDay[] day=WorkDay.values();
		for(int i=0; i<day.length; i++)
		{
			System.out.println("days are " +day[i]);
		}
		
		
     // System.out.println(SDay.valueOf("MONDAY"));
     // System.out.println(WorkDay.values());
	}

}
