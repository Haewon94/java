package practice;

public class SnackExample {

	public static void main(String[] args) {
		Snack snack1 = createSnack("닭다리",1500,300);
		Snack snack2 = createSnack("포카칩", 1700, 350);
		printSnack(snack1);
		printSnack(snack2);
		
		
		
		

	}
	
	public static Snack createSnack(String name, int price, int cal) {
		Snack snack = new Snack();
		snack.name = name;
		snack.price = price;
		snack.cal = cal;
		return snack;
	}
	
	public static Snack printSnack(Snack snack1) {
		System.out.println("과자이름: "+snack1.name+" 가격: "+snack1.price+" 칼로리: "+snack1.cal);
		return snack1;
	}
	
	
}
