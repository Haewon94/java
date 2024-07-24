package practice;

public class FinalFieldMain {

	public static void main(String[] args) {
		System.out.println("생성자 초기화");
		FinalLocalMain finalLocalMain1 = new FinalLocalMain(10);
		System.out.println(finalLocalMain1.value);
		//finalLocalMain1.value = 20; 컴파일 오류
		//value 값은 생성자를 통해서 한번만 초기화 가능

	}

}
