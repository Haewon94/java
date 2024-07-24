package chap11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception{
		//JVM이 최종적으로 예외 처리를 수행함
		//예외의 내용을 콘솔에 출력함
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}

}
