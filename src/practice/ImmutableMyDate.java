package practice;

public class ImmutableMyDate {
	private final int year;
	private final int month;
	private final int day;
	
	public ImmutableMyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public ImmutableMyDate addYear(int addYear) {
		int yearResult = year + addYear;
		return new ImmutableMyDate(yearResult, month,day);
	}
	
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}
