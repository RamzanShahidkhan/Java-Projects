
public class Date {
	private int month;
	private int day ;
	private int year;
	public int getMonth() {
		return month;
	}
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String displayDate()
	{
		return month+"/"+day+"/"+year;
		
	}
	public static void main(String[] args)
	{
		Date D=new Date(05,14,2016);
		System.out.println(D.displayDate());
	}


}
