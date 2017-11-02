package Chapter3;

public class Date {
	private int month;
	private int day;
	private int year;
	// zero parameter constructor
	public Date() {
		month=1;
		day=1;
		year=2016;
	}
	// three parameters constructor
	public Date (int m, int d, int y)
	{
		month=m;
		day=d;
		year=y;
	}
	// Return true if two equal values
		public boolean equals(Object rhs)
		{
			if( !(rhs instanceof Date))
				return false;
			Date rhDate = (Date) rhs;
			return rhDate.month==month && rhDate.day==day &&
					rhDate.year == year;
		}
		//conversion to string
		public String toString()
		{
			return month+ "/"+day +"/"+year;
		}
}
