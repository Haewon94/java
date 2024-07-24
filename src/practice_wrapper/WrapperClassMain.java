package practice_wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
		Integer newInteger = new Integer(10); //valueOf()사용
		Integer integerObj = Integer.valueOf(10);
		Long longObj = Long.valueOf(100);
		Double doubleObj = Double.valueOf(10.5);
		
		System.out.println("newInteger = "+newInteger);
		System.out.println("integerObj = "+integerObj);
		System.out.println("longObj = "+longObj);
		System.out.println("doubleObj = "+doubleObj);
		
		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue();
		System.out.println("intValue = "+ intValue);
	}

}
