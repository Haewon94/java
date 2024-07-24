package chap11.sec02.exam02;

public class ExceptionHandlingExample {
	

	public static void main(String[] args) {
		try {
			//Class.forName은 ClassPath 위치에서 주어진 클래스를 찾음
			Class.forName("java.lang.String");
			//CassNotFoundException 발생 가능 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {		
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
