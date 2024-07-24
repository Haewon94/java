package chap13.sec02.exam03;

public class Box<T> {
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
		//Object의 equals()메서드로 content 필드값을 비교함
	}
}
