package practice;

public class ImmutableMyDateMain {

	public static void main(String[] args) {
		ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
		System.out.println(date1);
		ImmutableMyDate date2 = date1.addYear(1);
		System.out.println(date1);
		System.out.println(date2);

	}

}
