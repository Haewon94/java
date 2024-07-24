package chap11.sec06;

// extends Exception(일반 예외로 선언함): 컴파일러가 체크
public class InsufficientException extends Exception{
	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
	

}
