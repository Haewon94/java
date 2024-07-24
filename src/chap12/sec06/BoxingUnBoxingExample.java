package chap12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing // 기본타입 값을 포장 객체로 만드는 과정
		Integer obj = 100;
		
		//UnBoxing // 포장 객체에서 기본 타입 값을 얻어내는 과정
		int value = obj;
		System.out.println("value: "+value);
		
		//연산시 UnBoxing
		int result = obj + 100;
		System.out.println("result: "+result);

	}

}
