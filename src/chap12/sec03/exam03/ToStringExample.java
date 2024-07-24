package chap12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		/*매개값이 객체가 되면 객체의 toString() 메서드를 호출해서
		 * 리턴값을 출력함
		 */
	}

}
