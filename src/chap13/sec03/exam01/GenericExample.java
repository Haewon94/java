package chap13.sec03.exam01;

public class GenericExample {
	
	//제네릭 메서드 boxing 을 선언
	public static <T> Box<T> Boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메서드 호출
		Box<Integer> box1 = Boxing(100);
		//T를 Integer 로 대체
		int intValue = box1.get();
		System.out.println(intValue);
		
		//제네릭 메서드 호출
		Box<String> box2 = Boxing("고말숙");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
